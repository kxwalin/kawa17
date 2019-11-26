package com.example.foodmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var recycleView : RecyclerView? = null
    var foodMenuText = arrayOf(
        "Apple",
        "Banana",
        "Coconut",
        "Grape",
        "Mango",
        "Orange",
        "Strawberry",
        "Cherry",
        "Lychee",
        "Pomegranate",
        "Rambutan",
        "Rose apple",
        "Mangosteen")
    var foodMenuImage = arrayOf<Int>(
        R.drawable.apple,
        R.drawable.banana,
        R.drawable.coconut,
        R.drawable.grape,
        R.drawable.mango,
        R.drawable.orange,
        R.drawable.strawberry,
        R.drawable.cherry,
        R.drawable.lychee,
        R.drawable.pomegranate,
        R.drawable.rambutan,
        R.drawable.roseapple,
        R.drawable.mangosteen
    )
   var context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleView = findViewById(R.id.menuRecycleView) as RecyclerView
        recycleView!!.layoutManager = LinearLayoutManager(context)
        recycleView!!.setLayoutManager(GridLayoutManager(context,2))
        var myAdapter = MyAdapterRecycleView(foodMenuText,foodMenuImage,context)
        recycleView!!.adapter = myAdapter
    }
}
