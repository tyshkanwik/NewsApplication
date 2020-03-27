package com.example.newsapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_news.view.*

class NewsListAdapter : RecyclerView.Adapter<NewsListAdapter.ViewHolder>() {

    private val newsList = mutableListOf<News>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = newsList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = newsList[position]
        holder.bindView(item)
    }

    fun updaterItems(list: List<News>) {
        newsList.clear()
        newsList.addAll(list)
        notifyDataSetChanged()
    }

    inner class ViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer {

        fun bindView(item: News) {
            containerView.news_title.text = item.title
            containerView.news_text.text = item.text
            containerView.news_author.text = item.author
        }

    }
}