package com.proyecto.quizzsneakerapp.data

import com.proyecto.quizzsneakerapp.R
import com.proyecto.quizzsneakerapp.model.Level

fun getLevels(): List<Level> {
    return listOf(
        Level("Facil", 10, R.drawable.nivelfacil),
        Level("Normal", 10, R.drawable.nivelnormal),
        Level("Dificil", 10, R.drawable.niveldificil)
    )
}