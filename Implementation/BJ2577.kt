package Implementation

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    val arr = Array(3){sc.nextInt()}
    val _result = (arr[0]*arr[1]*arr[2]).toString()
    val list=mutableListOf(0,0,0,0,0,0,0,0,0,0)
    for(i in _result.indices) list[_result[i]-'0']++
    for(i in list) println(i)
}