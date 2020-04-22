package com.nusantarian.mygithublink.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.nusantarian.mygithublink.R

class MainActivity : AppCompatActivity() {

    private var back = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        if (back){
            super.onBackPressed()
            return
        }
        this.back = true
        Toast.makeText(applicationContext, R.string.press_back_twice, Toast.LENGTH_SHORT).show()
        Handler().postDelayed({
            back = false
        }, 2000)
    }
}
