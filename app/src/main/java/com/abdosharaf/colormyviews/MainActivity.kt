package com.abdosharaf.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.abdosharaf.colormyviews.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var r = 0
    private var g = 0
    private var b = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewsList = listOf(binding.background, binding.box1, binding.box2, binding.box3,
        binding.box4, binding.box5)
        setBoxesListeners(viewsList)

        binding.button1.setOnClickListener {
            binding.box1.setBackgroundColor(getColor(R.color.red))
            binding.box2.setBackgroundColor(getColor(R.color.red))
            binding.box3.setBackgroundColor(getColor(R.color.red))
            binding.box4.setBackgroundColor(getColor(R.color.red))
            binding.box5.setBackgroundColor(getColor(R.color.red))
        }

        binding.button2.setOnClickListener {
            binding.box1.setBackgroundColor(getColor(R.color.green))
            binding.box2.setBackgroundColor(getColor(R.color.green))
            binding.box3.setBackgroundColor(getColor(R.color.green))
            binding.box4.setBackgroundColor(getColor(R.color.green))
            binding.box5.setBackgroundColor(getColor(R.color.green))
        }

        binding.button3.setOnClickListener {
            binding.box1.setBackgroundColor(getColor(R.color.blue))
            binding.box2.setBackgroundColor(getColor(R.color.blue))
            binding.box3.setBackgroundColor(getColor(R.color.blue))
            binding.box4.setBackgroundColor(getColor(R.color.blue))
            binding.box5.setBackgroundColor(getColor(R.color.blue))
        }

    }

    private fun setBoxesListeners(viewsList: List<View>) {
        viewsList.forEach { view ->
            view.setOnClickListener {
                changeColor(view)
            }
        }
    }

    private fun changeColor(view: View){
        r = Random.nextInt() % 256
        g = Random.nextInt() % 256
        b = Random.nextInt() % 256
        view.setBackgroundColor(Color.rgb(r, g, b))
    }
}