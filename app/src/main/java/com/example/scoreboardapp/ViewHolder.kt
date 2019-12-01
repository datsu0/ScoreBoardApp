package com.example.scoreboardapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(item_view: View): RecyclerView.ViewHolder(item_view){
    val textView = item_view.findViewById<TextView>(R.id.textView)
}