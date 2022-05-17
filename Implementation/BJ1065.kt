package Implementation

import java.io.BufferedReader
import java.io.InputStreamReader

fun han(n:Int):Boolean{
    if(n<100) return true
    val arr = ArrayList<Int>()
    for(i in n.toString()) arr.add(i.digitToInt())
    var tmp = Int.MAX_VALUE
    for(i in 0 until arr.lastIndex) {
        if(tmp==Int.MAX_VALUE) tmp = arr[i] - arr[i+1]
        else if (tmp ==arr[i] - arr[i + 1]) return true
    }
    return false
}

// 한수 찾기
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var result = 0
    for(i in 1..n) if(han(i)) result++
    println(result)
}