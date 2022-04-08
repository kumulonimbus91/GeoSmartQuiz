package com.nenadvukojevic.quizapp

import android.app.Application
import com.nenadvukojevic.quizapp.database.LeaderBoardDatabase
import com.nenadvukojevic.quizapp.database.RepositoryUser

class quizapplication : Application() {

    val database by lazy { LeaderBoardDatabase.getInstance(this@quizapplication) }

    val repository by lazy { RepositoryUser(database!!.databaseDao()) }

}