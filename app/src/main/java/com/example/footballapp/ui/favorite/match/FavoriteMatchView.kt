package com.example.footballapp.ui.favorite.match

import com.example.footballapp.model.Match

interface FavoriteMatchView {
    fun showLoading()
    fun hideLoading()
    fun showFavorite(favorites: List<Match>)
    fun errorLoading(e: String?)
}