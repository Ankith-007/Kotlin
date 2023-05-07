fun main(){
    print("enter a string!")
    val s= readln()
    print("Enter the character to count")
    val c=System.`in`.read ().toChar ()
    print(countOcc(s,c))
}

fun countOcc(str: String, ch: Char): Int {
    return str.count{it==ch}
}
