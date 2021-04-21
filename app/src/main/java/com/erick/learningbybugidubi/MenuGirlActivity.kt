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

class MenuGirlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_girl)
        val cardWordingGirl = findViewById<CardView>(R.id.card_wording_girl)
        val cardExpressionGirl = findViewById<CardView>(R.id.cardExpressionGirl)
        val cardPuzzleGirl = findViewById<CardView>(R.id.cardPuzzleGirl)
        val ivSettings = findViewById<ImageView>(R.id.iv_settings)

        cardWordingGirl.setOnClickListener {
            startActivity(Intent(this, AlphabetActivity::class.java))
        }

        cardExpressionGirl.setOnClickListener {
            startActivity(Intent(this, ExpressionMain::class.java))
        }
        cardPuzzleGirl.setOnClickListener {
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