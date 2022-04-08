package com.nenadvukojevic.quizapp.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData

class LeaderBoardViewModel (private val repositoryUser: RepositoryUser) : ViewModel() {

    val allUsersList: LiveData<List<UserModel>> = repositoryUser.allUsers.asLiveData()

}
class LeaderBoardViewModelFactory(private val repository: RepositoryUser) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LeaderBoardViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return LeaderBoardViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}