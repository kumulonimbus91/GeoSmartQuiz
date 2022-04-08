package com.nenadvukojevic.quizapp

import android.content.ContentValues
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.nenadvukojevic.quizapp.databinding.ActivityQuizQuestionsBinding
import kotlinx.android.synthetic.main.activity_quiz_questions.*
import java.util.*
import kotlin.collections.ArrayList

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1 // current question
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUsername: String? = null
    private lateinit var mBinding: ActivityQuizQuestionsBinding
    private var mInterstitialAd: InterstitialAd? = null
    private final var TAG = "MainActivity"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityQuizQuestionsBinding.inflate(layoutInflater)
        val view = mBinding.root
        setContentView(view)


        mUsername = intent.getStringExtra(Constants.USER_NAME)

        mQuestionsList = Constants.getQuestions()

        Collections.shuffle(mQuestionsList)

        setQuestion()

        MobileAds.initialize(this@QuizQuestionsActivity)



        mBinding.tvOptionOne.setOnClickListener(this)
        mBinding.tvOptionTwo.setOnClickListener(this)
        mBinding.tvOptionThree.setOnClickListener(this)
        mBinding.tvOptionFour.setOnClickListener(this)

        mBinding.btnSubmit.setOnClickListener(this)


    }

    private fun setQuestion() {


        val question = mQuestionsList!![mCurrentPosition - 1]
        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size) {
            btn_submit.text = "FINISH"
        } else {
            btn_submit.text = "SUBMIT"
        }








        mBinding.progressBar.progress = mCurrentPosition
        mBinding.tvProgress.text = "$mCurrentPosition" + "/" + progress_bar.max

        mBinding.tvQuestionId.text = question!!.Question
        question?.image?.let { mBinding.idImage.setImageResource(it) }


        mBinding.tvOptionOne.text = question.optionOne
        mBinding.tvOptionTwo.text = question.optionTwo
        mBinding.tvOptionThree.text = question.optionThree
        mBinding.tvOptionFour.text = question.optionFour








    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, mBinding.tvOptionOne)
        options.add(1, mBinding.tvOptionTwo)
        options.add(2, mBinding.tvOptionThree)
        options.add(3, mBinding.tvOptionFour)


        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_option_one -> {
                selectedOptionView( mBinding.tvOptionOne, 1)
            }
            R.id.tv_option_two -> {
                selectedOptionView(mBinding.tvOptionTwo, 2)
            }
            R.id.tv_option_three -> {
                selectedOptionView(mBinding.tvOptionThree, 3)
            }
            R.id.tv_option_four -> {
                selectedOptionView(mBinding.tvOptionFour, 4)

            }
            R.id.btn_submit -> {









                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++

                    showAdAtSpecificTime(mCurrentPosition)




                    when {
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()

                        }
                        else -> {
                           val intent = Intent (this, ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, mUsername)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList!!.size)
                            startActivity(intent)
                            mCurrentPosition = 0
                            finish()

                        }
                    }

                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)
                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    } else {
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if (mCurrentPosition == mQuestionsList!!.size) {
                        btn_submit.text = "FINISH"
                    } else {
                        btn_submit.text = "Go to next question"
                    }
                    mSelectedOptionPosition = 0 // button is clicked two times before changing question, after first click
                    //mSelectedOptionPosition is again 0, which makes mCurrentPosition increase +1 after second click.


                }








            }
        }

    }

    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
               mBinding.tvOptionOne.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                mBinding.tvOptionTwo.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                mBinding.tvOptionThree.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                mBinding.tvOptionFour.background = ContextCompat.getDrawable(this, drawableView)
            }
        }


    }


    private fun selectedOptionView(tv: TextView, selectedOptionNumber: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNumber

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)


    }

    fun showAdAtSpecificTime(position: Int) {
        if (position % 10 == 0) {
            showFullAd()
        }

    }

    fun showFullAd(){

        val adRequest = AdRequest.Builder().build()
        InterstitialAd.load(this, "ca-app-pub-4256849898367595/8173032748", adRequest, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                super.onAdFailedToLoad(adError)
                Log.d(TAG, adError?.message)
                mInterstitialAd = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {
                super.onAdLoaded(interstitialAd)
                Log.d(TAG, "Ad was loaded.")
                mInterstitialAd = interstitialAd
            }



        } )
        mInterstitialAd?.fullScreenContentCallback = object: FullScreenContentCallback() {
            override fun onAdDismissedFullScreenContent() {
                Log.d(TAG, "Ad was dismissed.")
            }

            override fun onAdFailedToShowFullScreenContent(adError: AdError?) {
                Log.d(TAG, "Ad failed to show.")
            }

            override fun onAdShowedFullScreenContent() {
                Log.d(TAG, "Ad showed fullscreen content.")
                mInterstitialAd = null
            }
        }


        if (mInterstitialAd != null) {
            mInterstitialAd?.show(this)
        } else {
            Log.d("TAG", "The interstitial ad wasn't ready yet.")
        }
    }
}