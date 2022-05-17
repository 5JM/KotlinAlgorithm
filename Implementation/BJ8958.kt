package Implementation

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val c = br.readLine().toInt() // 케이스 개수
    br.skip(1)
    for (i in 0 until c) {
        val str = br.readLine()
        var count = 1
        var sum = 0
        for (j in str.indices) {
            if(str[j]=='O') sum+=count++
            else count=1
        }
        println(sum)
    }
    br.close()
}