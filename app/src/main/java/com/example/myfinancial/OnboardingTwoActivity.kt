package com.example.myfinancial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class OnboardingTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_two)

        val button: Button =findViewById(R.id.button)

        button.setOnClickListener(View.OnClickListener {
            finish()
            startActivity(Intent(this, OnboardingThreeActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        })
    }
}