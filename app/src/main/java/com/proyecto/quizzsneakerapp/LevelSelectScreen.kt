package com.proyecto.quizzsneakerapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.proyecto.quizzsneakerapp.data.getLevels
import com.proyecto.quizzsneakerapp.navegation.AppScreens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LevelSelectScreen(navController: NavHostController) {
    val niveles = getLevels()
    Box(modifier = Modifier.fillMaxSize(),contentAlignment = Alignment.Center){
        LazyColumn(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            itemsIndexed(niveles) { index, nivelItem ->
                Card(

                    modifier = Modifier
                        .clickable { /* Manejar el clic aquí */ }
                        .padding(top = 8.dp, bottom = 8.dp, end = 16.dp, start = 16.dp)
                        .height(50.dp)
                        .width(500.dp), shape = RoundedCornerShape(8.dp), onClick = {navController.navigate(AppScreens.Questions.route)}

                    ) {
                    Text(
                        text = nivelItem.dificultad,
                        fontSize = 40.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }

}
