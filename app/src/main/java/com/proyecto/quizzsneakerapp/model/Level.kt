package com.proyecto.quizzsneakerapp.model

import androidx.annotation.DrawableRes

data class Level(
    var dificultad: String,
    var cantidadPreguntas: String,
    @DrawableRes var photo: Int
)
