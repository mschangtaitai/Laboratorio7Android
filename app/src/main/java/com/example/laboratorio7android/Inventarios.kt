package com.example.laboratorio7android

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import org.jetbrains.annotations.Nullable


class Inventarios : Fragment() {
    companion object {
        fun newInstance() = Inventarios()
    }

    private lateinit var viewModel: InventariosViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.inventarios_fragment, container, false)

        //val recyclerView: RecyclerView = viewModel.recyclerView(R.id.recycler_view)
        //val adapter = InventariosViewAdapter(InventariosViewModel, this)
        //recyclerView.adapter = adapter
        //recyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(InventariosViewModel::class.java)
        viewModel.getInventario().observe(this, Observer<List<String>> {
            @Override
            fun onChanged(@Nullable inventarios: List<String> ){
                InventariosViewAdapter
            }
        })
    }

}
