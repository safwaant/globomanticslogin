package com.example.login

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var loginVerification = LoginVerification()
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var login: Button
    private lateinit var phone: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email = findViewById(R.id.editTextEmail)
        password = findViewById(R.id.editTextPassword)
        login = findViewById(R.id.buttonLogin)
        phone = findViewById(R.id.editTextPhone)

        login.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(loginVerification.verify(email.text.toString(), password.text.toString(), phone.text.toString()))
        {
            Log.d("PASSWORD SUCCESSFUL", password.text.toString())
            Toast.makeText( this, "Login Successful", Toast.LENGTH_SHORT).show();
        }else{
            Log.d("PASSWORD FAILED", password.text.toString())
            Toast.makeText( this, "Login failed", Toast.LENGTH_SHORT).show();
        }

    }
}
