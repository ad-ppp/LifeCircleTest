package com.example.lifecircletest

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class TransparentActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvButton.setOnClickListener {
            startActivity(Intent(this, TransparentActivity::class.java))
        }
    }
}