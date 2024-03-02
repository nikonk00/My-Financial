package com.example.myfinancial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Toast

class BlogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        val webView : WebView = findViewById(R.id.webview)

        Toast.makeText(this, "Silahkan Tunggu ...", Toast.LENGTH_SHORT).show()

        webView.loadUrl("https://danirachmat.com/")
        webView.settings.javaScriptEnabled
    }
}