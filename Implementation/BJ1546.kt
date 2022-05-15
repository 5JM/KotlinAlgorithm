package Implementation

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    val n = readLine()!!.toInt()
    val t = Array(n){sc.nextInt()}
    val arr = ArrayList<Double>()
    for(i in 0 until n) arr.add(t[i].toDouble())
    val max =arr.maxOrNull()!!
    for(i in arr.indices) arr[i] = arr[i] / max *100
    print(arr.sum()/arr.size)
}