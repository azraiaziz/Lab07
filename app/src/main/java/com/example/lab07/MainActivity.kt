package com.example.lab07

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//new import
import android.content.Intent
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.nameEditText)
        val address = findViewById<EditText>(R.id.addressEditText)
        val city = findViewById<EditText>(R.id.cityEditText)
        val postcode = findViewById<EditText>(R.id.postcodeEditText)
        val country = findViewById<EditText>(R.id.countryEditText)
        val scheduleButton = findViewById<Button>(R.id.schedule)

        scheduleButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", name.text.toString())
            intent.putExtra("address", address.text.toString())
            intent.putExtra("city", city.text.toString())
            intent.putExtra("postcode", postcode.text.toString())
            intent.putExtra("country", country.text.toString())
            startActivity(intent)
        }
    }
}