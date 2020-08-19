package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_c_i.*
import kotlinx.android.synthetic.main.activity_e_m_i.*

class EMI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e_m_i)
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
        amt = findViewById<View>(R.id.amttt) as EditText
        interest = findViewById<View>(R.id.interesttt) as EditText
        time = findViewById<View>(R.id.timmm) as EditText
        btn = findViewById<View>(R.id.btnnn) as Button
        txt1 = findViewById<View>(R.id.txt111) as TextView
        txt2 = findViewById<View>(R.id.txt222) as TextView
        btn!!.setOnClickListener {
            val a = amt!!.text.toString().toDouble()
            val b = interest!!.text.toString().toDouble()
            val c = time!!.text.toString().toDouble()
            val d = (a*b*Math.pow((1+b),c))/(Math.pow((1+b),c)-1)
            txt222!!.text = "Monthly EMI is : $d"
        }
    }
}
