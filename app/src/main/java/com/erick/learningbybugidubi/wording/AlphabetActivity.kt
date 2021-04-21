package com.erick.learningbybugidubi.wording

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.erick.learningbybugidubi.R

class AlphabetActivity : AppCompatActivity() {

    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet)
        val rvWording = findViewById<RecyclerView>(R.id.rv_wording)
        val ivbackBtn = findViewById<ImageView>(R.id.iv_back)

        val dataName = mutableListOf(
            "A", "B", "C", "D",
            "E", "F", "G", "H",
            "I", "J", "K", "L",
            "M", "N", "O", "P",
            "Q", "R", "S", "T",
            "U", "V", "W", "X",
            "Y", "Z"
        )
        val dataAudio = mutableListOf(
            R.raw.a, R.raw.b, R.raw.c, R.raw.d,
            R.raw.e, R.raw.f, R.raw.g, R.raw.h,
            R.raw.i, R.raw.j, R.raw.k, R.raw.l,
            R.raw.m, R.raw.n, R.raw.o, R.raw.p,
            R.raw.q, R.raw.r, R.raw.s, R.raw.t,
            R.raw.u, R.raw.v, R.raw.w, R.raw.x,
            R.raw.y, R.raw.z
        )

        val dataIcon = mutableListOf(
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,
            R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h,
            R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l,
            R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.p,
            R.drawable.q, R.drawable.r, R.drawable.s, R.drawable.t,
            R.drawable.u, R.drawable.v, R.drawable.w, R.drawable.x,
            R.drawable.y, R.drawable.z
        )

        val dataDesc = mutableListOf(
            "Apel Merah",
            "Baju Sekolah",
            "Celana Panjang",
            "Duduk Di Kursi",
            "Es Krim Enak",
            "Film Kartun",
            "Gelas Untuk Minum",
            "Baju Saya Harum",
            "Ibu Saya Cantik",
            "Saya Mau Jalan-Jalan",
            "Saya Tidur Di Kamar",
            "Piring Bentuknya Lingkaran",
            "Ibu Masak Di Dapur",
            "Saya Makan Nasi",
            "Saya Suka Olahraga",
            "Pakai Payung Jika Hujan",
            "Al-Qur’an Untuk Mengaji",
            "Simpan Buku Di Rak Buku",
            "Sepatu Sekolah Saya Warna Hitam",
            "Tangan Saya Ada 2",
            "Uang Untuk Belanja",
            "Vas Bunga",
            "Warna Pelangi Ada 7",
            "Huruf Dengan Bentuk Silang",
            "Saya Ingin Bermain Yoyo",
            "Zebra Berwana Hitam Dan Putih"
        )

        viewManager = GridLayoutManager(this, 4)
        viewAdapter = WordingAdapter(dataName, dataAudio, dataIcon, dataDesc)
        rvWording.apply {
            layoutManager = viewManager
            adapter = viewAdapter
        }

        ivbackBtn.setOnClickListener {
            onBackPressed()
        }
    }
}