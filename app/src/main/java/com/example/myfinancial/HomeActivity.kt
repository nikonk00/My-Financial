package com.example.myfinancial

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val textView : TextView = findViewById(R.id.textView11)
        val textView2 : TextView = findViewById(R.id.textView18)

        textView.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,BlogActivity::class.java))
        })

        textView2.setOnClickListener(View.OnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Konfirmasi")
                .setMessage("Apakah Anda Yakin Ingin Logout?")
                .setPositiveButton("Ya", DialogInterface.OnClickListener{dialogInterface, i ->
                    finish()
                    startActivity(Intent(this,SigninActivity::class.java))
                })
                .setNegativeButton("Batal",DialogInterface.OnClickListener{dialogInterface, i ->

                }).show()

        })
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Konfirmasi")
            .setMessage("Apakah anda ingin keluar dari aplikasi?")
            .setPositiveButton("Ya", DialogInterface.OnClickListener{dialogInterface, i ->
                Toast.makeText(this,"Terimakasih telah menggunakan Aplikasi MyFinancial",
                    Toast.LENGTH_SHORT).show()
                finish()
            })
            .setNegativeButton("Batal",DialogInterface.OnClickListener{dialogInterface, i ->

            }).show()
    }
}