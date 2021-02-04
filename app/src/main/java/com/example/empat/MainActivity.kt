package com.example.empat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.language_item_layout.*

class MainActivity : AppCompatActivity() {

    val languageViewModel by viewModels<LanguageViewModel>()
    lateinit var languageRecyclerAdapter: LanguageRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvLanguage.layoutManager = LinearLayoutManager(this)
        languageRecyclerAdapter = LanguageRecyclerAdapter(languageViewModel.languageLiveData.value())
        rvLanguage.adapter = languageRecyclerAdapter
        languageViewModel.languageLiveData.observe(this, Observer { languageRecyclerAdapter.notifyDataSetChanged() })

    }



    fun btnAdd(view: View){
        val languageName = tvLanguage.text.toString()
        languageViewModel.addLanguage(languageName)
    }
}