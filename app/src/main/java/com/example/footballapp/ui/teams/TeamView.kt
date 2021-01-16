package com.example.footballapp.ui.teams

import com.example.footballapp.model.LeagueResponse
import com.example.footballapp.model.Team

interface TeamView {
    fun showLoading()
    fun hideLoading()
    fun showLeagues(data: LeagueResponse)
    fun showTeams(data: List<Team>)
    fun errorLoading(e: String?)
}