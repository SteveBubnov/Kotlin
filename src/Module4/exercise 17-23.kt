package Module4

fun main() {
    val firstPlane = Boeing747(1000, 20, 5)
    firstPlane.passCapacity = 500

    //test
    println("${firstPlane.distance} ${firstPlane.fuel} ${firstPlane.fuelPerDistance} ${firstPlane.passCapacity}")

}

interface Passanger {
    var passCapacity: Int
}

open class Aircraft(val distance: Int, val fuel: Int, fuelConsumption: Any) {
    var fuelPerDistance = fuelConsumption
        get() = 100 * fuel / distance

}

//Идея ругалась на отсутствие конструктора класса Боинг (как указывалось по примерам), поверил ей.
class Boeing747(distance: Int, fuel: Int, fuelConsumption: Any) : Aircraft(distance, fuel, fuelConsumption), Passanger {
    override var passCapacity: Int = 0
}




