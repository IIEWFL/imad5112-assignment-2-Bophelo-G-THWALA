package com.example.thetamagotchiapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PetCleaningPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pet_cleaning_page)

        val ReturnButton2 = findViewById<Button>(R.id.ReturnButton2)

        ReturnButton2.setOnClickListener {

            val intent = Intent(this, StartingPage::class.java)
            startActivity(intent)

            Thread.sleep(5000)

        }

    }
}