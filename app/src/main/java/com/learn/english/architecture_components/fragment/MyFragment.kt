package com.learn.english.architecture_components.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.learn.english.architecture_components.R
import com.learn.english.architecture_components.activity.MainActivity
import com.learn.english.architecture_components.adapter.UserAdapter
import com.learn.english.architecture_components.databinding.FragmentMyBinding
import com.learn.english.architecture_components.`interface`.ClickUser
import com.learn.english.architecture_components.model.MyModel
import com.learn.english.architecture_components.model.UserModel

class MyFragment : Fragment(){
    lateinit var binding : FragmentMyBinding
    lateinit var listUser : ArrayList<UserModel>
    lateinit var userAdapter: UserAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listUser = getList()
        userAdapter = UserAdapter(listUser,object : ClickUser{
            override fun itemUser(userModel: UserModel) {
                Toast.makeText(activity as MainActivity,userModel.name,Toast.LENGTH_SHORT).show()
            }

        })
        binding.apply {
            rcvUser.setHasFixedSize(true)
            rcvUser.layoutManager = LinearLayoutManager(activity as MainActivity,LinearLayoutManager.VERTICAL,false)
            rcvUser.adapter = userAdapter
            val myModel = MyModel()
            myModel.status.set(true)
            myObj = myModel
            tvStatus.setOnClickListener {
                myModel.status.set(false)
            }
        }
    }

    private fun getList(): ArrayList<UserModel> {
        val list = ArrayList<UserModel>()
        list.add(UserModel("An",20,"VietNam"))
        list.add(UserModel("Binh",20,"VietNam"))
        list.add(UserModel("Nam",20,"VietNam"))
        list.add(UserModel("Hoang",20,"VietNam"))
        list.add(UserModel("Anh",20,"VietNam"))
        return list
    }
}