package com.example.navcomponents.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navcomponents.R
import kotlinx.android.synthetic.main.fragment_a.view.*
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*


/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view= inflater.inflate(R.layout.fragment_main, container, false)

        view.fragmentAbtn.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragmentA) }
        view.fragmentBbtn.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragmentB) }
        view.fragmentCbtn.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragmentC) }
        view.fragmentDbtn.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragmentD) }
        view.fragmentEbtn.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragmentE) }
        view.fragmentFbtn.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragmentF) }


        return view
    }


    }

