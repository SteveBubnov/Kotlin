package Module3

fun main() {
    val stringArray = arrayOf("a", "b", "c")

    val lambdaFunction = { array: Array<String> ->
        for (note in array) {
            println(note)
        }
    }

    lambdaFunction(stringArray)
}

