package edu.cvr.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var person:ArrayList<Person>):RecyclerView.Adapter<MyAdapter.MyView>() {
    class MyView(val view: View):RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.name)
        val status = view.findViewById<TextView>(R.id.status)
        val img = view.findViewById<ImageView>(R.id.img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        var layout = LayoutInflater.from(parent.context).inflate(R.layout.list_items,parent,false)
        return MyView(layout)
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        holder.name.text = person[position].name
        holder.status.text = person[position].status
        holder.img.setImageResource(person[position].photo)
    }

    override fun getItemCount(): Int {
        return person.size
    }
}