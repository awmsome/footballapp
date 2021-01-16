package com.example.footballapp.ui.match.next

import com.example.footballapp.model.LeagueResponse
import com.example.footballapp.model.Match

interface NextMatchView {
    fun showLoading()
    fun hideLoading()
    fun showLeagues(data: LeagueResponse)
    fun showMatches(data: List<Match>)
    fun errorLoading(e: String?)
}