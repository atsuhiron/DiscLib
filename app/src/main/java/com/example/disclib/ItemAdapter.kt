package com.example.disclib

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.disclib.model.DiscRecord

class ItemAdapter: RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    
    val discDate = listOf<DiscRecord>(
        DiscRecord(0, "D1", "some movie 1"),
        DiscRecord(1, "D1", "some movie 2"),
        DiscRecord(2, "D2", "some movie 3"),
        DiscRecord(3, "D2", "some movie 4"),
        DiscRecord(4, "D3", "some movie 5"),
        DiscRecord(5, "D3", "some movie 6"),
    )

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val movIndex: TextView
        val discId: TextView
        val movName: TextView
        val updated: TextView
        init {
            movIndex = view.findViewById(R.id.mov_index)
            discId = view.findViewById(R.id.disc_id)
            movName = view.findViewById(R.id.mov_name)
            updated = view.findViewById(R.id.updated)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.disc_record_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val item = discDate[position]
        viewHolder.movIndex.text = item.movieIndex.toString()
        viewHolder.discId.text = item.discId
        viewHolder.movName.text = item.movieName
        viewHolder.updated.text = item.updated.toString()
    }

    override fun getItemCount() = discDate.size
}