package com.pr.kotlin_room_database

import androidx.room.*


@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getAllUsers():List<User>
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertUser(user: User)
    @Update
    fun updateUser(user: User)
    @Delete
    fun deleteUser(user: User)
    @Query("DELETE FROM users")
    fun deleteAllUsers()
    @Query("SELECT * FROM users WHERE id=:idd ")
    fun loadbyid(idd:Int):User
}