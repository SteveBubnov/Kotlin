package Module3


fun  main(){
    printEmployee("Ivanov Ivan", "Janitor")
    printEmployee("Petrov Peter", 28, "Mechanist")
    printEmployee("Julia Hover", "Married", "Secretary")
    printEmployee("Michael Vazovsky", 45, "Divorced", "Director")
}

fun printEmployee (name:String, position:String){
    println("$name $position")
}

fun printEmployee (name:String, age:Int, position:String){
    println("$name $age $position")
}

fun printEmployee (name:String, maritalStatus:String, position:String){
    println("$name $maritalStatus $position")
}

fun printEmployee (name:String, age:Int, maritalStatus:String, position:String){
    println("$name $age $maritalStatus $position")
}