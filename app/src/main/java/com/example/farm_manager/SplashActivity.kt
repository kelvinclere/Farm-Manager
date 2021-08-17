package com.example.farm_manager

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstancesStates: Bundle?) {
        super.onCreate(savedInstancesStates)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        val th: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(3000)
                    val myIntent = Intent(this@SplashActivity, MainActivity::class.java)
                    startActivity(myIntent)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }
        th.start()
    }
}
