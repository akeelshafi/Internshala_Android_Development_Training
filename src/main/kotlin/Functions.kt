fun main(){
iAmAFunction()

    var answer =addTwoNumbers(40,70)
    println(answer)
}

fun iAmAFunction(){
    println("I am an user defined function")
}

fun addTwoNumbers(a: Int, b: Int): Int {
    val num1=40
    val num2=60

    return num1 + num2
}