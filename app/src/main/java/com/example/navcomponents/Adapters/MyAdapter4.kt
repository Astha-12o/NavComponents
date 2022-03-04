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

class MyAdapter4(): RecyclerView.Adapter<MyAdapter4.MyViewHolder4>() {

    private var title4 = arrayOf("2013001","2013002","2013003","2013004","2013005","2013006","2013007","2013008","2013009","2013010","2013011","2013012","2013013","2013014","2013015","2013016","2013017")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder4 {

        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.items,parent,false)
        return MyViewHolder4(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder4, @SuppressLint("RecyclerView") position: Int) {
        holder.title4.text =title4[position]
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
        return title4.size
    }

    class MyViewHolder4(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title4=itemView.findViewById<TextView>(R.id.text3)
    }
}