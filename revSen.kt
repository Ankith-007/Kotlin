fun main(){
    var s= readln()
    print(reverseSentence(s))
}
fun reverseSentence(sentence:String):String{
    return sentence.split(" ").joinToString(" "){it.reversed()}
        .reversed()
}