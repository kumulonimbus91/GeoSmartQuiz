package com.nenadvukojevic.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager

import com.nenadvukojevic.quizapp.database.Adapter
import com.nenadvukojevic.quizapp.database.LeaderBoardViewModel
import com.nenadvukojevic.quizapp.database.LeaderBoardViewModelFactory
import com.nenadvukojevic.quizapp.databinding.ActivityLeaderBoardBinding

class LeaderBoardActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityLeaderBoardBinding


    private val mLeaderBoardViewModel: LeaderBoardViewModel by viewModels {
        LeaderBoardViewModelFactory((application as quizapplication).repository)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityLeaderBoardBinding.inflate(layoutInflater)
        val view = mBinding.root


        setContentView(view)

        mBinding.backBtn.setOnClickListener {
          val intent = Intent(this@LeaderBoardActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }







        mLeaderBoardViewModel.allUsersList.observe(this) { list ->
            list.let {
                mBinding.rcViewLeader.layoutManager = LinearLayoutManager(this@LeaderBoardActivity)
                val adapter = Adapter()

                mBinding.rcViewLeader.adapter = adapter

                if (it.isNotEmpty()) {
                    mBinding.rcViewLeader.visibility = View.VISIBLE
                    mBinding.emptyList.visibility = View.GONE
                    adapter.userList(it)


                } else {
                    mBinding.rcViewLeader.visibility = View.GONE
                    mBinding.emptyList.visibility = View.VISIBLE
                }
            }

        }


    }
}