package com.learn.english.architecture_components.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.learn.english.architecture_components.activity.MainActivity
import com.learn.english.architecture_components.adapter.ImageAdapter
import com.learn.english.architecture_components.databinding.FragmentImageBinding
import com.learn.english.architecture_components.model.ImageModel

class ImageFragment : Fragment() {
    lateinit var binding : FragmentImageBinding
    lateinit var listImage : ArrayList<ImageModel>
    lateinit var imageAdapter: ImageAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentImageBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        listImage = getList()
        imageAdapter = ImageAdapter(listImage)
        binding.rcvImage.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(activity as MainActivity,LinearLayoutManager.VERTICAL,false)
            adapter = imageAdapter
        }
    }

    private fun getList(): ArrayList<ImageModel> {
        val list : ArrayList<ImageModel> = ArrayList()
        list.apply {
            add(ImageModel("https://images.unsplash.com/photo-1509043759401-136742328bb3?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8MXx8fGVufDB8fHx8fA%3D%3D"))
            add(ImageModel("https://media.istockphoto.com/id/476004264/photo/windy-dandelion-in-spring-time.webp?b=1&s=170667a&w=0&k=20&c=uohBE1Df5Y8aTNTy4jNTCOUtUm6SRWkpAxqmhA955ds="))
            add(ImageModel("https://www.bhmpics.com/downloads/screen-saver-backgrounds-Wallpapers/71.forest-wallpaper-af78609605b14f7c9b999d8b2f49c0d9.jpg"))
            add(ImageModel("https://png.pngtree.com/thumb_back/fh260/background/20190223/ourmid/pngtree-chinese-valentines-day-sheng-hui-for-love-free-single-valentines-day-image_72949.jpg"))
            add(ImageModel("https://media.istockphoto.com/id/870364324/photo/silver-grasses-on-datun-mountain-with-sunset-in-yangmingshan-national-park.jpg?s=612x612&w=0&k=20&c=FgDF2y_BDURPGNnrM2E0RxcV9k38r89j84whWZFZwSo="))
        }
        return list
    }
}