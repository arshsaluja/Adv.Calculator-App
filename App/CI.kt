package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_c_i.*
import kotlinx.android.synthetic.main.activity_c_i.view.*

class CI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c_i)
        OnCLick()
    }

    var amt: EditText? = null
    var interest: EditText? = null
    var time: EditText? = null
    var no: EditText? = null
    var btn: Button? = null
    var txt1: TextView? = null
    var txt2: TextView? = null
    fun OnCLick() {
        amt = findViewById<View>(R.id.amtt) as EditText
        interest = findViewById<View>(R.id.interestt) as EditText
        time = findViewById<View>(R.id.timm) as EditText
        no = findViewById<View>(R.id.nn) as EditText
        btn = findViewById<View>(R.id.btnn) as Button
        txt1 = findViewById<View>(R.id.txt11) as TextView
        txt2 = findViewById<View>(R.id.txt22) as TextView
        btn!!.setOnClickListener {
            val a = amt!!.text.toString().toDouble()
            val b = interest!!.text.toString().toDouble()
            val c = time!!.text.toString().toDouble()
            val j= no!!.text.toString().toDouble()
            val d = a*Math.pow(1+(b/j),c)
            val e = d-a
            txt11!!.text = "Total Interest Is :$e"
            txt22!!.text = "Total Amount is : $d"
        }
    }
}
