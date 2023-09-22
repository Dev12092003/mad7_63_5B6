package com.example.mad7_63_5b6

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.example.mad7_63_5b6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initVideoPlayer()
            binding.webnextbtn.setOnClickListener{
                Intent(this,YoutubeMainActivity2::class.java).also { startActivity(it) }

        }
    }
    private fun initVideoPlayer(){
        val mediaController=MediaController(this)
        val uri:Uri= Uri.parse("android.resource://"+packageName+"/"+R.raw.thestoryoflight)
        binding.videoview1.setVideoURI(uri)
        binding.videoview1.requestFocus()
        binding.videoview1.start()
    }

}