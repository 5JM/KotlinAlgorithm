package Implementation

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val s = br.readLine().lowercase()
    val list = IntArray(26){0}
    for(i in s.indices) list[s[i].code-97]++
    var result = ""
    var count=0

    for(i in list.indices)
        if(count>=2) {
            result="?"
            break
        }
        else{
            if(list.maxOrNull()==list[i]) {
                result = (i+97).toChar().uppercase()
                count++
            }
        }
    println(result)
}