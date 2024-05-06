package com.example.thetamagotchiapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PetPlayingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pet_playing_page)

        val ReturnButton3 = findViewById<Button>(R.id.ReturnButton3)

        ReturnButton3.setOnClickListener {

            val intent = Intent(this, StartingPage::class.java)
            startActivity(intent)

            Thread.sleep(5000)


        }
    }
}