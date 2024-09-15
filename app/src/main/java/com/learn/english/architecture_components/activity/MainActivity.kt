package com.learn.english.architecture_components.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.learn.english.architecture_components.R
import com.learn.english.architecture_components.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)
        binding.source = R.drawable.img
        binding.onClick = MainActivityOnClick()
    }

    inner class MainActivityOnClick(){
        fun notification(){
            Toast.makeText(this@MainActivity,"Hello",Toast.LENGTH_SHORT).show()
        }
    }
}