fun main(){

    // if else
   /* val a = 5
    if (a>0){
        println("A is greater then zero")
    }else{
        println("A is less then zero")
    }*/


    // when expression

   /* val a = 5
    when(a){
        0 -> println("zero")
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        4 -> println("four")
        5 -> println("five")
    }*/

    // in expression

    val a= 3
    when(a){
        in 1..10 -> println("one to 10")
        in 20 until 30 -> println("twenty to 30")
    }


}