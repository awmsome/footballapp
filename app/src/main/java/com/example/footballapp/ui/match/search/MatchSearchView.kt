package com.example.footballapp.ui.match.search

import android.view.Menu
import android.view.MenuInflater
import com.example.footballapp.model.Match

interface MatchSearchView {
    fun showLoading()
    fun hideLoading()
    fun showSearchResult(data: List<Match>)
    fun errorLoading(e: String?)
    fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?)
}