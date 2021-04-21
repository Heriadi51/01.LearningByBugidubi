package com.erick.learningbybugidubi.puzzle

import android.content.ClipData
import android.content.ClipDescription
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.view.DragEvent
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.erick.learningbybugidubi.R

class PuzzleMain : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzle_main)
        val dragView1 = findViewById<View>(R.id.dragView1)
        val dragView2 = findViewById<View>(R.id.dragView2)
        val dragView3 = findViewById<View>(R.id.dragView3)
        val llTop1 = findViewById<LinearLayout>(R.id.llTop1)
        val llTop2 = findViewById<LinearLayout>(R.id.llTop2)
        val llTop3 = findViewById<LinearLayout>(R.id.llTop3)
        val llBottom1 = findViewById<LinearLayout>(R.id.llBottom1)
        val llBottom2 = findViewById<LinearLayout>(R.id.llBottom2)
        val llBottom3 = findViewById<LinearLayout>(R.id.llBottom3)
        val ivBackPuzzle = findViewById<ImageView>(R.id.ivBackPuzzle)

        llTop1.setOnDragListener(dragListener1)
        llBottom1.setOnDragListener(dragListener1)
        llTop2.setOnDragListener(dragListener2)
        llBottom2.setOnDragListener(dragListener2)
        llTop3.setOnDragListener(dragListener3)
        llBottom3.setOnDragListener(dragListener3)

        dragView1.setOnLongClickListener {
            val clipText = ""
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText, mimeTypes, item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data, dragShadowBuilder, it, 0)

            it.visibility = View.INVISIBLE
            true
        }
        dragView2.setOnLongClickListener {
            val clipText = ""
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText, mimeTypes, item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data, dragShadowBuilder, it, 0)

            it.visibility = View.INVISIBLE
            true
        }
        dragView3.setOnLongClickListener {
            val clipText = "Saya Sayang Ibu"
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText, mimeTypes, item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data, dragShadowBuilder, it, 0)

            it.visibility = View.INVISIBLE
            true
        }

        ivBackPuzzle.setOnClickListener{
            onBackPressed()
        }
    }

    private val dragListener1 = View.OnDragListener { view, event ->
        when (event.action) {
            DragEvent.ACTION_DRAG_STARTED -> {
                view.invalidate()
                true
            }
            DragEvent.ACTION_DRAG_ENTERED -> {
                view.invalidate()
                true
            }
            DragEvent.ACTION_DRAG_LOCATION -> {
                true
            }
            DragEvent.ACTION_DRAG_EXITED -> {
                view.invalidate()
                true
            }
            DragEvent.ACTION_DROP -> {
                val dropView1 = findViewById<View>(R.id.dropView1)
                val textDetail = findViewById<TextView>(R.id.textDetail)
                val item = event.clipData.getItemAt(0)
                val dragData = item.text
                textDetail.text = dragData

                view.invalidate()

                val v = event.localState as View
                val owner = v.parent as ViewGroup
                owner.removeView(v)
                val destination = view as LinearLayout
                destination.addView(v)
                dropView1.visibility = View.INVISIBLE

                v.visibility = View.VISIBLE
                true
            }
            DragEvent.ACTION_DRAG_ENDED -> {
                view.invalidate()
                true
            }
            else -> false
        }

    }
    private val dragListener2 = View.OnDragListener { view, event ->
        when (event.action) {
            DragEvent.ACTION_DRAG_STARTED -> {
                view.invalidate()
                true
            }
            DragEvent.ACTION_DRAG_ENTERED -> {
                view.invalidate()
                true
            }
            DragEvent.ACTION_DRAG_LOCATION -> {
                true
            }
            DragEvent.ACTION_DRAG_EXITED -> {
                view.invalidate()
                true
            }
            DragEvent.ACTION_DROP -> {
                val dropView2 = findViewById<View>(R.id.dropView2)
                val v = event.localState as View
                val owner = v.parent as ViewGroup
                owner.removeView(v)
                val destination = view as LinearLayout
                destination.addView(v)
                dropView2.visibility = View.INVISIBLE

                v.visibility = View.VISIBLE
                true
            }
            DragEvent.ACTION_DRAG_ENDED -> {
                view.invalidate()
                true
            }
            else -> false
        }

    }
    private val dragListener3 = View.OnDragListener { view, event ->
        when (event.action) {
            DragEvent.ACTION_DRAG_STARTED -> {
                event.clipDescription.hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)
            }
            DragEvent.ACTION_DRAG_ENTERED -> {
                view.invalidate()
                true
            }
            DragEvent.ACTION_DRAG_LOCATION -> {
                true
            }
            DragEvent.ACTION_DRAG_EXITED -> {
                view.invalidate()
                true
            }
            DragEvent.ACTION_DROP -> {
                val dropView3 = findViewById<View>(R.id.dropView3)
                val textDetail = findViewById<TextView>(R.id.textDetail)
                val item = event.clipData.getItemAt(0)
                val dragData = item.text
                textDetail.text = dragData
                MediaPlayer.create(this, R.raw.sayang_ibu).start()

                view.invalidate()

                val v = event.localState as View
                val owner = v.parent as ViewGroup
                owner.removeView(v)
                val destination = view as LinearLayout
                destination.addView(v)
                dropView3.visibility = View.INVISIBLE

                v.visibility = View.VISIBLE
                true
            }
            DragEvent.ACTION_DRAG_ENDED -> {
                view.invalidate()
                true
            }
            else -> false
        }

    }
}