package com.example.lifecircletest

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        event?.let {
            if (it.action == MotionEvent.ACTION_DOWN) {
                startActivity(Intent(this, MainActivity::class.java))
                return true
            }
        }
        return super.onTouchEvent(event)
    }
}
