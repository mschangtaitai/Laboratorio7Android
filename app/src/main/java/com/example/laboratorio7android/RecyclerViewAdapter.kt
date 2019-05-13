package com.example.laboratorio7android

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
//import android.widget.RelativeLayout
import android.widget.TextView

import java.util.ArrayList

class RecyclerViewAdapter(
    private val tittles: ArrayList<String>,
    private val cants: ArrayList<Int>,
    private val context: Context
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.layout_listitem, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        Log.d(TAG, "onBindViewHolder: called")

        viewHolder.tittle.text = tittles[i]
        viewHolder.cant.text = cants[i].toString()

        viewHolder.addButton.setOnClickListener {
            cants[i] = cants[i] + 1
            viewHolder.cant.text = cants[i].toString()
        }

        viewHolder.subButton.setOnClickListener {
            cants[i] = cants[i] - 1
            viewHolder.cant.text = cants[i].toString()
        }
    }

    override fun getItemCount(): Int {
        return tittles.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var tittle: TextView = itemView.findViewById(R.id.item_tittle)
        internal var cant: TextView = itemView.findViewById(R.id.cant_item)
        internal var addButton: Button = itemView.findViewById(R.id.imageButtonAdd)
        internal var subButton: Button = itemView.findViewById(R.id.imageButtonSub)
        //internal var parentLayout: RelativeLayout = itemView.findViewById(R.id.parent_layout)

    }

    companion object {

        private const val TAG = "RecyclerViewAdapter"
    }
}
