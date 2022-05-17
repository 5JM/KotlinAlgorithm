package Implementation

import java.io.BufferedReader
import java.io.InputStreamReader

// 그룹 단어 체커
// * 인텔리제이에서는 이상하게 테스트 케이스 3이상 하면 한개씩 씹힘( br.skip(1)했는데도.. )
// * 백준에서는 잘 됨...

fun isGroup(s:String):Boolean{
    val list = IntArray(26){0}
    for(i in s.indices) {
        val tmp = s[i].code-97
        if(list[tmp]==0) list[tmp]++
        else if(s[i-1] != s[i]) return false
    }
    return true
}

fun main(){
    var count = 0
    val br = BufferedReader(InputStreamReader(System.`in`))
    val c = br.readLine().toInt() // 케이스 개수
//    br.skip(1)
    for (i in 0 until c) if(isGroup(br.readLine())) count++
    println(count)
}