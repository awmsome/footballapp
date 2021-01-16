package com.example.footballapp.ui.match.last

import com.example.footballapp.model.LeagueResponse
import com.example.footballapp.model.Match

interface LastMatchView {
    fun showLoading()
    fun hideLoading()
    fun showLeagues(data: LeagueResponse)
    fun showMatches(data: List<Match>)
    fun errorLoading(e: String?)
}