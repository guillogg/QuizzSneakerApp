package com.proyecto.quizzsneakerapp.model

import androidx.annotation.DrawableRes

data class LevelModel(
    var dificultad: String,
    var cantidadPreguntas: Int,
    @DrawableRes var photo: Int
)
