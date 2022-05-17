package Implementation

// 셀프 넘버
fun d(n:Int):Int{
    var sum = n
    for(i in n.toString()) sum+=i.digitToInt()
    return sum
}
fun main(){
    val arr = ArrayList<Int>()
    for(i in 1..10000) arr.add(d(i))
    for(i in 1..10000) if(!arr.contains(i)) println(i)
}