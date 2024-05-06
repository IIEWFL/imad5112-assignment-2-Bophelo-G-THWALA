package com.example.thetamagotchiapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StartingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_starting_page)

        val ResultHunger = findViewById<TextView>(R.id.ResultHunger)
        val HungerStatus = findViewById<TextView>(R.id.HungerStatus)

        val ResultHygiene = findViewById<TextView>(R.id.ResultHygiene)
        val HygieneStatus = findViewById<TextView>(R.id.HygieneStatus)

        val ResultMood = findViewById<TextView>(R.id.ResultMood)
        val MoodStatus = findViewById<TextView>(R.id.MoodStatus)


        val FeedButton = findViewById<Button>(R.id.FeedButton)

        val CleanButton = findViewById<Button>(R.id.CleanButton)

        val PlayButton = findViewById<Button>(R.id.PlayButton)


        fun showStats(Hunger: Int, Hygiene: Int, Happiness: Int) {
            ResultHunger.text = ("Hunger:${Hunger}")
            ResultHygiene.text = ("Hygiene:${Hygiene}")
            ResultMood.text = ("Happiness:${Happiness}")

        }

        fun passTime(Hunger: Int, Hygiene: Int, Happiness: Int) {

            Hunger == 20

            Hygiene == 25

            Happiness == 10

        }

        var counter = 0

       FeedButton.setOnClickListener {

           // Changes to image of Pet Eating
           val intent = Intent(this, PetEatingPage::class.java)
           startActivity(intent)

           // It changes and updates status of pet

           var Hunger: Int = 0

           var startingHunger = 50

           Hunger -= 20


           ResultHunger.text = "Hunger:${Hunger}"
           HungerStatus.text = "Your pet hunger is ${Hunger}, your pet is fed."




           if (Hunger < 0) {

               Hunger = 0

               HungerStatus.text = "Your hunger is ${Hunger}, your pet is fed."


           } else if (Hunger > 79) {

               HungerStatus.text = "Your hunger is ${Hunger}, your pet is very hungry; " +
                       "give your pet some food."

           } else if (Hunger < 75) {

               HungerStatus.text = "Your hunger is ${Hunger}, your pet is fed."

           } else if (Hunger > 100) {

               HungerStatus.text = "Your hunger is ${Hunger}, your pet is very hungry; " +
                       "give your pet some food."

               counter++


           }

       }





        CleanButton.setOnClickListener {

            // Changes to image of Pet being cleaned up
            val intent = Intent(this, PetCleaningPage::class.java)
            startActivity(intent)

            // It changes and updates status of pet

            var Hygiene: Int = 0

            var startingHygiene = 50

            Hygiene += 15


            ResultHygiene.text = "Hygiene:${Hygiene}"
            HygieneStatus.text = "Your pet hygiene is ${Hygiene}, your pet is all cleaned up."




            if (Hygiene < 0) {

                Hygiene = 0

                HygieneStatus.text = "Your hygiene is ${Hygiene},very dirty and smelly, " +
                        "please wash your pet."


            } else if (Hygiene < 30) {

                HygieneStatus.text = "Your hygiene is ${Hygiene}, your pet is " +
                        "very dirty and smelly, please wash your pet."


            } else if (Hygiene > 60) {

                HygieneStatus.text = "Your hygiene is ${Hygiene}, your pet is all cleaned up."

            } else if (Hygiene > 100) {

                Hygiene = 100

                HygieneStatus.text = "Your hygiene is ${Hygiene}, your pet is all cleaned up."

                counter++


            }




        }



        PlayButton.setOnClickListener {

            // Changes to image of Pet playing
            val intent = Intent(this, PetPlayingPage::class.java)
            startActivity(intent)

            // It changes and updates status of pet

            var Happiness: Int = 0

            var startingHappiness = 50

            Happiness += 25


            ResultMood.text = "Happiness:${Happiness}"
            MoodStatus.text = "Your pet happiness is ${Happiness},your pet is satisfied. " +
                    "Keep your pet happy. "




            if (Happiness < 0) {

                Happiness = 0

                MoodStatus.text = "Your happiness is ${Happiness},  " +
                        "your pet is either bored or sad, you should play with your pet."


            } else if (Happiness < 20) {

                MoodStatus.text = "Your happiness is ${Happiness},  " +
                        "your pet is either bored or sad, you should play with your pet."


            } else if (Happiness > 70) {

                MoodStatus.text = "Your happiness is ${Happiness}, your pet is satisfied. " +
                        "Keep your pet happy."

            } else if (Happiness > 100) {

                Happiness = 100

                MoodStatus.text = "Your hygiene is ${Happiness}, your pet is all cleaned up."

                counter++

            }
        }
    }
}