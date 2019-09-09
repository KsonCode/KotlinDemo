package com.bwie.kotlindemo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.bwie.kotlindemo.R

class MyAdapter(context: Context,list: ArrayList<String>):BaseAdapter() {
    private var context:Context?  = null
    private var list:List<String> ? = null
//    public fun MyAdapter(context: Context,list: ArrayList<String>){
//        this.context = context
//        this.list = list
//    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View = LayoutInflater.from(context).inflate(R.layout.activity_main,parent,false)

        return view
    }

    override fun getItem(position: Int): Any {

       return list!![position]


    }

    override fun getItemId(position: Int): Long {

        return position.toLong()

    }

    override fun getCount(): Int {

        return list!!.size

    }
}