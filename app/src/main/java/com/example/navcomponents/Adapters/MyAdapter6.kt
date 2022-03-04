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

class MyAdapter6(): RecyclerView.Adapter<MyAdapter6.MyViewHolder6>() {

    private var title6 = arrayOf("2016001","2016002","2016003","2016004","2016005","2016006","2016007","2016008","2016009","2016010","2016011","2016012","2016013","2016014","2016015","2016016","2016017")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder6 {

        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.items,parent,false)
        return MyViewHolder6(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder6, @SuppressLint("RecyclerView") position: Int) {
        holder.title6.text =title6[position]
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
        return title6.size
    }

    class MyViewHolder6(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title6=itemView.findViewById<TextView>(R.id.text5)
    }
}