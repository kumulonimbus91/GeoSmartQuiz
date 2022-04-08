package com.nenadvukojevic.quizapp

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.nenadvukojevic.quizapp.database.*
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.lang.Exception
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*


class ResultActivity : AppCompatActivity() {





    private val mResultViewModel: ResultViewModel by viewModels {
        ResultViewModelFactory((application as quizapplication).repository)

    }


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        var title: String?

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tv_score.text = "Your score is $correctAnswers out of $totalQuestions"




        title = "BEGINNER"

        if (correctAnswers < 50) {
            title = "BEGINNER"

        } else if (correctAnswers > 50 && correctAnswers <= 100) {
            title = "PUPIL"
        } else if (correctAnswers > 100 && correctAnswers <= 140) {
            title = "STUDENT"
        } else if (correctAnswers > 140 && correctAnswers <= 160) {
            title = "MASTER"
        } else if (correctAnswers > 160 && correctAnswers <= 190) {
            title = "EXPERT"
        } else if (correctAnswers > 190 && correctAnswers <= 200) {
            title = "GODLIKE"
        }

//        val date = LocalDateTime.now()
//        val formatter = DateTimeFormatter.BASIC_ISO_DATE
//        val formattedDate = date.format(formatter)




        btn_finish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()

        }


        btn_save.setOnClickListener {
            val userModel: UserModel = UserModel(
                null, username,
                correctAnswers,
                title, getCurrentDayString()
            )
            try {
                mResultViewModel.insert(userModel)
                Log.e("Saved", "Result for $username is saved!!!")
                Toast.makeText(this, "Result saved in leaderboard", Toast.LENGTH_SHORT).show()

            } catch (e: Exception) {
                e.printStackTrace()
            }


        }


    }
    fun getCurrentDayString(): String {
        val date = Date();
        val formatter = SimpleDateFormat("MMM-dd-yyyy")
        return formatter.format(date)
    }


}


