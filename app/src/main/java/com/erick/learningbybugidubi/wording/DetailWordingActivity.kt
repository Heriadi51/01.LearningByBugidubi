package com.erick.learningbybugidubi.wording

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.erick.learningbybugidubi.R

class DetailWordingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_wording)
        val tvTitleDetailWording = findViewById<TextView>(R.id.tv_title_detail_wording)
        val ivDetailWording = findViewById<ImageView>(R.id.iv_detail_wording)
        val tvDescWording = findViewById<TextView>(R.id.tv_desc_wording)
        val tvDetailWordingBtn = findViewById<ImageView>(R.id.tv_detail_wording_btn)

        val name = intent.getStringExtra("NAME")
        val icon = intent.getIntExtra("ICON", R.drawable.a)
        val desc = intent.getStringExtra("DESC")
        tvTitleDetailWording.text = name
        ivDetailWording.setImageResource(icon)
        tvDescWording.text = desc

        tvDetailWordingBtn.setOnClickListener {
            onBackPressed()
        }
    }
}