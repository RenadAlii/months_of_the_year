package com.example.scrol.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.scrol.R
import com.example.scrol.model.Months

class ItemAdapter(private val context: Context,
                  private val dataSet: List<Months>
                  ) : RecyclerView.Adapter <ItemAdapter.ItemViewHolder>()
{

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textView: TextView =view.findViewById(R.id.item_title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //crete new view
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.llist_item,parent,false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textView.text = context.resources.getString(item.stringId)
    }

    override fun getItemCount(): Int {
       return dataSet.size
    }





}