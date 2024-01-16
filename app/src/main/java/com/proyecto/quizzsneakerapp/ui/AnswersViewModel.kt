package com.proyecto.quizzsneakerapp.ui

import android.annotation.SuppressLint
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.MutableLiveData

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.proyecto.quizzsneakerapp.data.QuestionAndAnswerProvider
import com.proyecto.quizzsneakerapp.model.QuestionAndAnswerModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class AnswersViewModel : ViewModel() {
    private var questionIdCounter = 0
    private var score = 0
    val scoreModel = MutableLiveData(0)
    val QuestionAndAnswerModel = MutableLiveData<QuestionAndAnswerModel>()
    val Result = MutableLiveData<List<Color>>()

    init {
        Result.value = List(3) { Color.Gray }
    }

    fun getQuestion() {

        val question = QuestionAndAnswerProvider.QuestionAndAnswerProviderReturn(questionIdCounter)
        QuestionAndAnswerModel.postValue(question)

    }

    fun NextQuestion() {

       viewModelScope.launch {
           delay(1000)
           questionIdCounter++
            val ListaActual = MutableList(3) { Color.Gray }
            Result.value = ListaActual
           getQuestion()

        }


    }
    fun reset(){
        questionIdCounter = 0
        scoreModel.value = 0
        score = 0
        Result.value = List(3) { Color.Gray }

    }

    @SuppressLint("SuspiciousIndentation")
    fun CheckAnswers(int: Int) {
        val listaActual = Result.value?.toMutableList() ?: mutableListOf()

            if (QuestionAndAnswerModel.value!!.respuesta == QuestionAndAnswerModel.value!!.list[int]) {
                scoreModel.postValue(++score)
                listaActual.add(int, Color.Green)

            } else {
                listaActual.add(int, Color.Red)
            }

        Result.value = listaActual
        NextQuestion()

    }

}