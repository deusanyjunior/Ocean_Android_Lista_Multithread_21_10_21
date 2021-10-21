package com.oceanbrasil.android.ocean_android_lista_multithread_21_10_21

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ItemAdapter (
    val itens: List<Persona>
    ) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
        fun bindView(item: Persona) {
            val tvTitulo = itemView.findViewById<TextView>(R.id.tvTitulo)
            val imagem = itemView.findViewById<ImageView>(R.id.imagem)
            val btAcao = itemView.findViewById<Button>(R.id.btAcao)

            tvTitulo.text = item.nome
            // Com Atenas
            Glide.with(itemView).load(item.imagemUrl).into(imagem)
            // Com Sparta
            // - Fazer o download da imagem (baixar a partir da URL)
            // - Tratar problemas de download (atraso, reconexão, perda de bits)
            // - Atribuir a imagem baixada à variável
            // val imagemSparta = URL(item.imagemUrl)
            //    ...
            // imagem.setImageBitmap()...

            btAcao.setOnClickListener {
                Toast.makeText(itemView.context,item.acao,Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itens[position]
        holder.bindView(item)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}