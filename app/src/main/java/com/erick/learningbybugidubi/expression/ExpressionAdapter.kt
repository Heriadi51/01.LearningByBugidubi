package com.erick.learningbybugidubi.expression

import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.erick.learningbybugidubi.R

class ExpressionAdapter(
    private val listDataTitle: MutableList<String>,
    private val listImage: MutableList<Int>,
    private val listAudioEx: MutableList<Int>
) : RecyclerView.Adapter<ExpressionAdapter.ExpressionViewHolder>() {
    inner class ExpressionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.findViewById<TextView>(R.id.tvTitleExpression)
        val image = itemView.findViewById<ImageView>(R.id.ivExpression)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                Toast.makeText(itemView.context, listDataTitle[position], Toast.LENGTH_SHORT).show()
                MediaPlayer.create(itemView.context, listAudioEx[position]).start()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpressionViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.expression_item, parent, false)
        return ExpressionViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExpressionViewHolder, position: Int) {
        holder.title.text = listDataTitle[position]
        holder.image.setImageResource(listImage[position])
    }

    override fun getItemCount(): Int = listDataTitle.size

}