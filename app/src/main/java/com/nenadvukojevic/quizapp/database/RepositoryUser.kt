package com.nenadvukojevic.quizapp.database

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class RepositoryUser(private val dao: DatabaseDao) {

    @WorkerThread
    suspend fun insert(userModel: UserModel) {
        dao.insert(userModel)
    }

    val allUsers: Flow<List<UserModel>> = dao.getAllUsers()


}