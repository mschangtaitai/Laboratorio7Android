package com.example.laboratorio7android

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import android.widget.RelativeLayout
import android.widget.TextView

import java.util.ArrayList

class ProductosViewAdapter(
    private val tittles: ArrayList<String>
) : RecyclerView.Adapter<ProductosViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.inventarios_listitem, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        Log.d(TAG, "onBindViewHolder: called")

        viewHolder.tittle.text = tittles[i]
    }

    override fun getItemCount(): Int {
        return tittles.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var tittle: TextView = itemView.findViewById(R.id.item_tittle)
        //internal var parentLayout: RelativeLayout = itemView.findViewById(R.id.parent_layout)

    }

    companion object {

        private const val TAG = "RecyclerViewAdapter"
    }
}
