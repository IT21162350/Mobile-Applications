package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        var reg = findViewById<Button>(R.id.login)
        reg.setOnClickListener {
            val reg_Page = Intent(this, registration::class.java);
            startActivity(reg_Page);
        }
    }
}