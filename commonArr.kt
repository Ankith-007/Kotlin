fun commArrEle(arr1: IntArray, arr2: IntArray): List<Int>
{
    return arr1.intersect(arr2.toList().toSet()).toList()

}

fun main(){
    var arr1:IntArray=(1..10).toList().toIntArray()
    var arr2:IntArray=(5..10).toList().toIntArray()
    print(commArrEle(arr1,arr2))
}
