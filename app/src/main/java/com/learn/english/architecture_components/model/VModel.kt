package com.learn.english.architecture_components.model

import androidx.lifecycle.ViewModel

class VModel :ViewModel(){
    var count = 0

    fun tangCount(){
        count+=1
    }
}