package Implementation

import java.util.*
// 백준 2562 - 최댓값
fun main(){
    val sc = Scanner(System.`in`)
    val a = Array(9){sc.nextInt()}
    val max = a.maxOrNull()
    println(max)
    println(a.indexOf(max)+1)
}