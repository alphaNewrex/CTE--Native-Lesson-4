package com.devsocxcte.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val check = findViewById<Button>(R.id.checkOTPbtn)
        val optTv: TextView = findViewById<TextView>(R.id.successOTP)
        var layout = findViewById<LinearLayout>(R.id.masterLayout)

        check.setOnClickListener {
            optTv.visibility = View.VISIBLE
        }

    }

}