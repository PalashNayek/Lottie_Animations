package com.palash.lottieanimations

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val anim = findViewById<LottieAnimationView>(R.id.noteLottie)

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            anim.visibility = View.VISIBLE
            anim.playAnimation()
        },2000)
        anim.setOnClickListener{
            anim.playAnimation()
        }

        anim.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator) {

            }

            override fun onAnimationEnd(p0: Animator) {
                Log.d("MainActivity","Animation ended")
            }

            override fun onAnimationCancel(p0: Animator) {

            }

            override fun onAnimationRepeat(p0: Animator) {
                
            }

        })
    }
}