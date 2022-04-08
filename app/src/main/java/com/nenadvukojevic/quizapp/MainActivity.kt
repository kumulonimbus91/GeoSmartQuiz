package com.nenadvukojevic.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.nenadvukojevic.quizapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mBinding.root

        setContentView(view)

        Log.e("CREATED", "MainActivity created")




        mBinding.btnStart.setOnClickListener {

            if (mBinding.etName.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, mBinding.etName.text.toString())

                startActivity(intent)
                finish() // go back to main act after its finished.
            }


        }
        mBinding.leaderBoard.setOnClickListener {
            val intent = Intent(this, LeaderBoardActivity::class.java)
            startActivity(intent)
            finish()






        }

        if (!isTaskRoot) {
            finish()

        }

    }






}