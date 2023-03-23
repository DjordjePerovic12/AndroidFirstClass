package com.example.androidfirstclass

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import com.example.androidfirstclass.databinding.ActivityImplicitIntentBinding
import com.example.androidfirstclass.databinding.ActivityMainBinding
import com.example.androidfirstclass.databinding.ActivityToastBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        btnApply.setOnClickListener {
//            val firstName = etFirstName.text.toString()
//            val lastName = etLastName.text.toString()
//            val birthDate = etBirthDate.text.toString()
//            val country = etCountry.text.toString()
//
//            Log.e(
//                "TAG", "User $firstName $lastName, born on $birthDate, from $country just signed up"
//            )
//        }
//        var count = 0
//        btnIncrement.setOnClickListener {
//            count++
//            tvCounter.text = "Counter : $count"
//        }

//        btnAdd.setOnClickListener {
//            val firstNumber = etFirstNumber.text.toString().toInt()
//            val secondNumber = etSecondNumber.text.toString().toInt()
//            tvResult.text = (firstNumber + secondNumber).toString()
//        }

//        btnAddImage.setOnClickListener {
//            ivImage.setImageResource(R.drawable.activity_lifecycle)
//        }


//        btnAddImage.setOnClickListener {
//            Log.e("wfefef", "efrgtbhuirg")
//        }
//

//        binding.btnSubmit.setOnClickListener {
//            val checkedRadioButton = binding.rgFavorite.checkedRadioButtonId
//            val favorite = findViewById<RadioButton>(checkedRadioButton)
//            val first = binding.cbFirst.isChecked
//            val second = binding.cbSecond.isChecked
//            val third = binding.cbThird.isChecked
//
//            Log.e(
//                "TAG",
//                "You have watched:" + (if (first) "\nBreaking Bad" else "") + (if (second) "\nTwin Peaks" else "") + (if (third) "\nPeaky Blinders" else "") + " and your favorite is ${favorite.text}"
//
//            )
//        }

//        binding.btnStartIntent.setOnClickListener {
//            Toast.makeText(this, "Our toast message", Toast.LENGTH_LONG).show()
//        }

//        binding.btnStartIntent.setOnClickListener {
//            Intent(this, SecondActivity::class.java).also { ourNewIntent ->
//                startActivity(ourNewIntent)
//            }
//        }

        //Explicit intent

//        binding.btnAddPhoto.setOnClickListener {
//            Intent(Intent.ACTION_GET_CONTENT).also { newlyCreatedIntent ->
//                newlyCreatedIntent.type = "image/*"
//                startActivityForResult(newlyCreatedIntent, 0)
//            }
//        }

        binding.btnApply.setOnClickListener {
            val name = binding.etFirstName.text.toString()
            val birthDate = binding.etBirthDate.text.toString()
            val lastName = binding.etLastName.text.toString()
            val country = binding.etCountry.text.toString()
            val person = Person(
                firstName = name, lastName = lastName, birthDate = birthDate, country = country
            )

            Intent(this, SecondActivity::class.java).also {
//                it.putExtra("First Name", name)
//                it.putExtra("Last name", lastName)
//                it.putExtra("Birth date", birthDate)
//                it.putExtra("Country", country)
                it.putExtra("Person", person)
                startActivity(it)
            }
        }
    }


    //Explicit intent
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (resultCode == Activity.RESULT_OK && requestCode == 0) {
//            val uri = data?.data
//            binding.ivImage.setImageURI(uri)
//        }
//    }
}