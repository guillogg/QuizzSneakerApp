package com.proyecto.quizzsneakerapp.navegation

sealed class AppScreens(val route: String) {
    object MenuScreen: AppScreens ("MenuScreen")
    object LevelSelectScreen: AppScreens("LevelSelectScreen")
    object QuestionsScreen: AppScreens("QuestionsScreen")

    object ScoreScreen:AppScreens("ScoreScreen")
}