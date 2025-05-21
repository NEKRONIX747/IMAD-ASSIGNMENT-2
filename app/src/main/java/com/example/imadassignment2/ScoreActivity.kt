package com.example.imadassignment2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.score)
//here is where i have declared my variables to be used as well as initialized them to show the number of questions and the score of correct answers
        //Author: OpenAI
        //AI: ChatGPT
        //URL:https://chatgpt.com/?utm_source=google&utm_medium=paidsearch_brand&utm_campaign=DEPT_SEM_Google_Brand_Acquisition_EMEA_SouthAfrica_Consumer_CPA_BAU_Mix_OfficialEnglish_HighRisk&utm_term=chatgpt&gad_source=1&gad_campaignid=22233293514&gclid=CjwKCAjw87XBBhBIEiwAxP3_A79Ttj3npBGszWrAiKL-FEpGDVKnfb-D7YVY6wTdl6aynBfwQySDyBoCLWsQAvD_BwE
        val tally = intent.getIntExtra("tally", 0)
        val totalQuestions = intent.getIntExtra("Total Questions", 5)
        val questions = intent.getStringArrayExtra("questions") ?: arrayOf()
        val answers = intent.getBooleanArrayExtra("answers") ?: booleanArrayOf()
//more variables declared and linked to the xml file
        val textViewResult = findViewById<TextView>(R.id.textViewResult)
        val textViewFb = findViewById<TextView>(R.id.textViewFb)
        val buttonReview = findViewById<Button>(R.id.buttonReview)
        val buttonExit = findViewById<Button>(R.id.buttonExit)
        val textViewReview = findViewById<TextView>(R.id.textViewReview)
//this is how i displayed my score and total questions
        textViewResult.text = "$tally/$totalQuestions"
//this is the code for the feedback for the game where a message will pop up dependant on the users score
        //Author: OpenAI
        //AI: ChatGPT
        //URL:https://chatgpt.com/?utm_source=google&utm_medium=paidsearch_brand&utm_campaign=DEPT_SEM_Google_Brand_Acquisition_EMEA_SouthAfrica_Consumer_CPA_BAU_Mix_OfficialEnglish_HighRisk&utm_term=chatgpt&gad_source=1&gad_campaignid=22233293514&gclid=CjwKCAjw87XBBhBIEiwAxP3_A79Ttj3npBGszWrAiKL-FEpGDVKnfb-D7YVY6wTdl6aynBfwQySDyBoCLWsQAvD_BwE
        val feedback = when {
            tally == totalQuestions -> "Congratulations! You got all the questions right!"
            tally >= totalQuestions * 0.7 -> "Good job! You did well."
            tally >= totalQuestions * 0.4 -> "You can do better."
            else -> "Keep practicing!"

        } //Author: OpenAI
        //AI: ChatGPT
        //URL:https://chatgpt.com/?utm_source=google&utm_medium=paidsearch_brand&utm_campaign=DEPT_SEM_Google_Brand_Acquisition_EMEA_SouthAfrica_Consumer_CPA_BAU_Mix_OfficialEnglish_HighRisk&utm_term=chatgpt&gad_source=1&gad_campaignid=22233293514&gclid=CjwKCAjw87XBBhBIEiwAxP3_A79Ttj3npBGszWrAiKL-FEpGDVKnfb-D7YVY6wTdl6aynBfwQySDyBoCLWsQAvD_BwE
        textViewFb.text = feedback
//this is where i coded the button for reviewing the questions and answers
        buttonReview.setOnClickListener {
            val reviewText = buildString {
                for (i in questions.indices) {
                    append("${i+1}. ${questions[i]}\nAnswer: ${if (answers[i]) "True" else "False"}\n\n")
                }
            } //Author: OpenAI
            //AI: ChatGPT
            //URL:https://chatgpt.com/?utm_source=google&utm_medium=paidsearch_brand&utm_campaign=DEPT_SEM_Google_Brand_Acquisition_EMEA_SouthAfrica_Consumer_CPA_BAU_Mix_OfficialEnglish_HighRisk&utm_term=chatgpt&gad_source=1&gad_campaignid=22233293514&gclid=CjwKCAjw87XBBhBIEiwAxP3_A79Ttj3npBGszWrAiKL-FEpGDVKnfb-D7YVY6wTdl6aynBfwQySDyBoCLWsQAvD_BwE
            textViewReview.text = reviewText
            textViewReview.visibility = View.VISIBLE
            buttonReview.isEnabled = false
            buttonReview.text = "Review Shown"
//this button is the exit button the finish affinity command will terminate all processes in the app
            buttonExit.setOnClickListener {
                finishAffinity()
            }





        }
    }}

