package com.proyecto.quizzsneakerapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.proyecto.quizzsneakerapp.data.QuestionAndAnswerProvider
import com.proyecto.quizzsneakerapp.model.QuestionAndAnswerModel


class AnswersViewModel: ViewModel() {
    private var questionIdCounter = 1
    val QuestionAndAnswerModel = MutableLiveData<QuestionAndAnswerModel>()
    fun getQuestion(){

        val question = QuestionAndAnswerProvider.QuestionAndAnswerProviderReturn(questionIdCounter)
        QuestionAndAnswerModel.postValue(question)

    }
    fun NextQuestion(){
        questionIdCounter++
        getQuestion()
    }
}