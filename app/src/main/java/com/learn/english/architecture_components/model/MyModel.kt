package com.learn.english.architecture_components.model

import androidx.databinding.BaseObservable
import androidx.databinding.ObservableBoolean

class MyModel : BaseObservable(){
    val status = ObservableBoolean()
}