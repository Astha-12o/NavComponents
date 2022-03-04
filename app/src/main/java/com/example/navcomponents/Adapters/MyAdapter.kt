package com.example.navcomponents.Adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.navcomponents.FragmentNew
//import com.example.navcomponents.Fragments.FragmentNew
import com.example.navcomponents.R

class MyAdapter(): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private var title= arrayOf("2012001","2012002","2012003","2012004","2012005","2012006","2012007","2012008","2012009","2012010","2012011","2012012","2012013","2012014","2012015","2012016",)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.items,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, @SuppressLint("RecyclerView") position: Int) {
        holder.title.text = title[position]
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
        return title.size
    }
    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        var title = itemView.findViewById<TextView>(R.id.textv)
    }
}
