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

class MyAdapter5(): RecyclerView.Adapter<MyAdapter5.MyViewHolder5>() {

    private var title5 = arrayOf("2011001","2011002","2011003","2011004","2011005","2011006","2011007","2011008","2011009","2011010","2011011","2011012","2011013","2011014","2011015","2011016","2011017")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder5 {

        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.items,parent,false)
        return MyViewHolder5(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder5, @SuppressLint("RecyclerView") position: Int) {
        holder.title5.text =title5[position]
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
        return title5.size
    }

    class MyViewHolder5(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title5=itemView.findViewById<TextView>(R.id.text4)
    }
}