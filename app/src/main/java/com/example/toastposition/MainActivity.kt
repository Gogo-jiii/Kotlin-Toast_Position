package com.example.toastposition

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            val top = Toast.makeText(this@MainActivity, "TOP", Toast.LENGTH_LONG)
            top.setGravity(Gravity.TOP, 0, 0)
            top.show()

            val center = Toast.makeText(this@MainActivity, "CENTER", Toast.LENGTH_LONG)
            center.setGravity(Gravity.CENTER, 0, 0)
            center.show()

            val bottom = Toast.makeText(this@MainActivity, "BOTTOM", Toast.LENGTH_LONG)
            bottom.setGravity(Gravity.BOTTOM, 0, 0)
            bottom.show()
        }
    }
}