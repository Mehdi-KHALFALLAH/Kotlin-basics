package com.example.kotlinbasics





class List {
    val months = listOf("hello","February", "June")
    val anyTypes = listOf(1,2,3,true,false, "June")
    fun print() {
        print(anyTypes.size)
    }

}


fun main() {
    val months = listOf("hello","February", "June")
    val anyTypes = listOf(1,2,3,true,false, "June")
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("out", "semptember", "juiullet")
    additionalMonths.addAll(newMonths)

    println(additionalMonths)
    additionalMonths.add("3omran")
    println(additionalMonths)

    val daysOfWeek  = mapOf(1 to "monday", 2 to "tuesday", 3 to "wednesday")

    for (key in daysOfWeek.keys) {
        println("$key is for the ${daysOfWeek[key]}")
    }
 val newDaysOfWeek = daysOfWeek.toMutableMap()
    newDaysOfWeek[4]= "thursday"
    newDaysOfWeek[5]= "friday"
   println(newDaysOfWeek.toSortedMap())


}