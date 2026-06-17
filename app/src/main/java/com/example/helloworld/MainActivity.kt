package com.example.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Create TextView programmatically
        val textView = TextView(this)
        textView.text = "Hello World!"
        textView.textSize = 32f
        textView.setPadding(50, 50, 50, 50)
        
        setContentView(textView)
    }
}