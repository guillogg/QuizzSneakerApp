package com.proyecto.quizzsneakerapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.proyecto.quizzsneakerapp.navegation.AppScreens
import com.proyecto.quizzsneakerapp.ui.AnswersViewModel

@Composable
fun ScoreScreen (navController: NavController, answersViewModel: AnswersViewModel, score: Int){

    Box(modifier = Modifier.fillMaxSize()){}
    Text(text = "Tu Puntaje Fue de : $score")
    IconButton(onClick = { navController.navigate(AppScreens.MenuScreen.route)}) {
        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "")
        answersViewModel.reset()
    }
}