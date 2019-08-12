package Module1

fun main (){
    var any:Any? = null
    any = 5
    val child = any/2.5
    System.out.println("child type is " + child.javaClass.name)
}