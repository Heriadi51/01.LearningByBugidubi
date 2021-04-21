package com.erick.learningbybugidubi.wording

import android.content.Intent
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.erick.learningbybugidubi.R

class WordingAdapter(
    private val listName: MutableList<String>,
    private val listAudio: MutableList<Int>,
    private val listIcon: MutableList<Int>,
    private val listDesc: MutableList<String>
) : RecyclerView.Adapter<WordingAdapter.WordingViewHolder>() {

    inner class WordingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.tv_item_wording)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                MediaPlayer.create(itemView.context, listAudio[position]).start()
                val intent = Intent(itemView.context, DetailWordingActivity::class.java)
                intent.putExtra("NAME", listName[position])
                intent.putExtra("ICON", listIcon[position])
                intent.putExtra("DESC", listDesc[position])
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WordingAdapter.WordingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.wording_item, parent, false)
        return WordingViewHolder(view)
    }

    override fun onBindViewHolder(holder: WordingAdapter.WordingViewHolder, position: Int) {
        holder.name.text = listName[position]
    }

    override fun getItemCount(): Int = listName.size

}