package Implementation

import java.io.BufferedReader
import java.io.InputStreamReader

//백준1475 - 방 번호
fun main(){
    val br=BufferedReader(InputStreamReader(System.`in`))
    val n=br.readLine()
    val list=mutableListOf(0,0,0,0,0,0,0,0,0,0)
    for(i in n.indices) list[n[i]-'0']++

    var num=0
    for(i in 0..9){if(i!=6&&i!=9) num=kotlin.math.max(num,list[i])}
    val _num=kotlin.math.ceil((list[6]+list[9])/2.0).toInt()

    println(kotlin.math.max(num,_num))
}