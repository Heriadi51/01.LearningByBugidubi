package com.erick.learningbybugidubi.expression

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.erick.learningbybugidubi.R

class ExpressionMain : AppCompatActivity() {
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expression_main)
        val rvExpression = findViewById<RecyclerView>(R.id.rvExpression)
        val ivBackExpression = findViewById<ImageView>(R.id.ivBackExpression)

        ivBackExpression.setOnClickListener {
            onBackPressed()
        }

        val dataTitle = mutableListOf(
            "SEDIH", "SENYUM", "MALU", "MENANGIS", "MARAH", "KETAWA"
        )

        val dataImage = mutableListOf(
            R.drawable.ic_sedih,
            R.drawable.ic_senyum,
            R.drawable.ic_malu,
            R.drawable.ic_menangis,
            R.drawable.ic_marah,
            R.drawable.ic_ketawa
        )

        val dataAudiEx = mutableListOf(
            R.raw.sedih, R.raw.senyum, R.raw.malu, R.raw.menangis, R.raw.marah, R.raw.ketawa
        )

        viewManager = LinearLayoutManager(this)
        viewAdapter = ExpressionAdapter(dataTitle, dataImage, dataAudiEx)
        rvExpression.apply {
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}