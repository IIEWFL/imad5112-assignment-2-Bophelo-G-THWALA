package com.example.thetamagotchiapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val EnterAppButton = findViewById<Button>(R.id.EnterAppButton)



        EnterAppButton.setOnClickListener {


            val intent = Intent(this, StartingPage::class.java)
            startActivity(intent)
        }
    }
}