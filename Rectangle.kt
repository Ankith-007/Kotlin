class Rectangle( val l:Double,val w:Double) {
    fun area(): Double {
        return (l * w)
    }

    fun perimeter(): Double {
        return 2 * (l + w)
    }
}
    fun main(){
        var l= readln().toDouble()
        var w= readln().toDouble()
        var r=Rectangle(l,w)
        println(r.area())
        println(r.perimeter())
    }


