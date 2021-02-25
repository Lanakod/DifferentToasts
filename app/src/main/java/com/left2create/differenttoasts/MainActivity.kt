package com.left2create.differenttoasts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import java.time.Duration

class MainActivity : AppCompatActivity() {

    lateinit var green: ImageButton
    lateinit var yellow: ImageButton
    lateinit var red: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        green = findViewById(R.id.imageButton)
        yellow = findViewById(R.id.imageButton2)
        red = findViewById(R.id.imageButton3)
    }

    fun buttonClick(view: View)
    {
        when(view)
        {
            green -> Toast.makeText(applicationContext, "Зеленый светофор!", Toast.LENGTH_SHORT).show()
            yellow -> Toast.makeText(applicationContext, "Жёлтый светофор!", Toast.LENGTH_SHORT).show()
            red -> Toast.makeText(applicationContext, "Красный светофор!", Toast.LENGTH_SHORT).show()
        }
    }
}