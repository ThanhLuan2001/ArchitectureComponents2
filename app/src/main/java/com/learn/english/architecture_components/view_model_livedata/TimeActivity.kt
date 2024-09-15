package com.learn.english.architecture_components.view_model_livedata

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.learn.english.architecture_components.R
import com.learn.english.architecture_components.databinding.ActivityTimeBinding

class TimeActivity : AppCompatActivity() {
    lateinit var binding : ActivityTimeBinding
    lateinit var timeModel: TimeModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_time)
        setContentView(binding.root)
        binding.onClick = TimeClick()
        timeModel = ViewModelProvider(this)[TimeModel::class.java]
        timeModel.second.observe(this) {
            binding.second = it.toString()
        }

        binding.btnStart.setOnClickListener {  }
    }
    inner class TimeClick{
        fun start(){
            timeModel.start()
        }
    }
}