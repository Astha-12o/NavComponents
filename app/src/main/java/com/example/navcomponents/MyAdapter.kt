package com.example.navcomponents

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_main.view.*

class MyAdapter(): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private var title= arrayOf("2012001","2012002","2012003","2012004","2012005","2012006","2012006","2012007","2012008","2012009","2012010","2012011","2012012","2012013","2012014","2012015","2012016",)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.items,parent,false)

        return MyViewHolder(view)


    }

    override fun onBindViewHolder(holder: MyViewHolder, @SuppressLint("RecyclerView") position: Int) {
        //holder.Image.setImageResource(Image[position])
        holder.title.text = title[position]




    }
    override fun getItemCount(): Int {
        return title.size
    }
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //var Image = itemView.findViewById<ImageView>(R.id.imagev)
        var title = itemView.findViewById<TextView>(R.id.textv)


    }
}
