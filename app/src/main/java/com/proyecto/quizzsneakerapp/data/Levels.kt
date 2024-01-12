package com.proyecto.quizzsneakerapp.data

import com.proyecto.quizzsneakerapp.R
import com.proyecto.quizzsneakerapp.model.LevelModel

fun getLevels(): List<LevelModel> {
    return listOf(
        LevelModel("Facil", 10, R.drawable.nivelfacil),
        LevelModel("Normal", 10, R.drawable.nivelnormal),
        LevelModel("Dificil", 10, R.drawable.niveldificil)
    )
}