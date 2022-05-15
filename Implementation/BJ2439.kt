package Implementation

import java.io.BufferedReader
import java.io.InputStreamReader

// 백준 2439 - 별찍기2
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    for(i in 1..n){
        for(j in n-i downTo 1) print(" ")
        print("*".repeat(i))
        println()
    }
}