package com.mylaptop

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_page)
    }

    fun onButtonTap(v: View?) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("muhada.fadzil.mf@gmail.com"))
        intent.putExtra(Intent.EXTRA_SUBJECT, "Belajar Membuat Aplikasi Android Untuk Pemula")
        intent.putExtra(
            Intent.EXTRA_TEXT,
            "Hai dicoding"
        )
        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ?"))
        } catch (ex: ActivityNotFoundException) {

        }
    }
}