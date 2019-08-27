package Module4

import kotlin.system.exitProcess
var firstPlane = Boeing747(1000, 20, 5, 190)

var firstCargoPlane = AirbusBeluga(5000, 50, 1, 400)

var testPlane = Cessna182(1722, 10, 1, 517, 3)

fun main() {
    consoleGreets()
}

interface Passanger {
    var passCapacity: Int
}

interface Cargo {
    var cargoCapacity: Int
}

abstract class Aircraft(protected val distance: Int, protected val fuel: Int, fuelConsumption: Any) {
    protected var fuelPerDistance = fuelConsumption
        get() = 100 * fuel / distance

    open fun info() {} //метод абстрактный, так как реализовывать нецелесообразно в связи с переопределением в единственном наследнике

}

//Идея ругалась на отсутствие конструктора класса Боинг (как указывалось по примерам), поверил ей.
class Boeing747(distance: Int, fuel: Int, fuelConsumption: Any, pass: Int) : Aircraft(distance, fuel, fuelConsumption), Passanger {
    override var passCapacity: Int = pass
    override fun info() {
        println("""Максимальная дальность полета: $distance
Вместимость бака: $fuel
Расход топлива на 100 км: $fuelPerDistance
Вместимость пассажиров: $passCapacity""")
        reask()
    }
}

data class Auto<B, C, S>(val brand: B, val color: C, val serial: S) {
    override fun toString(): String {
        return "Car: Brand - $brand, Color - $color, Serial - $serial"
    }
}

class AirbusBeluga(distance: Int, fuel: Int, fuelConsumption: Any, cargo: Int) : Aircraft(distance, fuel, fuelConsumption), Cargo {
    override var cargoCapacity: Int = cargo
    override fun info() {println("""Максимальная дальность полета: $distance
Вместимость бака: $fuel
Расход топлива на 100 км: $fuelPerDistance
Вместимость груза: $cargoCapacity кг""")
        reask()}
}

class Cessna182(distance: Int, fuel: Int, fuelConsumption: Any, cargo: Int, pass: Int) :
    Aircraft(distance, fuel, fuelConsumption), Cargo, Passanger {
    override var cargoCapacity: Int = cargo
    override var passCapacity: Int = pass
    override fun info() {println("""Максимальная дальность полета: $distance
Вместимость бака: $fuel
Расход топлива на 100 км: $fuelPerDistance
Вместимость груза: $cargoCapacity кг
Вместимость пассажиров: $passCapacity""")
        reask()
    }
}

fun reask() {
    println("""
        Желаете просмотреть информацию о другой модели?
1 - Да
Любая другая кнопка - Нет"""
    )
    val h = readLine()
    if (h == "1") consoleGreets()
    else {
        exitProcess(0)
    }
}
fun consoleGreets() {
    println(
        """по какому самолету желаете просмотреть информацию?
1. Boeing747
2. AirbusBeluga
3. Cessna182""")
    val i = readLine()
    when (i) {
        "1" -> println(firstPlane.info())
        "2" -> println(firstCargoPlane.info())
        "3" -> println(testPlane.info())
        else -> {
            println(
                """Выбор не распознан, повторить попытку?
1 - Да
Любая другая кнопка - Нет"""
            )
            val h = readLine()
            if (h == "1") consoleGreets()
            else {
                exitProcess(0)
            }
        }
    }
}

