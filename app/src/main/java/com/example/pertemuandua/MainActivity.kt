package com.example.pertemuandua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pertemuandua.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var number = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            txtNumber.text = number.toString()

            btnCount.setOnClickListener{
                number ++
                txtNumber.text = number.toString()

                if (number % 2 == 0){
                    txtNumber.setBackgroundResource(R.color.purple_500)
                } else txtNumber.setBackgroundResource(R.color.yellow)
            }
            btnToast.setOnClickListener{
                Toast.makeText(this@MainActivity, number.toString(), Toast.LENGTH_SHORT).show()

            }
        }

    }
}