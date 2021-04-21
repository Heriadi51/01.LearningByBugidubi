package com.erick.learningbybugidubi.settings

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.erick.learningbybugidubi.R

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val ivBackSetting = findViewById<ImageView>(R.id.setting)
        val tvPengembang = findViewById<TextView>(R.id.tvPengembang)

        tvPengembang.setOnClickListener{
            startActivity(Intent(this, DetailPengembang::class.java))
        }

        ivBackSetting.setOnClickListener {
            onBackPressed()
        }
    }
}