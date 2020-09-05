package com.example.kotlinsingletonexample

import com.example.kotlinsingletonexample.models.User

object singletonObject {
    val singletonUser: User by lazy {
        User("jk@gmail.com","dkrocks25","image.png")
    }
}