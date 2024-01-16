package com.proyecto.quizzsneakerapp.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.proyecto.quizzsneakerapp.LevelSelectScreen
import com.proyecto.quizzsneakerapp.MenuScreen
import com.proyecto.quizzsneakerapp.QuestionsScreen
import com.proyecto.quizzsneakerapp.ui.AnswersViewModel

@Composable
fun navigation(navHostController: NavHostController, answersViewModel: AnswersViewModel) {
    NavHost(navController = navHostController, startDestination = AppScreens.MenuScreen.route) {
        composable(route = AppScreens.MenuScreen.route) {
            MenuScreen(navHostController)
        }
        composable(route = AppScreens.LevelSelectScreen.route) {
            LevelSelectScreen(navHostController)
        }
        composable(route = AppScreens.QuestionsScreen.route) {
            QuestionsScreen(navHostController, answersViewModel)
        }
    }
}