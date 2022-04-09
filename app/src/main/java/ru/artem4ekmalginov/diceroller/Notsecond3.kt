package ru.artem4ekmalginov.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class Notsecond3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notsecond3)

        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setOnClickListener {
            val text = resources.getString(R.string.antoxa)
            val duration = Toast.LENGTH_LONG

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()

        }
    }
}