package com.example.kotlinsingletonexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.kotlinsingletonexample.models.User
import com.example.kotlinsingletonexample.repository.Repository

class MainViewModel : ViewModel(){
    private val _userid: MutableLiveData<String> = MutableLiveData()
    val user : LiveData<User> = Transformations
        .switchMap(_userid){
            Repository.getUser(it)
        }
    fun setUserId(userId:String){
        val update = userId
        if(_userid.value == update){
            return
        }
        _userid.value=update
    }
    fun cancelJobs(){
        Repository.cancelJobs()
    }
}