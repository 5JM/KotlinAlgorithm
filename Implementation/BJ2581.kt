package Implementation

import java.io.BufferedReader
import java.io.InputStreamReader

fun sosu2(a:Int, b:Int){
    val arr = ArrayList<Int>()
    for(i in a..b) if(isPrime(i)) arr.add(i)
    if(arr.size==0) println(-1)
    else println("${arr.sum()}\n${arr[0]}")
}

fun sosu(a:Int,b:Int){
    var sum = 0
    var min = 10001
    for(i in a..b){
        if(isPrime(i)) {
            sum+=i
            if(min>i) min=i
        }
    }
    if(sum==0) println(-1)
    else println("$sum\n$min")
}

fun isPrime(i: Int): Boolean {
    if (i == 1) return false
    for (j in 2 until i) if (i % j == 0) return false
    return true
}

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine().toInt()
    br.skip(1) // 백준에서는 주석처리해야함
    val b = br.readLine().toInt()
    sosu(a,b) // low cost( memory, time )
    //sosu2(a,b) // less code
}