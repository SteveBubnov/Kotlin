package Module3

fun main () {
    sum("Ivan", "Alex", "Michael", "Peter")
}

fun sum (vararg names:String){
    println(names.size)
}