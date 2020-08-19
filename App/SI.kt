package com.example.myapplication
import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s_i)
        OnCLick()
    }

    var amt: EditText? = null
    var interest: EditText? = null
    var time: EditText? = null
    var btn: Button? = null
    var txt1: TextView? = null
    var txt2: TextView? = null
    fun OnCLick() {
        amt = findViewById<View>(R.id.amt) as EditText
        interest = findViewById<View>(R.id.interest) as EditText
        time = findViewById<View>(R.id.tim) as EditText
        btn = findViewById<View>(R.id.btn) as Button
        txt1 = findViewById<View>(R.id.txt1) as TextView
        txt2 = findViewById<View>(R.id.txt2) as TextView
        btn!!.setOnClickListener {
            val a = amt!!.text.toString().toInt()
            val b = interest!!.text.toString().toInt()
            val c = time!!.text.toString().toInt()
            val d: Int
            d = a * b * c / 100
            val e = a + d
            txt1!!.text = "Total Interest Is :$d"
            txt2!!.text = "Total Amount is : $e"
        }
    }
}
