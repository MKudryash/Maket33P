package com.example.maket33p

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login = findViewById<EditText>(R.id.editTextTextPersonName)
        var password = findViewById<EditText>(R.id.txtPassword)
        var logIn = findViewById<Button>(R.id.button)

        if(login.text.length>0 && password.text.length>0)
        {
            logIn.background = this.getDrawable(R.drawable.button_background_activity)
            logIn.setTextColor(this.getColor(R.color.white))
        }

    }
}