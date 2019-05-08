package com.example.lifecircletest

import android.support.v7.app.AppCompatActivity
import android.util.Log

open class BaseActivity : AppCompatActivity() {
    override fun onStart() {
        super.onStart()
        Log.d(this.javaClass.simpleName, "onStart " + hashCode())
    }

    override fun onStop() {
        super.onStop()
        Log.d(this.javaClass.simpleName, "onStop " + hashCode())
    }

    override fun onResume() {
        super.onResume()
        Log.d(this.javaClass.simpleName, "onResume " + hashCode())
    }

    override fun onPause() {
        super.onPause()
        Log.d(this.javaClass.simpleName, "onPause " + hashCode())
    }
}