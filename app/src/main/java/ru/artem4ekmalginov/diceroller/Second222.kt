package ru.artem4ekmalginov.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Second222 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second222)

        val myButton = findViewById<Button>(R.id.button2)

        myButton.setOnClickListener {
            startActivity(Intent(this, Notsecond3::class.java))
        }

    }
}