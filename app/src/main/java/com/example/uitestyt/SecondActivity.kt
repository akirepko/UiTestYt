package com.example.uitestyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uitestyt.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_second)

        binding.button.setOnClickListener{
            onBackPressedDispatcher.onBackPressed()
        }
    }
}