package Module1

/*
Программа не учитывает обработку ошибок на несоответствие типов, ибо ине указано в задании
 */

fun main(){
    var result='$' //исследую почему объявление переменной в данный момент обязательно
    //запрашиваем данные
    println("Введите первое число и нажмите Enter")
    val num1:String? = readLine()
    num1!!.toInt()

    println("Введите второе число и нажмите Enter")
    val num2:String? = readLine()
    num2!!.toInt()

    //Определяем неравенство
    when {
        num2>num1 -> result='>'
        num2<num1 -> result='<'
        num2==num1 -> result='='
    }

    //выводим результат
    println("$num2 $result $num1 ")
}