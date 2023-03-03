package com.example.maket33p

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    private lateinit var login: TextView
    private lateinit var password: TextView
    private lateinit var btnLogIn: TextView

    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login = findViewById<EditText>(R.id.editTextTextPersonName)
        password = findViewById<EditText>(R.id.txtPassword)
        btnLogIn = findViewById<Button>(R.id.button)
        init()
    }

    private fun init() {
        findViewById<TextView>(R.id.doNotHaveAccount).setOnClickListener()
        {
            startActivity(Intent(this@MainActivity, RegisterActivity::class.java))
        }
        login.addTextChangedListener(object : TextWatcher {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun afterTextChanged(s: Editable) {
                validation()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            }
        })
        password.addTextChangedListener(object : TextWatcher {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun afterTextChanged(s: Editable) {
                validation()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            }
        })
    }

    private fun validation() {
        if (login.text.isNotEmpty() && password.text.isNotEmpty()) {
            btnLogIn.setTextColor(this@MainActivity.getColor(R.color.white))
            btnLogIn.background =
                this@MainActivity.getDrawable(R.drawable.button_background_activity)

        }
        if (login.text.isEmpty() || password.text.isEmpty()) {
            btnLogIn.setTextColor(this@MainActivity.getColor(R.color.textColor))
            btnLogIn.background = this@MainActivity.getDrawable(R.drawable.button_background)
        }
    }
}