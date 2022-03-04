package com.example.navcomponents.Adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.navcomponents.FragmentNew
import com.example.navcomponents.R

class MyAdapter2(): RecyclerView.Adapter<MyAdapter2.MyViewHolder2>() {

    private var title2 = arrayOf("2014001","2014002","2014003","2014004","2014005","2014006","2014007","2014008","2014009","2014010","2014011","2014012","2014013","2014014","2014015","2014016","2014017")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder2 {

        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.items,parent,false)
        return MyViewHolder2(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder2, @SuppressLint("RecyclerView") position: Int) {
        holder.title2.text =title2[position]
        holder.itemView.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val activity = v!!.context as AppCompatActivity
                val mainFragment = FragmentNew()
                activity.supportFragmentManager.beginTransaction()
                    .replace(R.id.rec, mainFragment).addToBackStack(null).commit()
            }
        })
    }

    override fun getItemCount(): Int {
        return title2.size
    }

    class MyViewHolder2(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title2=itemView.findViewById<TextView>(R.id.text1)
    }
}