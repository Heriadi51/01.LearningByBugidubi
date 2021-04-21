package com.erick.learningbybugidubi.puzzle

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.erick.learningbybugidubi.R

class Puzzle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzle)
        val ivBackPuzzleDash = findViewById<ImageView>(R.id.ivBackPuzzleDash)
        val cardPuzzle1 = findViewById<CardView>(R.id.cardPuzzle1)
        val cardPuzzle2 = findViewById<CardView>(R.id.cardPuzzle2)
        val cardPuzzle3 = findViewById<CardView>(R.id.cardPuzzle3)
        val cardPuzzle4 = findViewById<CardView>(R.id.cardPuzzle4)
        val cardPuzzle5 = findViewById<CardView>(R.id.cardPuzzle5)

        cardPuzzle1.setOnClickListener {
            startActivity(Intent(this, PuzzleMain::class.java))
        }
        cardPuzzle2.setOnClickListener {
            startActivity(Intent(this, PuzzleMain2::class.java))
        }
        cardPuzzle3.setOnClickListener {
            startActivity(Intent(this, PuzzleMain3::class.java))
        }
        cardPuzzle4.setOnClickListener {
            startActivity(Intent(this, PuzzleMain4::class.java))
        }
        cardPuzzle5.setOnClickListener {
            startActivity(Intent(this, PuzzleMain5::class.java))
        }

        ivBackPuzzleDash.setOnClickListener{
            onBackPressed()
        }
    }
}