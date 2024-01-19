package com.proyecto.quizzsneakerapp.ui

import android.annotation.SuppressLint
import android.util.Log
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
    val questionAndAnswerModel = MutableLiveData<QuestionAndAnswerModel>()
    val result = MutableLiveData<List<Color>>()
    val finish = MutableLiveData<Boolean>()


    init {
        result.value = List(3) { Color.Gray }
    }

    fun getQuestion(dificultad: Int) {
        val question = QuestionAndAnswerProvider.questionAndAnswerProviderReturn(dificultad,questionIdCounter)
        if (question.list.isNotEmpty()){
            questionAndAnswerModel.postValue(question)
        }
        else {
            // Manejar el caso en el que no haya preguntas disponibles para la dificultad proporcionada
            // Puedes agregar un comportamiento específico, como log, mensaje de error, etc.
            Log.e("AnswersViewModel", "No hay preguntas disponibles para la dificultad $dificultad")
        }

    }

    private fun nextQuestion(dificultad: Int) {

        viewModelScope.launch {
            delay(100)

            val listaActual = MutableList(3) { Color.Gray }
            result.value = listaActual
            ++questionIdCounter
            if(questionIdCounter==10){
                finish.value = true
            }else{
                getQuestion(dificultad)
            }

        }

    }
    fun setFinish(){
        finish.value = false

    }


    fun reset() {
        questionIdCounter = 0
        scoreModel.value = 0
        score = 0
        result.value = List(3) { Color.Gray }
    }

    @SuppressLint("SuspiciousIndentation")
    fun checkAnswers(dificultad: Int, int: Int) {
        val listaActual = result.value?.toMutableList() ?: mutableListOf()

        if (questionAndAnswerModel.value!!.respuesta == questionAndAnswerModel.value!!.list[int]) {
            scoreModel.postValue(++score)
            listaActual.add(int, Color.Green)

        } else {
            listaActual.add(int, Color.Red)
        }

        result.value = listaActual
        nextQuestion(dificultad)
        Log.d("args",score.toString())
    }

}