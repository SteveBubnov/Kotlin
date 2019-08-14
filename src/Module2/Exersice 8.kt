package Module2

fun main(){
    println("""Добро пожаловать в программу расчета доходности вклада!
Введите сумму вклада и нажмите "Enter"""")
    val summ = readLine()
    var res = summ!!.toFloat()
    println("Введите срок вклада в месяцах и нажмите \"Enter\"")
    val per = readLine()
    println("Укажите месячную процентную ставку в процентах и нажмите \"Enter\"")
    val prof = readLine()
    val percent = (prof!!.toFloat())/100
    println("Ваша сумма на вкладе каждый месяц:")
    for (i in 1..per!!.toInt()) {
        res *= (1 + percent)
        println("месяц $i: Сумма вклада " + "%.2f".format(res) + " руб.")
    }
}