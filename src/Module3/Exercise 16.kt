package Module3

import kotlin.math.sqrt

fun main(){
    fun Double.square(): Double {
        val sr = sqrt(this)
        return sr
    }

    val d = 25.5

    d.square()
}

