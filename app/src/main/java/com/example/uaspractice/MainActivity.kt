package com.example.uaspractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 : CardView = findViewById(R.id.btn1)
        btn1.setOnClickListener(this)

        val btn2 : CardView = findViewById(R.id.btn2)
        btn2.setOnClickListener(this)

        val btn3 : CardView = findViewById(R.id.btn3)
        btn3.setOnClickListener(this)

        val btn4 : CardView = findViewById(R.id.btn4)
        btn4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn1 -> {
                val FoodDrinkActivity = Intent(this, FoodDrinkActivity::class.java)
                startActivity(FoodDrinkActivity)
            }

            R.id.btn2 -> {
                val HouseActivity = Intent(this, HouseActivity::class.java)
                startActivity(HouseActivity)
            }

            R.id.btn3 -> {
                val MomBabyActivity = Intent(this, MomBabyActivity::class.java)
                startActivity(MomBabyActivity)
            }

            R.id.btn4 -> {
                val HealthActivity = Intent(this, HealthActivity::class.java)
                startActivity(HealthActivity)
            }
        }
    }
}