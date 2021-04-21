package com.erick.learningbybugidubi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class GenderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gender)
        val cardViewBoy = findViewById<CardView>(R.id.cardview_boy)
        val cardViewGirl = findViewById<CardView>(R.id.cardView_girl)

        cardViewBoy.setOnClickListener {
            finishAffinity()
            startActivity(Intent(this, MenuActivity::class.java))

        }
        cardViewGirl.setOnClickListener {
            finishAffinity()
            startActivity(Intent(this, MenuGirlActivity::class.java))
        }
    }
}