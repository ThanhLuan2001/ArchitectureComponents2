package com.learn.english.architecture_components.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.learn.english.architecture_components.R
import com.learn.english.architecture_components.databinding.ActivityLifeCycleBinding
import com.learn.english.architecture_components.model.ImageModel
import com.learn.english.architecture_components.model.VModel

class LifeCycleActivity : AppCompatActivity() {
    lateinit var binding : ActivityLifeCycleBinding
    lateinit var vModel: VModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLifeCycleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        vModel = ViewModelProvider(this)[VModel::class.java]
        binding.tvCount.text = "${vModel.count}"

        binding.btnCount.setOnClickListener {
            vModel.tangCount()
            binding.tvCount.text = "${vModel.count}"
        }
    }
}