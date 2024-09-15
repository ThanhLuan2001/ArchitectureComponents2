package com.learn.english.architecture_components.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.learn.english.architecture_components.databinding.ItemUserBinding
import com.learn.english.architecture_components.`interface`.ClickUser
import com.learn.english.architecture_components.model.UserModel

class UserAdapter(val listUser : ArrayList<UserModel>,val clickUser: ClickUser) : RecyclerView.Adapter<UserAdapter.UserViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemUserBinding.inflate(layoutInflater,parent,false)
        return UserViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listUser.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val userModel = listUser[position]
        holder.bind(userModel)
    }

    inner class UserViewHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(userModel: UserModel){
            binding.userModel = userModel
            binding.onClick = UserOnClick(userModel)
        }
    }

    inner class UserOnClick(val userModel: UserModel){
        fun notifiModel() : Boolean{
            clickUser.itemUser(userModel)
            return true
        }
    }
}