package dev.shabinder.intern

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.shabinder.intern.R

class Adapter(private val list:List<String>):RecyclerView.Adapter<ViewHolder>() {

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val textView  = LayoutInflater.from(parent.context).inflate(R.layout.text_viewholder,parent,false)
        return ViewHolder(textView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.textView.text = item
    }

}