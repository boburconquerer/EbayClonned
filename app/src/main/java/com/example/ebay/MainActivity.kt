package com.example.ebay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.ArrayRes
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var recyclerView2: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        refreshData(data())


        recyclerView2= findViewById(R.id.recyclerView2)
        recyclerView2.layoutManager = GridLayoutManager(this,3)

        refreshData2(data2())
    }

    private fun data2(): ArrayList<Model2> {
        val list2 = ArrayList<Model2>()
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))
        list2.add(Model2("Iphone",R.drawable.iphone))

        return list2
    }

    private fun refreshData2(data2: ArrayList<Model2>) {
        val adapter2 = Adapter2(data2)
        recyclerView2.adapter = adapter2
    }

    private fun data(): ArrayList<Model> {
        val list = ArrayList<Model>()
        list.add(Model("MacBook Air", R.drawable.mac))
        list.add(Model("MacBook Air", R.drawable.mac))
        list.add(Model("MacBook Air", R.drawable.mac))
        list.add(Model("MacBook Air", R.drawable.mac))
        list.add(Model("MacBook Air", R.drawable.mac))
        list.add(Model("MacBook Air", R.drawable.mac))
        list.add(Model("MacBook Air", R.drawable.mac))
        list.add(Model("MacBook Air", R.drawable.mac))
        list.add(Model("MacBook Air", R.drawable.mac))
        list.add(Model("MacBook Air", R.drawable.mac))
        return list
    }

    private fun refreshData(data: ArrayList<Model>) {
        val adapter = Adapter(data)
        recyclerView.adapter = adapter
    }
}