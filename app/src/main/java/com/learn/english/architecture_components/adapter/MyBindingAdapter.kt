package com.learn.english.architecture_components.adapter

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class MyBindingAdapter {

    companion object{
        @BindingAdapter("imageUrl","default")
        @JvmStatic
        fun loadImage(view: ImageView,imageUrl : String,default : Drawable){
            Glide.with(view.context).load(imageUrl).error(default).into(view)
        }
    }
}