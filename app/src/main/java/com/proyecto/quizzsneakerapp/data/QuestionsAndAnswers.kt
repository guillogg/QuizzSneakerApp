package com.proyecto.quizzsneakerapp.data

import android.util.Log
import com.proyecto.quizzsneakerapp.R
import com.proyecto.quizzsneakerapp.model.QuestionAndAnswerModel


class QuestionAndAnswerProvider {
    companion object {


        private val QuestionAndAnswerModel = mutableListOf<List<QuestionAndAnswerModel>>()
        val facil = listOf(
            QuestionAndAnswerModel(
                "¿Cual  es la primera collaboracion de travis scott con nike?",
                list = listOf("Jordan Trunner PE Surfaces", "Air Force", "Jordan 4"),
                "Jordan Trunner PE Surfaces"
            ),
            QuestionAndAnswerModel(
                "¿Qué marca de zapatillas es conocida por sus colaboraciones con artistas y diseñadores¿",
                list = listOf("Reebok", "Nike", "New Balance"), "Nike"
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas es conocida por su colaboración con Supreme en accesorios y prendas?",
                list = listOf("Adidas", "Vans", "Louis Vuitton"),
                "Louis Vuitton"
            ),
            QuestionAndAnswerModel(
                "¿Qué diseñador es famoso por su colaboración con Nike en la línea \"The Ten\"?",
                list = listOf("Kanye West", "Virgil Abloh", "Pharrell Williams"),
                "Virgil Abloh"
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas es conocida por sus colaboraciones con artistas como Kanye West en la línea Yeezy?",
                list = listOf("Puma", "Converse", "Adidas"),
                "Adidas"
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas es famosa por sus colaboraciones con Disney, Nintendo y otras marcas de entretenimiento?",
                list = listOf("Vans", "Converse", "Asics"),
                "Vans"
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas se asocia comúnmente con el estilo de vida urbano y la cultura skate, y es conocida por su calzado resistente?",
                list = listOf("Timberland", "Etnies", "Asics"),
                "Etnies"
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas de streetwear es originaria de Londres y se ha destacado por sus diseños innovadores y colaboraciones exclusivas?",
                list = listOf("A Bathing Ape (Bape)", "Palace", "Stüssy"),
                "Palace"
            ),
            QuestionAndAnswerModel(
                "¿Qué marca de streetwear es conocida por su enfoque en la sostenibilidad y la utilización de materiales reciclados en sus prendas y zapatillas?",
                list = listOf("HUF", "Parra", "VEJA"),
                "VEJA"
            ),
            QuestionAndAnswerModel(
                "¿Qué marca de zapatillas lanzó un modelo popular llamado \"Air Fear of God,\" en colaboración con el diseñador Jerry Lorenzo?",
                list = listOf("Puma", "Adidas", "Nike"),
                "Nike"
            ),
            QuestionAndAnswerModel(
                "",
                list = listOf("", "", ""),
                ""
            )
        )
        val normal = listOf(
            QuestionAndAnswerModel(
                "¿Qué marca de streetwear se asoció con el artista japonés Takashi Murakami para lanzar una colección que incluye zapatillas y prendas con sus icónicos diseños florales y de calaveras?",
                list = listOf("Bape", "Neighborhood", "Visvim"),
                "Bape"
            ),
            QuestionAndAnswerModel(
                " ¿Qué marca de streetwear lanzó una colección llamada \"Graffiti,\" en colaboración con el legendario artista del graffiti Futura 2000?",
                list = listOf("Stüssy", "Undefeated", "ACRONYM"), "Stüssy"
            ),
            QuestionAndAnswerModel(
                "¿Cuál es el nombre del modelo de zapatillas de New Balance lanzado en colaboración con la tienda Concepts, que presenta un diseño inspirado en langostas?",
                list = listOf("New Balance 990", "New Balance 997", "New Balance 998"),
                "New Balance 998"
            ),
            QuestionAndAnswerModel(
                "¿Cuál es el nombre del modelo de zapatillas de Nike lanzado en colaboración con el diseñador Tom Sachs, conocido por su diseño funcional y estético?",
                list = listOf("Nike Mars Yard 2.0", "NikeCraft x Tom Sachs Mars Yard Overshoe", "NikeCraft x Tom Sachs Mars Yard 2.5"),
                "NikeCraft x Tom Sachs Mars Yard Overshoe"
            ),
            QuestionAndAnswerModel(
                "¿Cuál es el nombre del modelo de zapatillas de Asics lanzado en colaboración con el diseñador Ronnie Fieg, que ha sido parte de varias colecciones \"Salmon Toe\" y \"Mint Leaf\"?",
                list = listOf("Asics Gel-Lyte III", "Asics Gel-Kayano", "Asics Gel-Saga"),
                "Asics Gel-Lyte III"
            ),
            QuestionAndAnswerModel(
                " ¿Cuál es el nombre del modelo de zapatillas Air Jordan que Michael Jordan usó durante su carrera en la NBA y se lanzó en 1985, siendo uno de los más icónicos de la historia?",
                list = listOf("Air Jordan 1", "Air Jordan 4", "Air Jordan 11"),
                "Air Jordan 1"
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas se asocia comúnmente con el estilo de vida urbano y la cultura skate, y es conocida por su calzado resistente?",
                list = listOf("Timberland", "Etnies", "Asics"),
                "Etnies"
            ),
            QuestionAndAnswerModel(
                "¿Qué marca de streetwear lanzó una colaboración con Coca-Cola que incluye zapatillas y prendas con referencias a la famosa marca de refrescos?",
                list = listOf("Stüssy", "KITH", "Supreme"),
                "KITH"
            ),
            QuestionAndAnswerModel(
                "¿En qué año se lanzó la primera colaboración entre la marca de streetwear Supreme y Nike SB, que presentó el icónico Dunk SB \"Supreme\"?",
                list = listOf("2002", "2007", "2010"),
                "2002"
            ),
            QuestionAndAnswerModel(
                "¿En que año se lanzo la primera collab entre bad bunny y adidas?",
                list = listOf("2020", "2021", "2022"),
                "2021"
            ),
            QuestionAndAnswerModel(
                "",
                list = listOf("", "", ""),
                ""
            )
        )
        val dificil = listOf(
            QuestionAndAnswerModel(
                "¿wea dificil?",
                list = listOf("Jordan Trunner PE Surfaces", "Air Force", "Jordan 4"),
                "Jordan Trunner PE Surfaces"
            ),
            QuestionAndAnswerModel(
                "¿Qué marca de zapatillas es conocida por sus colaboraciones con artistas y diseñadores¿",
                list = listOf("Reebok", "Nike", "New Balance"), "Nike"
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas es conocida por su colaboración con Supreme en accesorios y prendas?",
                list = listOf("Adidas", "Vans", "Louis Vuitton"),
                "Louis Vuitton"
            ),
            QuestionAndAnswerModel(
                "¿Qué diseñador es famoso por su colaboración con Nike en la línea \"The Ten\"?",
                list = listOf("Kanye West", "Virgil Abloh", "Pharrell Williams"),
                "Virgil Abloh"
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas es conocida por sus colaboraciones con artistas como Kanye West en la línea Yeezy?",
                list = listOf("Puma", "Converse", "Adidas"),
                "Adidas"
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas es famosa por sus colaboraciones con Disney, Nintendo y otras marcas de entretenimiento?",
                list = listOf("Vans", "Converse", "Asics"),
                "Vans"
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas se asocia comúnmente con el estilo de vida urbano y la cultura skate, y es conocida por su calzado resistente?",
                list = listOf("Timberland", "Etnies", "Asics"),
                "Etnies"
            ),
            QuestionAndAnswerModel(
                "¿Cuál de las siguientes marcas de streetwear es originaria de Londres y se ha destacado por sus diseños innovadores y colaboraciones exclusivas?",
                list = listOf("A Bathing Ape (Bape)", "Palace", "Stüssy"),
                "Palace"
            ),
            QuestionAndAnswerModel(
                "¿Qué marca de streetwear es conocida por su enfoque en la sostenibilidad y la utilización de materiales reciclados en sus prendas y zapatillas?",
                list = listOf("HUF", "Parra", "VEJA"),
                "VEJA"
            ),
            QuestionAndAnswerModel(
                "¿Qué marca de zapatillas lanzó un modelo popular llamado \"Air Fear of God,\" en colaboración con el diseñador Jerry Lorenzo?",
                list = listOf("Puma", "Adidas", "Nike"),
                "Nike"
            ),
            QuestionAndAnswerModel(
                "",
                list = listOf("", "", ""),
                ""
            )
        )

        init {
            QuestionAndAnswerModel.add(facil)
            QuestionAndAnswerModel.add(normal)
            QuestionAndAnswerModel.add(dificil)
            Log.d("test", QuestionAndAnswerModel.toString())
        }


        fun QuestionAndAnswerProviderReturn(
            dificultad: Int,
            pregunta: Int
        ): QuestionAndAnswerModel {
            return QuestionAndAnswerModel[dificultad][pregunta]
        }


    }

}