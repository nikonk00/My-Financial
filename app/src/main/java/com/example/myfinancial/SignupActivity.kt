package com.example.myfinancial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val button : Button = findViewById(R.id.button3)

        button.setOnClickListener(View.OnClickListener {
            back()
        })
    }

    override fun onBackPressed() {
        back()
    }

    private fun back(){
        finish()
        overridePendingTransition(R.anim.no_animation, R.anim.slide_out)
    }
}