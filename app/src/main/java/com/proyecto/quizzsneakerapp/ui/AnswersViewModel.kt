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
    val QuestionAndAnswerModel = MutableLiveData<QuestionAndAnswerModel>()
    val Result = MutableLiveData<List<Color>>()
    val finish = MutableLiveData<Boolean>()


    init {
        Result.value = List(3) { Color.Gray }
    }

    fun getQuestion(dificultad: Int) {
        val question = QuestionAndAnswerProvider.QuestionAndAnswerProviderReturn(dificultad,questionIdCounter)
        if (question.list.isNotEmpty()){
            QuestionAndAnswerModel.postValue(question)
        }
        else {
            // Manejar el caso en el que no haya preguntas disponibles para la dificultad proporcionada
            // Puedes agregar un comportamiento específico, como log, mensaje de error, etc.
            Log.e("AnswersViewModel", "No hay preguntas disponibles para la dificultad $dificultad")
        }

    }

    fun NextQuestion(dificultad: Int) {

        viewModelScope.launch {
            delay(100)

            val ListaActual = MutableList(3) { Color.Gray }
            Result.value = ListaActual
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
        Result.value = List(3) { Color.Gray }
    }

    @SuppressLint("SuspiciousIndentation")
    fun CheckAnswers(dificultad: Int,int: Int) {
        val listaActual = Result.value?.toMutableList() ?: mutableListOf()

        if (QuestionAndAnswerModel.value!!.respuesta == QuestionAndAnswerModel.value!!.list[int]) {
            scoreModel.postValue(++score)
            listaActual.add(int, Color.Green)

        } else {
            listaActual.add(int, Color.Red)
        }

        Result.value = listaActual
        NextQuestion(dificultad)
        Log.d("args",score.toString())
    }

}