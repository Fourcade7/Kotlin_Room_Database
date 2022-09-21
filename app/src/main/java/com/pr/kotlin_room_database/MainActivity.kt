package com.pr.kotlin_room_database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textview=findViewById<TextView>(R.id.textview1)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "users"
        ).allowMainThreadQueries().build()

        val userDao = db.userDao()
        val user=User(0,"Fourade7","Aminov")
        userDao.insertUser(user)

        textview.text="id: ${userDao.getAllUsers().get(0).id}\nfullname: ${userDao.getAllUsers().get(0).fullname}\nsize: ${userDao.getAllUsers().size}"



    }
}