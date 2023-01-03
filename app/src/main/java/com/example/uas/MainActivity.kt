package com.example.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun click(view:View){
        //panggil imageview, edit text dan buttonnya
        val imageView:ImageView=findViewById(R.id.gambar)
        val inputURL:EditText = findViewById(R.id.textURL)

        //baca url dari edittextnya
        val url = inputURL.text.toString()

        //tampilkan dengan glide
        Glide.with(this)
            .load(url)
            .into(imageView)
    }