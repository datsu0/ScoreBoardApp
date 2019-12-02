package com.example.scoreboardapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val itemList:ArrayList<String>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent,false)
        return ViewHolder(itemView)
    }
    //ViewHodlerで保持しているviewに対して値をセット
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.setText(itemList[position].toString())
        //holder.textView.setText( p1.toString())
    }
    //RecycleViewに配置するitem数
    override fun getItemCount(): Int {
        return itemList.size
        //return 5
    }

    lateinit var listener: AdapterView.OnItemClickListener
    fun setOnItemClickListener(listener: AdapterView.OnItemClickListener){
        this.listener = listener
    }

}