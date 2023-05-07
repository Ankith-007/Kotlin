fun main(){
    val arr1:IntArray=(1..10).toList().toIntArray()
    print(avg_array(arr1))
}

fun avg_array(arr: IntArray): Double {
    return arr.average()

}
