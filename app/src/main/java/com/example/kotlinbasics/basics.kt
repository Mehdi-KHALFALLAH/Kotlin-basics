package com.example.kotlinbasics

fun main () {
    //TODO : add new functionnality

    var result = 5+3
        result /= 2
println("hello " + result )
    var isequal = 5 ==5

    println("equality ${5==5}")
    var person1 = 182
    var person2 =181

    if(person1 > person2) {
        println("person1 wins") }
        else if (person1 == person2 ) {

            println("both are equal")
        }
        else {
            println("easy")
        }

    val age = 21

    when (age) {
        !in 0..20  -> println("now you can drink water")
        in 18..20  -> println("you may drive now")
    }
    var x : Any = 13
    when(x) {
        is Int -> println ("$x is an int")
        is Double -> println("$x is a String")
        else -> println("$x is a none ")
    }
    var result2 = add(5,6)
    println("result is $result2")
    println(result2)
    var denis = Person("Mehdi", "Khalfallah")

    }
fun add( a : Int, b : Int) : Int {
 return (a +b)

}

class Person(firstName : String, lastName : String ="Doe") {
    init {
        println("my first name is ${firstName}")
        println("my last name is ${lastName}")
    }

}




