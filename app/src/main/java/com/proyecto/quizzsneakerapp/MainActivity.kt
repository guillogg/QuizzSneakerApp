package com.proyecto.quizzsneakerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.proyecto.quizzsneakerapp.navegation.navigation
import com.proyecto.quizzsneakerapp.ui.AnswersViewModel
import com.proyecto.quizzsneakerapp.ui.theme.QuizzSneakerAppTheme

class MainActivity : ComponentActivity() {
    private val answersViewModel: AnswersViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizzSneakerAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val navController = rememberNavController()
                    navigation(navController, answersViewModel)
                }
            }
        }
    }
}