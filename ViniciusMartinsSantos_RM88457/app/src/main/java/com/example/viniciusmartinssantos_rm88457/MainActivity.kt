package com.example.viniciusmartinssantos_rm88457

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viniciusmartinssantos_rm88457.databinding.ActivityMainBinding
import com.example.viniciusmartinssantos_rm88457.model.ItemObject

class MainActivity : AppCompatActivity() {lateinit var dataBind: ActivityMainBinding
    val listeItemAdapter = ListeItemAdapter()
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(dataBind.root)

        criaRecycler()

        dataBind.addItem.setOnClickListener(){
            listeItemAdapter.AddListItem(ItemObject("valor auto$count", "Descrição conteudo gerado auto$count"))
            count++
        }

    }

    private fun criaRecycler() {
        dataBind.lista.layoutManager = LinearLayoutManager(this)

        val conteudo = mutableListOf<ItemObject>()

        conteudo.add(ItemObject("valor 1", "descrição do conteudo 1 "))
        conteudo.add(ItemObject("valor 2", "descrição do conteudo 2 "))
        conteudo.add(ItemObject("valor 3", "descrição do conteudo 3 "))
        conteudo.add(ItemObject("valor 4", "descrição do conteudo 4 "))

        listeItemAdapter.setItensList(conteudo)

        dataBind.lista.adapter = listeItemAdapter


    }
}