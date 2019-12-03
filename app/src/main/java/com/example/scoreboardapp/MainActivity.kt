package com.example.scoreboardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataList:ArrayList<String> = arrayListOf("新しいゲーム","前回","２回前","３回前")
        val recyclerAdapter = RecyclerAdapter(dataList)

        val recycler_view = findViewById<RecyclerView>(R.id.recycler_list)
        val adapter = RecyclerAdapter(dataList)
        //RecyclerViewを利用する時は必ずlayoutManagerを指定する
        //指定しないと例えadapterをセットしてもUIに反映されない。というかadapterのコールバックが呼ばれない
        recycler_view.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        recycler_view.adapter = adapter
        // adapterのセット
        // RecycleViewのadapterはRecyclerView.Adapterの抽象メソッドを実装する
        adapter.setOnItemClickListener(object : RecyclerAdapter.OnItemClickListener {
            override fun onClick(view: View, data: String) {
                Toast.makeText(applicationContext, "aaaaa", Toast.LENGTH_LONG).show()
            }
        })



    }
}