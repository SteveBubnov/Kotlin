package Module2

var employeeMap:MutableMap<String, String> = mutableMapOf("1.A.1" to "Петров Петр", "1.A.2" to "Иванов Иван")
var name:String? = ""
var place:String? = ""
fun main() {
    println("Программа соответствия места занимаемого сотрудника")
    menu()
}

//implementation
fun menu(){
    println("""
Укажите что вы хотите сделать:
1. Просмотреть сотрудника по номеру места
2. Добавить сотрудника
3. Выйти из программы""")
    menuChoise()
}

fun menuChoise(){
    val inputMenu = readLine()
    when (inputMenu){
        "1" -> searchEmployee()
        "2" -> setEmployeeToPlace()
        "3" -> print("Всего доброго")
        else -> {
            println("Выбор не распознан, повторите попытку")
            menuChoise()
        }
    }
}

fun searchEmployee(){
    println("Введите номер места. на текущий момент заняты места:")
    println(employeeMap.keys)
    val place = readLine()
    if (employeeMap[place]!==null) {
        println("Место $place занимает сотрудник " + employeeMap[place])
    } else {
        println("Место не занято")
    }
    menu()
}

fun setEmployeeToPlace(){
    println("Вам последовательно необходимо указать Фио сотрудника и занимаемое им место. До этого выйти из этого меню НЕВОЗМОЖНО")
    addEmployee()
    setPlace()
    employeeMap.put(place!!,name!!)
    menu()
}

fun addEmployee(){
    name=""
    println("Укажите ФИО сотрудника")
     name = readLine()
    if (name==null) {
        println("Вы не указали ФИО, повторите попытку")
        addEmployee()
    }
}

fun setPlace(){
    place=""
    println("Укажите место сотрудника")
    place = readLine()
    if (place==null) {
        println("Вы не указали ФИО, повторите попытку")
        setPlace()
    }
}