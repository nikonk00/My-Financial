package com.example.myfinancial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val button4 : Button = findViewById(R.id.button4)
        val button3 : Button = findViewById(R.id.button3)

        button3.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
            })

        button4.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
            finish()
            })

        }

    override fun onBackPressed() {
        finish()
    }
}