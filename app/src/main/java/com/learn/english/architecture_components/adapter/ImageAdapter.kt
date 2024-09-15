package com.learn.english.architecture_components.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.learn.english.architecture_components.databinding.ItemImageBinding
import com.learn.english.architecture_components.model.ImageModel

class ImageAdapter(val listImage : ArrayList<ImageModel>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(){
    inner class ImageViewHolder(val binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(imageModel: ImageModel){
            binding.imageModel = imageModel
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemImageBinding.inflate(layoutInflater,parent,false)
        return ImageViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listImage.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val imageModel = listImage[position]
        holder.bind(imageModel)
    }
}