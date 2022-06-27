package com.example.kotlinbasics

class arrays {

}
fun main () {
    val numbers = intArrayOf(1,2,3,4,5,6)
    for ( i in numbers) {
        println("${i}")
        println("${i + 2}")
    }
    println(numbers.contentToString())
}