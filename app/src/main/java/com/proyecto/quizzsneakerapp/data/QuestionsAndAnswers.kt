package com.proyecto.quizzsneakerapp.data

import com.proyecto.quizzsneakerapp.R
import com.proyecto.quizzsneakerapp.model.QuestionAndAnswerModel


class QuestionAndAnswerProvider {
    companion object {
        fun QuestionAndAnswerProviderReturn(posicion: Int): QuestionAndAnswerModel {
            return QuestionAndAnswerModel[posicion]
        }

        val QuestionAndAnswerModel = listOf<QuestionAndAnswerModel>(
            QuestionAndAnswerModel(
                "¿Cual  es la primera collaboracion de travis scott con nike?",
                list = listOf("Jordan Trunner PE Surfaces", "Air Force", "Jordan 4"),
                "Jordan Trunner PE Surfaces", R.drawable.facilrespuesta1
            ),
            QuestionAndAnswerModel(
                "¿Qué marca de zapatillas es conocida por sus colaboraciones con artistas y diseñadores¿",
                list = listOf("Reebok", "Nike", "New Balance"), "Nike", R.drawable.facilrespuesta2
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas es conocida por su colaboración con Supreme en accesorios y prendas?",
                list = listOf("Adidas", "Vans", "Louis Vuitton"),
                "Louis Vuitton",
                R.drawable.facilrespuesta3
            ),
            QuestionAndAnswerModel(
                "¿Qué diseñador es famoso por su colaboración con Nike en la línea \"The Ten\"?",
                list = listOf("Kanye West", "Virgil Abloh", "Pharrell Williams"),
                "Virgil Abloh",
                R.drawable.facilrespuesta4
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas es conocida por sus colaboraciones con artistas como Kanye West en la línea Yeezy?",
                list = listOf("Puma", "Converse", "Adidas"),
                "Adidas",
                R.drawable.facilrespuesta5
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas es famosa por sus colaboraciones con Disney, Nintendo y otras marcas de entretenimiento?",
                list = listOf("Vans", "Converse", "Asics"),
                "Vans",
                R.drawable.facilrespuesta6
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas se asocia comúnmente con el estilo de vida urbano y la cultura skate, y es conocida por su calzado resistente?",
                list = listOf("Timberland", "Etnies", "Asics"),
                "Etnies",
                R.drawable.facilrespuesta7
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas de streetwear es originaria de Londres y se ha destacado por sus diseños innovadores y colaboraciones exclusivas?",
                list = listOf("A Bathing Ape (Bape)", "Palace", "Stüssy"),
                "Palace",
                R.drawable.facilrespuesta8
            ),
            QuestionAndAnswerModel(
                "¿Qué marca de streetwear es conocida por su enfoque en la sostenibilidad y la utilización de materiales reciclados en sus prendas y zapatillas?",
                list = listOf("HUF", "Parra", "VEJA"),
                "VEJA",
                R.drawable.facilrespuesta9
            ),
            QuestionAndAnswerModel(
                "¿Qué marca de zapatillas lanzó un modelo popular llamado \"Air Fear of God,\" en colaboración con el diseñador Jerry Lorenzo?",
                list = listOf("Puma", "Adidas", "Nike"),
                "Nike",
                R.drawable.facilrespuesta2
            )
        )
    }
}