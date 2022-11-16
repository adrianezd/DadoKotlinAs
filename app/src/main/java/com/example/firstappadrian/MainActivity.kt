package com.example.firstappadrian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn2 = findViewById<Button>(R.id.button2)
        var textoDado = findViewById<TextView>(R.id.lbDado)

        var imgV = findViewById<ImageView>(R.id.imageView)

        btn2.setOnClickListener{
            var num = (1..6).random()
            when(num)
            {
                 1 -> imgV.setImageResource(R.drawable.dice_1)

                 2 -> imgV.setImageResource(R.drawable.dice_2)

                 3 -> imgV.setImageResource(R.drawable.dice_3)

                 4 -> imgV.setImageResource(R.drawable.dice_4)

                 5 -> imgV.setImageResource(R.drawable.dice_5)

                 6-> imgV.setImageResource(R.drawable.dice_6)

            }
            textoDado.text = num.toString()
        }

    }
}