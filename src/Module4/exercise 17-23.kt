package Module4

class Aircraft(distance:Int, fuel:Int, fuelConsumption:Any) {
    var maxDistance: Int = distance
    var fuelTank: Int = fuel
    var fuelPerDistance = fuelConsumption
        get() = 100 * fuelTank / maxDistance

}
fun main () {
    val cesna:Aircraft = Aircraft(1000,50,4)
    println(cesna.fuelPerDistance)
}


