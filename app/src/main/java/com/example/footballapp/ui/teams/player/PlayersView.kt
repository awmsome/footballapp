package com.example.footballapp.ui.teams.player

import com.example.footballapp.model.Player

interface PlayersView {
    fun showLoading()
    fun hideLoading()
    fun showPlayers(data: List<Player>)
    fun errorLoading(e: String?)
}