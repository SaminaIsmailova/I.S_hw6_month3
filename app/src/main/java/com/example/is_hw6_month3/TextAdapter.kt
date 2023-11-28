package com.example.is_hw6_month3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.is_hw6_month3.databinding.ItemTextBinding

class TextAdapter(private val list: ArrayList<String>): Adapter<TextAdapter.TextViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        return TextViewHolder(ItemTextBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int =list.size

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
    holder.bind(list[position])
    }


    inner class TextViewHolder(private  var binding: ItemTextBinding):ViewHolder(binding.root){
        fun bind(text:String){
            binding.tv.text = text.toString()
        }
    }
}