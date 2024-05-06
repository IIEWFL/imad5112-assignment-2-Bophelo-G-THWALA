package com.example.thetamagotchiapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.delay

class PetEatingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pet_eating_page)


        val ReturnButton1 = findViewById<Button>(R.id.ReturnButton1)


        ReturnButton1.setOnClickListener {

            val intent = Intent(this, StartingPage::class.java)
            startActivity(intent)

            Thread.sleep(5000)
        }

    }
}