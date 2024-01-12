package com.proyecto.quizzsneakerapp.model

import androidx.annotation.DrawableRes

data class QuestionAndAnswerModel(
    var pregunta:String,
    var list: List<String>,
    var respuesta: String,
    @DrawableRes var photo: Int

)
