package com.example.newsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val adapter: NewsListAdapter by lazy { NewsListAdapter() }
    private val newsList = listOf<News>(
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdasfhofjf", "dskgjjfhsdjf"),
        News("askasfasfasdfjjkhfs", "kdfjsgsdgsdgfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("asdfgdsgsadgskdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askasfsafdfjjkhfs", "kdfjsfhjdsfhsdfsdgsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsasfasrfsafhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdsdgsdgsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("agsdgsdgskdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdasdfsaffjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdssdgsdgsdfhsdhofjf", "dskgjjfhsdjf"),
        News("askdfjjkhfs", "kdfjsfhjdsfhsdhofjf", "dskgjjfhsdjf")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        news_list.layoutManager = LinearLayoutManager(this)
        news_list.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
        news_list.adapter = adapter
        adapter.updaterItems(newsList)
    }
}
