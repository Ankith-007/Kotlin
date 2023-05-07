fun main(){
    var l= readln().toInt()
    print(getsidesPoly(l))
}

fun getsidesPoly(sides: Int): String {
     return when(sides){
         3 ->"triangle"
         4 ->"quadrilateral"
         5 ->"pentagon"
         6 ->"hexagon"
         7 ->"heptagon"
         8 ->"octagon"
         9 ->"nano"
         else ->"unknown"
     }
}
