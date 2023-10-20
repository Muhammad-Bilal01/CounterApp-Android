package com.practice.helloworld

//import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countText = findViewById<TextView>(R.id.countText)
        var count = 1
//        countText.setText(count)

        var sayBtn = findViewById<Button>(R.id.sayHelloBtn)
        sayBtn.setOnClickListener {
            count++
            countText.text = count.toString()
            Toast.makeText(applicationContext, "Hello World... $count", Toast.LENGTH_LONG).show()
        }

    }

}