package com.bwie.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.bwie.kotlindemo.adapter.MyAdapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit

class MainActivity : AppCompatActivity(), View.OnClickListener {

//   lateinit var user:User
//    lateinit var tv:TextView

    /**
     *
     */
    override fun onClick(v: View?) {


        when (v!!.id) {

            R.id.btn1 -> {
                Toast.makeText(this, "btns", Toast.LENGTH_SHORT).show()
            }

            R.id.btn2 -> {

            }

        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {

        tv.text = "hello newww"
        btn1.setOnClickListener(this)

        btn2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                this@MainActivity.finish()

            }

        })

        val list:ArrayList<String> = ArrayList<String>()

        lv.adapter = MyAdapter(this,list)




    }


}
