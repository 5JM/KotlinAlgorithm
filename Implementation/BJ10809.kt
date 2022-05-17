package Implementation

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br= BufferedReader(InputStreamReader(System.`in`))
    val s=br.readLine()
    val list = IntArray(26) { -1 }
    for(i in s.lastIndex downTo 0) list[s[i].code-97] = i
    for(i in list) print("$i ")
}