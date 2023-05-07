fun main(){
    print("enter the number")
    var n= readln().toInt()
    fibnocacci(n)
}

fun fibnocacci(n: Int) {
    var a=0
    var b=1
    for(i in 1..n){
        println("$a")
        val sum=a+b
        a=b
        b=sum
    }
}
