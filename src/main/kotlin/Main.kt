/**
Creator: Zohidjon Akbarov
 */
fun main() {

    val database = DataBase
    database.counter = 10
    val data = DataBase
    println(database.counter)
    println(data.counter)

}

object DataBase {
    var counter = 0
}

class Person(val name: String, val age: Int) {
    companion object {
        private const val stringValue = "This is the companion string"
        fun printMe() {
            println(stringValue)
        }
    }

    var counter = 0
    fun show() {

    }
}