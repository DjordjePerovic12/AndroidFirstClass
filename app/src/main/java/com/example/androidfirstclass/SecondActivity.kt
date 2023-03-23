package com.example.androidfirstclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfirstclass.databinding.ActivitySecondActivtyBinding

private lateinit var binding: ActivitySecondActivtyBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondActivtyBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        binding.btnGoToThird.setOnClickListener {
//            Intent(this, ThirdActivity::class.java).also { goToThirdActivityIntent ->
//                startActivity(goToThirdActivityIntent)
//            }
//        }

        val name = intent.getStringExtra("First Name")
        val lastName = intent.getStringExtra("Last name")
        val birthDate = intent.getStringExtra("Birth date")
        val country = intent.getStringExtra("Country")

        val person = intent.getSerializableExtra("Person") as Person

        binding.tvSecondActivity.text =
            "Person ${person.firstName}, born on ${person.birthDate}, lives in ${person.country}"

    }
}