package Module3

import java.time.YearMonth

fun main(){
    println("Введите год и нажмите Enter")
    val i = readLine()
    isLeapYear(i!!.toInt())
}

fun isLeapYear(year:Int) {
    val yearMontObject:YearMonth = YearMonth.of(year, 2)
    val daysInMonth:Int = yearMontObject.lengthOfMonth()
    if (daysInMonth==28){
        println("Указаный год не високосный")
    } else {
        println("Указаный год високосный")
    }
}