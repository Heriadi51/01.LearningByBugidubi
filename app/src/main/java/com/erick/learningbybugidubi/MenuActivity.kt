package com.erick.learningbybugidubi

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.erick.learningbybugidubi.expression.ExpressionMain
import com.erick.learningbybugidubi.puzzle.Puzzle
import com.erick.learningbybugidubi.settings.Settings
import com.erick.learningbybugidubi.wording.AlphabetActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val cardWording = findViewById<CardView>(R.id.card_wording)
        val cardExpression = findViewById<CardView>(R.id.cardExpression)
        val puzzleBoy = findViewById<CardView>(R.id.puzzleBoy)
        val ivSettings = findViewById<ImageView>(R.id.iv_settings_boy)

        cardWording.setOnClickListener {
            startActivity(Intent(this, AlphabetActivity::class.java))
        }
        cardExpression.setOnClickListener {
            startActivity(Intent(this, ExpressionMain::class.java))
        }
        puzzleBoy.setOnClickListener {
            startActivity(Intent(this, Puzzle::class.java))
        }
        ivSettings.setOnClickListener {
            startActivity(Intent(this, Settings::class.java))
        }

        play()
    }

    private fun play() {
        val audio1 = MediaPlayer.create(this, R.raw.bermain)
        if (audio1.isPlaying) {
            audio1.stop()
        } else {
            audio1.start()
        }
    }
}