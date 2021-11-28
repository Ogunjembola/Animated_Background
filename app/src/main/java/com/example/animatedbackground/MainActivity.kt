package com.example.animatedbackground

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.example.animatedbackground.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // keep the app in light mode
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        backgroundAnimation()

        binding.floatingActionButton.setOnClickListener {
            binding.floatingActionButton.animate().apply {
                rotationBy(360f)
                duration = 1000
            }.start()
        }
    }

    private fun backgroundAnimation() {

        val animayionDrawable: AnimationDrawable = binding.rl.background as AnimationDrawable
        animayionDrawable.apply {
            setEnterFadeDuration(1000)
            setExitFadeDuration(3000)
            start()
        }
    }
}