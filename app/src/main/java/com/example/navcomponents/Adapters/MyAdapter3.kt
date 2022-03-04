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

class MyAdapter3(): RecyclerView.Adapter<MyAdapter3.MyViewHolder3>() {

    private var title3 = arrayOf("2015001","2015002","2015003","2015004","2015005","2015006","2015007","2015008","2015009","2015010","2015011","2015012","2015013","2015014","2015015","2015016","2015017")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder3 {

        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.items,parent,false)
        return MyViewHolder3(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder3, @SuppressLint("RecyclerView") position: Int) {
        holder.title3.text =title3[position]
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
        return title3.size
    }

    class MyViewHolder3(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title3=itemView.findViewById<TextView>(R.id.text2)
    }
}