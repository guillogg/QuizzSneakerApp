package com.proyecto.quizzsneakerapp

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import com.proyecto.quizzsneakerapp.navegation.AppScreens
import com.proyecto.quizzsneakerapp.ui.AnswersViewModel
import kotlinx.coroutines.delay
import kotlin.math.log


@Composable
fun QuestionsScreen(navController: NavController, answersViewModel: AnswersViewModel) {
    // Observa los cambios en el ViewModel

    val questionAndAnswerModel by remember { answersViewModel.QuestionAndAnswerModel }.observeAsState()
    val result: List<Color> by remember { answersViewModel.Result }.observeAsState(listOf(Color.Gray,Color.Gray,Color.Gray))
    val score by remember { answersViewModel.scoreModel }.observeAsState()


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {

                    navController.popBackStack()
                    answersViewModel.reset()
            }) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "")

            }
            Text(text = "Puntaje:$score", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        }
    }

    answersViewModel.getQuestion()

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {



        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxHeight()
        ) {
            questionAndAnswerModel?.let {
                Spacer(modifier = Modifier.height(20.dp))
                Log.d("funciona","hasta aca entro")
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .background(
                            Color.Gray,
                            shape = RoundedCornerShape(8.dp)
                        ),
                ) {
                    Text(
                        text = it.pregunta,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(16.dp)
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                Card(
                    modifier = Modifier
                        .clickable {
                            answersViewModel.CheckAnswers(0)

                        }
                        .padding(top = 8.dp, bottom = 8.dp, end = 16.dp, start = 16.dp)
                        .height(50.dp)
                        .width(500.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .background(result[0])
                    ) {
                        Text(
                            text = it.list[0],
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Card(
                    modifier = Modifier
                        .clickable {
                            answersViewModel.CheckAnswers(1)

                        }
                        .padding(top = 8.dp, bottom = 8.dp, end = 16.dp, start = 16.dp)
                        .height(50.dp)
                        .width(500.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .background(result[1])
                    ) {
                        Text(
                            text = it.list[1],
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Card(
                    modifier = Modifier
                        .clickable {
                            answersViewModel.CheckAnswers(2)

                        }
                        .padding(top = 8.dp, bottom = 8.dp, end = 16.dp, start = 16.dp)
                        .height(50.dp)
                        .width(500.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .background(result[2])
                    ) {
                        Text(
                            text = it.list[2],
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }

}
