package com.example.navcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_a.view.*
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*
import kotlinx.android.synthetic.main.items.view.*


class FragmentA : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_a, container, false)
        if (view is RecyclerView) {
            with(view) {
                layoutManager = LinearLayoutManager(context)
                adapter = MyAdapter()
            }
            view.Cview.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_fragmentA_to_fragmentNew) }
        }
        return view
    }
}
       /* return view

        private var layoutManager: RecyclerView.LayoutManager?=null
    private var adapter: RecyclerView.Adapter<MyAdapter.MyViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        layoutManager = LinearLayoutManager(fragment)

        recyclerView.layoutManager = layoutManager

        adapter = MyAdapter()
        recyclerView.adapter = adapter
    }*/








