package com.example.is_hw6_month3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.is_hw6_month3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var list: ArrayList<String>
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter :TextAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        adapter = TextAdapter(list)
        binding.rv.adapter = adapter

    }

    private fun loadData() {
        list = ArrayList()
        list.add("text")
        list.add("text")
        list.add("text")
        list.add("text")
        list.add("text")
        list.add("text")
        list.add("text")
        list.add("text")
        list.add("text")
        list.add("text")
        list.add("text")
        list.add("text")
        list.add("text")
        list.add("text")
    }
}