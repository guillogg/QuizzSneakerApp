package com.proyecto.quizzsneakerapp.data

import com.proyecto.quizzsneakerapp.R
import com.proyecto.quizzsneakerapp.model.LevelModel

fun getLevels(): List<LevelModel> {
    return listOf(
        LevelModel("Facil", 10,0),
        LevelModel("Normal", 10, 1),
        LevelModel("Dificil", 10,2)
    )
}