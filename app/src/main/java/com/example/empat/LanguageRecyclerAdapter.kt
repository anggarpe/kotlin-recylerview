package com.example.empat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LanguageRecyclerAdapter(
    private val languageList: MutableList<String>
) : RecyclerView.Adapter<LanguageViewHolder>() {


    //untuk link antara xml dengan class.kt
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.language_item_layout, parent, false)
        return LanguageViewHolder(view)
    }

    override fun getItemCount(): Int = languageList.size

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.textNumber.text = position.toString()
        holder.textLanguage.text = languageList[position]
        holder.itemView.setOnClickListener(holder)
    }

}

//class untuk layout language_item_layout
//custom layout
class LanguageViewHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

    lateinit var  textNumber : TextView
    lateinit var textLanguage: TextView


    override fun onClick(v: View?) {

    }

}
