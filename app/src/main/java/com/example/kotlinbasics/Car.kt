package com.example.kotlinbasics
interface Derivable {
    val maxspeed : Double
    fun drive() : String
    fun brake(){
        println("The drivable is breaking")
    }
}

open class Car (override val maxspeed: Double,val name : String, val brand : String) : Derivable {
     open var range : Double = 0.0 ;

    fun extendRange (amount : Double) {
        if (amount > 0 )
            range += amount ;
    }

    override fun drive(): String {
        return "driving the interface drice"
    }
    open fun drive (distance : Double) {
        println("drove $distance" )
    }

}
class electricalCar (maxspeed : Double, name : String,brand : String, batteryLife : Double )
      : Car(maxspeed , name, brand) {
var chargerType = "type1"
        override  var range  = batteryLife * 6
    override fun drive (distance : Double) {
        println("drove $distance on electricity "  )

    }
    override  fun drive () : String {
        return ("drove for $range km on electricty ")

    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }
      }

fun main() {
    var AUDIO = Car(220.0,"A3", "audi")
    var TESLA = electricalCar(280.0, "S1 model","Tesla", 1000.0)


    AUDIO.drive(200.0)
    TESLA.drive(150.0)
    TESLA.drive()
    TESLA.brake()


}