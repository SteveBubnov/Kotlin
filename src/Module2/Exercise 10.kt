package Module2

import java.lang.NumberFormatException

var cities:MutableList<String> = mutableListOf()

fun main() {

    println("Добро пожабровать в программу управления городами!")
    greetings()}



    // implementation
    fun greetings() {
        println(
            """
Для добавленя названия города введите цифру 1.
Чтобы Посмотреть в консоли список всех добавленных городов введите цифру 2.
Чтобы Посмотреть список добавленных городов без повторений введите цифру 3.
Для выхода из программы нажмите цифру 4.
После ввода соответствующей цифры нажмите "Enter" """
        )
        mainMenu()
    }

    fun mainMenu() {

        var input = readLine()
        try {
            when (input!!.toInt()) {
                1 -> addCity()
                2 -> println("2")
                3 -> println("3")
                4 -> println("exit")
                else -> {
                    println(
                        """
Введите цифру соответствующую пункту меню
        """
                    )
                    mainMenu()
                }
            }

        } catch (e: NumberFormatException) {
            println(
                """
Введите цифру соответствующую пункту меню
        """
            )
            mainMenu()
        }

        fun addCity() {
            println("Введите название города и нажмите \"Enter\"")
            val city = readLine()
            if (city.isNullOrBlank()) {
                println(
                    """
Вы ввели пустое значение.
для выхода в главное меню нажмите 2.
для повторного ввода укажите любое значение кроме 2.
после чего нажмите "Enter""""
                )
                val altAddCityInput = readLine()
                if (altAddCityInput == "2") {
                    mainMenu()
                } else {
                    addCity()
                }
            } else {
                cities.add(city)
            }
        }

    }