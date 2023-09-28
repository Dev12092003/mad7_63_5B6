package com.example.mad7_63_5b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import com.example.mad7_63_5b6.databinding.ActivityYoutubeMain2Binding

class YoutubeMainActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityYoutubeMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityYoutubeMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        initYoutubePlayer()
        binding.backbtn.setOnClickListener{
            Intent(this,MainActivity::class.java).also { startActivity(it) }
        }
    }
    private val youtubeID= "https://www.youtube.com/watch?v=keg_2PlBnbY"
    private fun initYoutubePlayer(){
        val websettings:WebSettings=binding.webviwe.settings
        websettings.javaScriptEnabled=true
        websettings.loadWithOverviewMode=true
        websettings.useWideViewPort=true
        binding.webviwe.loadUrl("$youtubeID")
    }
}