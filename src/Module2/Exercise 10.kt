package Module2

import java.lang.NumberFormatException

var cities: MutableList<String> = mutableListOf()

fun main() {

    println("Добро пожабровать в программу управления городами!")
    mainMenuDescription()
}

// implementation
// Сообщение главного меню
fun mainMenuDescription() {
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

// Выбор пункта главного меню
fun mainMenu() {

    var input = readLine()
    try {
        when (input!!.toInt()) {
            1 -> addCity()
            2 -> viewCities()
            3 -> viewCitiesDistinct()
            4 -> println("Спасибо что пользуетесь нашим програмным обеспечением. До встречи!")
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
}

//Добавление города в массив
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
            mainMenuDescription()
        } else {
            addCity()
        }
    } else {
        cities.add(city)
        mainMenuDescription()
    }
}

//Вывод всех значений из списка
fun viewCities(){
    println("Cписок введенных названий городов")
    val sizeOfCitiesList = cities.size-1
    for (i in 0..sizeOfCitiesList) println(cities[i])
    mainMenuDescription()
}

//Вывод всех уникальных значений из списка
fun viewCitiesDistinct(){
    println("Cписок уникальных введенных названий городов")
    val distinctListOfCities:List<String> = cities.distinct()
    val sizeOfDistinctListOfCities = distinctListOfCities.size-1
    for (i in 0..sizeOfDistinctListOfCities) println(distinctListOfCities[i])
    mainMenuDescription()
}
