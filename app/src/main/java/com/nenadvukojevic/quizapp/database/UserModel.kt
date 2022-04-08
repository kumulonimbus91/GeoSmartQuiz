package com.nenadvukojevic.quizapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class UserModel(
    @PrimaryKey(autoGenerate = true)
    var id: Int?,

    @ColumnInfo var userName: String?,

    @ColumnInfo var score: Int?,

    @ColumnInfo var title: String?,

    @ColumnInfo var date: String




        )