package com.example.kotlinbasics

data class User(val id : Long, var name : String)





fun main () {

    val user1 = User(1, "Mehdi")


    user1.name = "Mechael"
    println(user1.name)
    val user2 = User(1,"Mechael")
    println(user1 == user2)
    val updateUser = user1.copy(name="Denis Panjuta")
    println(user1.name)
    println(updateUser.name)
    println(updateUser.component1())
    println(updateUser.component2())
    val (id,name) = updateUser
    println("id is ${id} and name ${name}")



    //TODO : add new functionnality
var denis = Person("Mehdi","Khalfallah" ,31)
    denis.stateHobby()
    denis.hobby = "fishing"
    denis.stateHobby()

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

    }

class Person (firstName : String = "john", lastName : String = "Doe") {
    var age : Int? = null
    var hobby : String = "watch Netflix"
    var firstName : String? = null
     init {
         this.firstName = firstName
         println( "initialized a new Person with " + "firstName = $firstName and lastName = $lastName" )
     }
    fun stateHobby() {
println("My hobby is $hobby")
println("name is $firstName")
    }
    constructor(firstName : String, lastName : String, age : Int) : this(firstName,lastName) {
        this.age = age


        println( "initialized a new Person with " + "firstName = $firstName and lastName = $lastName and age of $age " )
    }

}








