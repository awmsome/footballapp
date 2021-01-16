package com.example.footballapp.ui.teams.player

import com.google.gson.Gson
import com.example.footballapp.api.ApiRepository
import com.example.footballapp.api.TheSportDBApi
import com.example.footballapp.model.PlayerResponse
import com.example.footballapp.util.CoroutineContextProvider
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class PlayersPresenter(private val view: PlayersView,
                       private val apiRepository: ApiRepository,
                       private val gson: Gson,
                       private val coroutinesCtx: CoroutineContextProvider = CoroutineContextProvider()) {

    fun getPlayers(teamId: String?) = GlobalScope.launch(coroutinesCtx.main) {
        view.showLoading()

        val data = makeRequest(TheSportDBApi.getPlayers(teamId))

        try {
            view.showPlayers(data.await().player)
        } catch (e: Throwable) {
            view.errorLoading(e.localizedMessage)
            e.printStackTrace()
        }

        view.hideLoading()
    }

    private fun makeRequest(url: String) = GlobalScope.async(coroutinesCtx.io) {
        gson.fromJson(apiRepository.doRequest(url),
                PlayerResponse::class.java)

    }
}