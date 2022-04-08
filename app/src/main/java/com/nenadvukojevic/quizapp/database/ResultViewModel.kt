package com.nenadvukojevic.quizapp.database

import android.app.Application
import androidx.lifecycle.*
import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.*

class ResultViewModel (private val repositoryUser: RepositoryUser): ViewModel() {

    private var viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main +  viewModelJob)



    fun insert(userModel: UserModel) = viewModelScope.launch {
      repositoryUser.insert(userModel)
    }





}
class ResultViewModelFactory(private val repositoryUser: RepositoryUser) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ResultViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ResultViewModel(repositoryUser) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}