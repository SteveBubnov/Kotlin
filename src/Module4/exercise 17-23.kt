package Module4

fun main() {
    val firstPlane = Boeing747(1000,20,5)
    firstPlane.passCapacity = 500

    //test
    println("${firstPlane.maxDistance} ${firstPlane.fuelTank} ${firstPlane.fuelPerDistance} ${firstPlane.passCapacity}")

}

open class Aircraft(distance: Int, fuel: Int, fuelConsumption: Any) {
    val maxDistance: Int = distance
    val fuelTank: Int = fuel
    var fuelPerDistance = fuelConsumption
        get() = 100 * fuelTank / maxDistance

}

//Идея ругалась на отсутствие конструктора класса Боинг (как указывалось по примерам), поверил ей.
class Boeing747(distance: Int, fuel: Int, fuelConsumption: Any) : Aircraft(distance, fuel, fuelConsumption) {
    var passCapacity:Int = 0
}




