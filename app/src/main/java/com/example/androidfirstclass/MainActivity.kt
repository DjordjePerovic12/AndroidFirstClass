package com.example.androidfirstclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_radio_and_chekbox.*
import kotlinx.android.synthetic.main.image_view.*
import kotlinx.android.synthetic.main.increment_counter.*
import kotlinx.android.synthetic.main.number_addition.*
import java.util.Collections

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_and_chekbox)

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

        btnSubmit.setOnClickListener {
            val checkedRadioButton = rgFavorite.checkedRadioButtonId
            val favorite = findViewById<RadioButton>(checkedRadioButton)
            val first = cbFirst.isChecked
            val second = cbSecond.isChecked
            val third = cbThird.isChecked

            Log.e(
                "TAG",
                "You have watched:" + (if (first) "\nBreaking Bad" else "")
                        + (if (second) "\nTwin Peaks" else "") +
                        (if (third) "\nPeaky Blinders" else "") +
                        " and your favorite is ${favorite.text}"

            )
        }
    }
}