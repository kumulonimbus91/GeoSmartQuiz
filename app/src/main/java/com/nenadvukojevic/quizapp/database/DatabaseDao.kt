package com.nenadvukojevic.quizapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface DatabaseDao {
    @Insert
    suspend fun insert(user: UserModel)

    @Query("SELECT * FROM user_table ORDER BY score DESC")
    fun getAllUsers(): Flow<List<UserModel>>



}