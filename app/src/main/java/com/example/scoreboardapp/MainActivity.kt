package com.example.scoreboardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler_view = findViewById<RecyclerView>(R.id.recycler_list)
        //RecyclerViewを利用する時は必ずlayoutManagerを指定する
        //指定しないと例えadapterをセットしてもUIに反映されない。というかadapterのコールバックが呼ばれない
        recycler_view.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        
        // adapterのセット
        // RecycleViewのadapterはRecyclerView.Adapterの抽象メソッドを実装する
        recycler_view.adapter = object : RecyclerView.Adapter<ViewHolder>(){
            //ViewHodlerの生成
            override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
                val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent,false)
                return ViewHolder(itemView)
            }
            //ViewHodlerで保持しているviewに対して値をセット
            override fun onBindViewHolder(holder: ViewHolder, p1: Int) {
                holder.textView.setText( p1.toString())
            }
            //RecycleViewに配置するitem数
            override fun getItemCount(): Int {
                return 5
            }
        }


    }
}