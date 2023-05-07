fun main(){
    var s= readln()
    print(isPalindrome(s))
}

fun isPalindrome(str: String): Boolean {
    var string=str.toLowerCase().replace("\\s".toRegex(),"")
    return string==string.reversed()
}
