package Module2

fun main() {

    val table: Array<Array<String>> = Array(3, { Array(3, {""}) })
    table[0]=arrayOf("France", "Germany", "United Kingdom", "Russia")
    table[1]=arrayOf("Paris", "Berlin", "London", "Moscow")
    table[2]=arrayOf("Euro","Euro","Pound sterling", "Ruble")

    //далее код, переварачивающий массив как сказано по заданию
    val a = table.size
    val b = a-1
    val size:Array<Int> = Array(a, {0})
    var c:Int
    for(g in 0..b){
        size[g]=table[g].size
    }
    for (i in 0..b){
        c = size[i] - 1
        for (h in 0..c){
            print(table[i][h]+"\t")
        }
        println()
    }

}