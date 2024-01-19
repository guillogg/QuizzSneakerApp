package com.proyecto.quizzsneakerapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.proyecto.quizzsneakerapp.navegation.AppScreens
import com.proyecto.quizzsneakerapp.ui.AnswersViewModel

@Composable
fun ScoreScreen(navController: NavController, answersViewModel: AnswersViewModel, score: Int) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // Columna principal para organizar elementos
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Texto centrado
            Text(
                text = "Tu Puntaje Fue de:",
                fontSize = 28.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )

            // Texto grande y en negrita para el puntaje
            Text(
                text = "$score",
                fontSize = 100.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 32.dp)
            )

            // Botón centrado
            Button(
                onClick = {
                    navController.navigate(AppScreens.MenuScreen.route)
                    answersViewModel.reset()
                }
            ) {
                Text(text = "Menu")
            }
        }
    }}
