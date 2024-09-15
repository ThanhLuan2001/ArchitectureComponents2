package com.learn.english.architecture_components.view_model_livedata

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TimeModel :ViewModel(){
    val second : MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    var time : CountDownTimer = object : CountDownTimer(15000,1000){
        override fun onTick(millisUntilFinished: Long) {
            val timer = millisUntilFinished/1000
            second.value = timer.toInt()
        }

        override fun onFinish() {
            second.value = 99999999
        }

    }

    fun start(){
        time.start()
    }

}