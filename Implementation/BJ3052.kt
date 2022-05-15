package Implementation

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    val arr = Array(10){sc.nextInt()}
    val mod = ArrayList<Int>()
    for(i in arr)mod.add(i%42)
    println(mod.distinct().size)
}