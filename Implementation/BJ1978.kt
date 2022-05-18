package Implementation

import java.util.*

private fun sosu(arr:Array<Int>){
    var count = 0
    for(i in arr) if(isPrime(i)) count++
    println(count)
}

private fun isPrime(i: Int): Boolean {
    if (i == 1) return false
    for (j in 2 until i) if (i % j == 0) return false
    return true
}

fun main(){
    val sc = Scanner(System.`in`)
    val n = readLine()!!.toInt()
    val arr = Array(n){sc.nextInt()}
    sosu(arr)
}