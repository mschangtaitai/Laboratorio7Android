package com.example.laboratorio7android

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem

class ProductosInventario : AppCompatActivity() {

    var tittle: String = "Apples"

    private var tittles = arrayListOf<String>()
    private var cants = arrayListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (intent.getStringExtra("Tittle") != null) {
            tittle = intent.getStringExtra("Tittle")
            println(tittle)

            tittles.add(tittle)
            cants.add(0)
        }

        tittles.add("Apples")
        cants.add(0)

        tittles.add("Oranges")
        cants.add(0)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        val adapter = RecyclerViewAdapter(tittles,cants,this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
