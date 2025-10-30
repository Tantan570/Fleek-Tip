package com.example.fleektip

import android.os.Bundle
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.net.Uri

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

        // Move to AR try on screen
        val btnTryOn = findViewById<Button>(R.id.btnTryOn)
        btnTryOn.setOnClickListener {
            val intent = Intent(this, ARScreenActivity::class.java)
            startActivity(intent)
        }

        //Move to reservation Screen
        val btnReservation = findViewById<Button>(R.id.btnReservation)
        btnReservation.setOnClickListener {
            val intent = Intent(this, ReservationActivity::class.java)
            startActivity(intent)
        }

        //Buttons for opening the link for the socials
        val btnFacebook = findViewById<ImageButton>(R.id.btn_facebook)
        val btnTiktok = findViewById<ImageButton>(R.id.btn_tiktok)

        //Shows loading screen first before opening app oe browser

        // Facebook button
        btnFacebook.setOnClickListener {
            val loadingIntent = Intent(this, SocialRedirectActivity::class.java)
            loadingIntent.putExtra("platform", "facebook")
            startActivity(loadingIntent)
        }

        // TikTok button
        btnTiktok.setOnClickListener {
            val loadingIntent = Intent(this, SocialRedirectActivity::class.java)
            loadingIntent.putExtra("platform", "tiktok")
            startActivity(loadingIntent)
        }

    }
}