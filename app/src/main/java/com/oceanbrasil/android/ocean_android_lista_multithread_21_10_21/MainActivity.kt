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
        val elvis = Persona(
            "Elvis Presley",
            "https://gpslifetime.com.br/uploads/content_manager/contents/58931/image/graceland-mansao-de-elvis-presley-ja-tem-data-de-reabertura-45c3.png",
            "Rei do Rock!")
        val michael = Persona(
            "Michael Jackson",
            "https://e-cdn-images.dzcdn.net/images/artist/86b13342a65ffe06fa151ce353a7b278/264x264-000000-80-0-0.jpg",
            "Rei do Pop!")
        val pele = Persona(
            "Pelé",
            "https://www.gazetaesportiva.com/wp-content/uploads/imagem/2020/04/24/url-906x1024.jpeg",
            "Rei do Futebol!")

        val itens = listOf(elvis,michael,pele)

        rvPessoas.adapter = ItemAdapter(itens)

    }
}