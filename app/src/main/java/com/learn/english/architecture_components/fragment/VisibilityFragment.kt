package com.learn.english.architecture_components.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.learn.english.architecture_components.R
import com.learn.english.architecture_components.databinding.FragmentVisibilityBinding
import com.learn.english.architecture_components.model.MyModel

class VisibilityFragment :  Fragment() {
    lateinit var binding: FragmentVisibilityBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_visibility,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myModel = MyModel()
        myModel.status.set(false)
        binding.myModel = myModel
        binding.btnCheck.setOnClickListener {
            myModel.status.set(true)
        }

    }
}