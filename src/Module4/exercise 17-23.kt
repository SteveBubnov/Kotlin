package Module4

fun main() {
    val firstPlane = Boeing747(1000, 20, 5)
    firstPlane.passCapacity = 500
    firstPlane.info()

}

interface Passanger {
    var passCapacity: Int
}

abstract class Aircraft(protected val distance: Int, protected val fuel: Int, fuelConsumption: Any) {
    protected var fuelPerDistance = fuelConsumption
        get() = 100 * fuel / distance

    open fun info() {} //метод абстрактный, так как реализовывать нецелесообразно в связи с переопределением в единственном наследнике

}

//Идея ругалась на отсутствие конструктора класса Боинг (как указывалось по примерам), поверил ей.
class Boeing747(distance: Int, fuel: Int, fuelConsumption: Any) : Aircraft(distance, fuel, fuelConsumption), Passanger {
    override var passCapacity: Int = 0
    override fun info() {
        println(
            """Максимальная дальность полета: $distance
Вместимость бака: $fuel
Расход топлива на 100 км: $fuelPerDistance
Вместимость пассажиров: $passCapacity"""
        )

    }
}




