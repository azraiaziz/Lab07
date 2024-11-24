package com.example.lab07

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//new import
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val confirmationText = findViewById<TextView>(R.id.confirmation_text)
        val cancelButton = findViewById<Button>(R.id.cancel_button)
        val confirmButton = findViewById<Button>(R.id.confirm_button)

        val name = intent.getStringExtra("name")
        val address = intent.getStringExtra("address")
        val city = intent.getStringExtra("city")
        val postcode = intent.getStringExtra("postcode")
        val country = intent.getStringExtra("country")

        confirmationText.text = "Name: $name\nAddress: $address\nCity: $city\nPostcode: $postcode\nCountry: $country"

        cancelButton.setOnClickListener {
            finish()
        }

        confirmButton.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}