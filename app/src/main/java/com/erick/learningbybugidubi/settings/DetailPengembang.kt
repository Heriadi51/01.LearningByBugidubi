package com.erick.learningbybugidubi.settings

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.erick.learningbybugidubi.R

class DetailPengembang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pengembang)
        val ivBackSetting = findViewById<ImageView>(R.id.ivBackSetting)

        ivBackSetting.setOnClickListener {
            onBackPressed()
        }
    }
}