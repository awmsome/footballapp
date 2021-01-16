package com.example.footballapp.ui.favorite.team

import com.example.footballapp.model.Team

interface FavoriteTeamView {
    fun showLoading()
    fun hideLoading()
    fun showFavorite(favorites: List<Team>)
    fun errorLoading(e: String?)
}