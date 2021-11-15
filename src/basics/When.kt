package basics

fun main() {
    foo(num = 10)
    print(describe("hello"))
}

fun describe(obj: Any):String =
    when(obj){
        1 -> "one"
        "hello" -> "Greeting"
        else -> "a default"
    }

fun getStringLength(obj: Any): Int? {
    if (obj !is String) return null


    return obj.length
}

fun foo(num: Int = 0, name: String = "Nymisha") {
    println("The value of a is $num and Name is $name")
}
