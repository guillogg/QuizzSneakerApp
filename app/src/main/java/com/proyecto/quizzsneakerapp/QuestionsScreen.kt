package com.proyecto.quizzsneakerapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import com.proyecto.quizzsneakerapp.navegation.AppScreens
import com.proyecto.quizzsneakerapp.ui.AnswersViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuestionsScreen(navController: NavController, answersViewModel: AnswersViewModel) {
    // Observa los cambios en el ViewModel
    val questionAndAnswerModel by remember { answersViewModel.QuestionAndAnswerModel }.observeAsState()

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        answersViewModel.getQuestion()

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier.fillMaxHeight()
        ) {
            questionAndAnswerModel?.let {
                Text(
                    text = it.pregunta,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                Card(
                    modifier = Modifier
                        .clickable { answersViewModel.NextQuestion() }
                        .padding(top = 8.dp, bottom = 8.dp, end = 16.dp, start = 16.dp)
                        .height(50.dp)
                        .width(500.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Text(text = it.list[0])
                    }
                }
                Card(
                    modifier = Modifier
                        .clickable { answersViewModel.NextQuestion() }
                        .padding(top = 8.dp, bottom = 8.dp, end = 16.dp, start = 16.dp)
                        .height(50.dp)
                        .width(500.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Text(text = it.list[1])
                    }
                }
                Card(
                    modifier = Modifier
                        .clickable { answersViewModel.NextQuestion() }
                        .padding(top = 8.dp, bottom = 8.dp, end = 16.dp, start = 16.dp)
                        .height(50.dp)
                        .width(500.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Text(text = it.list[2])
                    }
                }
            }
        }
    }

}
