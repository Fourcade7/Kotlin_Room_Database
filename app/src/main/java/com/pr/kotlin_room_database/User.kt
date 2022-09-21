package com.pr.kotlin_room_database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "users")
data class User constructor(

    @PrimaryKey(autoGenerate = true)@ColumnInfo(name = "id") var id: Int=0,
    @ColumnInfo(name = "fullname") val fullname: String,
    @ColumnInfo(name = "lastname") val lastname: String
)



