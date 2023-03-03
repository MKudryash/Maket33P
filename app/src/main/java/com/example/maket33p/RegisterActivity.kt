package com.example.maket33p

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi

class RegisterActivity : AppCompatActivity() {
    private lateinit var fullName: TextView
    private lateinit var email: TextView
    private lateinit var password: TextView
    private lateinit var passwordConfirm: TextView
    private lateinit var btnRegister: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        fullName = findViewById<EditText>(R.id.editTextTextPersonNameRG)
        email = findViewById<EditText>(R.id.editTextTextPersonEmailRG)
        password = findViewById<EditText>(R.id.txtPasswordRG)
        passwordConfirm = findViewById<EditText>(R.id.txtPasswordConfirmRG)
        btnRegister = findViewById<Button>(R.id.buttonRG)

        init()
    }
    private fun init()
    {
        password.addTextChangedListener(object : TextWatcher {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun afterTextChanged(s: Editable) {
                validation()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            }
        })
        passwordConfirm.addTextChangedListener(object : TextWatcher {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun afterTextChanged(s: Editable) {
                validation()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            }
        })
        fullName.addTextChangedListener(object : TextWatcher {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun afterTextChanged(s: Editable) {
                validation()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            }
        })
        email.addTextChangedListener(object : TextWatcher {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun afterTextChanged(s: Editable) {
                validation()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            }
        })
        btnRegister.setOnClickListener()
        {
            if(password.text.toString()==passwordConfirm.text.toString())
            {
                startActivity(Intent(this@RegisterActivity,CongrastActivity::class.java))
            }
            else
            {
                Toast.makeText(this@RegisterActivity,"Пароли не совпадают",
                Toast.LENGTH_LONG).show()
            }
        }
    }
    @RequiresApi(Build.VERSION_CODES.M)
    private fun validation()
    {
        if (fullName.text.isNotEmpty() && password.text.isNotEmpty()&&passwordConfirm.text.isNotEmpty()&& email.text.isNotEmpty()) {
            btnRegister.setTextColor(this@RegisterActivity.getColor(R.color.white))
            btnRegister.background =
                this@RegisterActivity.getDrawable(R.drawable.button_background_activity)

        }
        if (fullName.text.isEmpty() || password.text.isEmpty()||passwordConfirm.text.isEmpty()||email.text.isEmpty()) {
            btnRegister.setTextColor(this@RegisterActivity.getColor(R.color.textColor))
            btnRegister.background = this@RegisterActivity.getDrawable(R.drawable.button_background)
        }
    }
}