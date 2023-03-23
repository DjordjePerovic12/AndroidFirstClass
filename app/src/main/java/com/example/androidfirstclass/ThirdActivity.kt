package com.example.androidfirstclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfirstclass.databinding.ActivityThirdBinding


private lateinit var binding: ActivityThirdBinding
class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoBack.setOnClickListener {
            finish()
        }
    }
}