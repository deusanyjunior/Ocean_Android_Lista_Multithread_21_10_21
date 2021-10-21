package com.oceanbrasil.android.ocean_android_lista_multithread_21_10_21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Layout Manager
        val rvPessoas = findViewById<RecyclerView>(R.id.rvPessoas)
        rvPessoas.layoutManager = LinearLayoutManager(this)

        // Adapter
    }
}