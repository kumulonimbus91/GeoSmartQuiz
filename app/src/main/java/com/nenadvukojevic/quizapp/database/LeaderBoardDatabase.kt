package com.nenadvukojevic.quizapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [UserModel::class], version = 2, exportSchema = false)
abstract class LeaderBoardDatabase: RoomDatabase () {

    abstract fun databaseDao (): DatabaseDao


    companion object {
        @Volatile
        private var INSTANCE: LeaderBoardDatabase? = null

        fun getInstance(context: Context) : LeaderBoardDatabase? {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(context.applicationContext, LeaderBoardDatabase::class.java,
                        "user_database").fallbackToDestructiveMigration().build()
                    INSTANCE = instance
                }
                return instance
            }
        }

    }


}

