package com.example.listapaises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import com.example.listapaises.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var  binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        var arrayAdapter: ArrayAdapter<*>

        val paises = mutableListOf("Argentina", "Paraguay",
            "Bolivia","Peru","Ecuador","Brasil","Colombia","Venezuela","Uruguay")
        //val list1 = findViewById<ListView>(R.id.list1)
        val list1 = binding.list1

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,paises)
        list1.adapter = arrayAdapter

        //acciones
        //val text1 = findViewById<TextView>(R.id.text1)
        val text1 = binding.text1
        list1.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = paises[position]

            if (selectedItem == "Argentina")  text1.text = "En Argentina hay 30.000.000 de habitantes"
            if (selectedItem == "Paraguay")  text1.text = "En Paraguay hay 7.000.000 de habitantes"
            if (selectedItem == "Bolivia")  text1.text = "En Bolivia hay hay 15.000.000 de habitantes"
            if (selectedItem == "Peru")  text1.text = "En Peru hay 25.000.000 de habitantes"
            if (selectedItem == "Ecuador")  text1.text = "En Ecuador hay 6.000.000 de habitantes"
            if (selectedItem == "Brasil")  text1.text = "En Brasil hay 80.000.000 de habitantes"
            if (selectedItem == "Colombia")  text1.text = "En Colombia hay 26.000.000 de habitantes"
            if (selectedItem == "Venezuela")  text1.text = "En Venezuela hay 32.000.000 de habitantes"
            if (selectedItem == "Uruguay")  text1.text = "En Uruguay hay 8.000.000 de habitantes"

        }

    }
}