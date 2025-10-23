package com.example.fleektip

import android.os.Bundle
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

        val btnTryOn = findViewById<Button>(R.id.btnTryOn)
        btnTryOn.setOnClickListener {
            val intent = Intent(this, ARScreenActivity::class.java)
            startActivity(intent)
        }

        val btnReservation = findViewById<Button>(R.id.btnReservation)
        btnReservation.setOnClickListener {
            val intent = Intent(this, ReservationActivity::class.java)
            startActivity(intent)
        }

    }
}