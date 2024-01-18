package com.proyecto.quizzsneakerapp.navegation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.proyecto.quizzsneakerapp.LevelSelectScreen
import com.proyecto.quizzsneakerapp.MenuScreen
import com.proyecto.quizzsneakerapp.QuestionsScreen
import com.proyecto.quizzsneakerapp.ScoreScreen
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
        composable(
            route = AppScreens.QuestionsScreen.route + "/{dificultad}",
            arguments = listOf(navArgument(name = "dificultad") { type = NavType.IntType })
        ) { backStackEntry ->

            val dificultad = backStackEntry.arguments?.getInt("dificultad")
            Log.d("dificultad","$dificultad")
            if (dificultad != null) {
                QuestionsScreen(
                    navHostController,
                    answersViewModel,
                    dificultad = dificultad
                )
            } else {
                // Manejar el caso en el que dificultad sea nulo, si es necesario.
            }
        }





        composable(route = AppScreens.ScoreScreen.route) {
            ScoreScreen(navHostController, answersViewModel)
        }
    }
}
