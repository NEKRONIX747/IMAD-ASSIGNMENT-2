package com.example.imadassignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//here i have declared my array named questions
class FlashcardActivity : AppCompatActivity() {
    private val questions = arrayOf(
        "Was Nelson Mandela president in 1994?",
        "Did Germany win world war 2?",
        "Did America participate in world war 2?",
        "Did world war 2 start in 1945?",
        "Did world war 1 end in 1918?"
    )//here i have declared my second array named answers these arrays are used together also known as a parallel array
    private val answers = booleanArrayOf(true, false, true, false, true)
//this is where i have initialized my array and score here i have called it tally
    private var currentQuestionIndex = 0
    private var tally = 0
    private var answerSelected = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.flashcard)
//this is where i have declared any additional variables used these are also linked to my xml file
        val textViewQuestions = findViewById<TextView>(R.id.textViewQuestions)
        val textViewFeedback = findViewById<TextView>(R.id.textViewFeedback)
        val buttonTrue = findViewById<Button>(R.id.buttonTrue)
        val buttonFalse = findViewById<Button>(R.id.buttonFalse)
        val buttonNext = findViewById<Button>(R.id.buttonNext)
//this is where i have started to write the code for the game
        textViewQuestions.text = questions[currentQuestionIndex]
//here is where i coded up the feedback for the user
//Author: OpenAI
//AI: ChatGPT
//URL:https://chatgpt.com/?utm_source=google&utm_medium=paidsearch_brand&utm_campaign=DEPT_SEM_Google_Brand_Acquisition_EMEA_SouthAfrica_Consumer_CPA_BAU_Mix_OfficialEnglish_HighRisk&utm_term=chatgpt&gad_source=1&gad_campaignid=22233293514&gclid=CjwKCAjw87XBBhBIEiwAxP3_A79Ttj3npBGszWrAiKL-FEpGDVKnfb-D7YVY6wTdl6aynBfwQySDyBoCLWsQAvD_BwE
        fun checkAnswer(userAnswer: Boolean) {
            val correctAnswer = answers[currentQuestionIndex]
            if (userAnswer == correctAnswer) {
                tally++
                textViewFeedback.text = "Correct!"
            } else {
                textViewFeedback.text = "Incorrect!"
            }//the code here keeps the user from changing there answer once selected as well as keeps the feedback invisible until the question is answered
            textViewFeedback.visibility = TextView.VISIBLE
            answerSelected = true
            buttonTrue.isEnabled = false
            buttonFalse.isEnabled = false
        }//this is the code for the true button
        buttonTrue.setOnClickListener {
            if (!answerSelected) {
                checkAnswer(true)

            }
        }
//this is the code for the false button
        buttonFalse.setOnClickListener {
            if (!answerSelected) {
                checkAnswer(false)

            }
//here is where i have used a for loop to iterate through the answers as well as where i have done the code for the next button the next button will only move to the next screen if all questions are answered
        } //Author: OpenAI
        //AI: ChatGPT
        //URL:https://chatgpt.com/?utm_source=google&utm_medium=paidsearch_brand&utm_campaign=DEPT_SEM_Google_Brand_Acquisition_EMEA_SouthAfrica_Consumer_CPA_BAU_Mix_OfficialEnglish_HighRisk&utm_term=chatgpt&gad_source=1&gad_campaignid=22233293514&gclid=CjwKCAjw87XBBhBIEiwAxP3_A79Ttj3npBGszWrAiKL-FEpGDVKnfb-D7YVY6wTdl6aynBfwQySDyBoCLWsQAvD_BwE
        buttonNext.setOnClickListener {
            if (answerSelected) {
                var foundNext = false
                while (!foundNext) {
                    currentQuestionIndex++
                    if (currentQuestionIndex >= questions.size) {
                        val intent = Intent(this, ScoreActivity::class.java)
                        intent.putExtra("tally", tally)
                        intent.putExtra("Total Questions", questions.size)
                        intent.putExtra("questions", questions)
                        intent.putExtra("answers", answers)
                        startActivity(intent)
                        finish()
                        break
                    } else {
                        foundNext = true
                        answerSelected = false
                        textViewFeedback.visibility = TextView.INVISIBLE
                        buttonTrue.isEnabled = true
                        buttonFalse.isEnabled = true
                        textViewQuestions.text = questions[currentQuestionIndex]
                    }
                }
            }
        }
    }}




