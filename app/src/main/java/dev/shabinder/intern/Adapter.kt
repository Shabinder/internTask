package dev.shabinder.intern

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.shabinder.intern.R

class Adapter(private val list:List<String>? = null):RecyclerView.Adapter<ViewHolder>() {

    override fun getItemCount(): Int = list?.size ?: 10

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val textView  = LayoutInflater.from(parent.context).inflate(R.layout.offer_item,parent,false)
        return ViewHolder(textView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list?.get(position)
        /*
        * Implementation Pending
        * */
    }

}