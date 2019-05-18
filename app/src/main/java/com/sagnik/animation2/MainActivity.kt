package com.sagnik.animation2

import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var parent = findViewById<RelativeLayout>(R.id.parent_layout)

        var animationDrawable = parent.background as AnimationDrawable?
        animationDrawable?.setEnterFadeDuration(3000)
        animationDrawable?.setExitFadeDuration(1000)
        animationDrawable?.start()
    }
}
