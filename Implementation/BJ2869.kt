package Implementation

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 달팽이
fun snail(a:Int,b:Int,v:Int):Int{
    return if(a>=v) 1
    else {
        val result=(v-a)/(a-b) // 마지막 날에는 a만큼 만 올라가면 되므로 v-a를 a-b로 나눔
        if((v-a) % (a-b)==0) result+1 // 나머지가 없으면 마지막날에 올라가는게 분명하니 +1
        else result+2 // 나머지가 있다면 v-a에 도달하지 못한것이니 +2
    }
}

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    val arr = ArrayList<Int>()
    for(i in token) arr.add(i.toString().toInt())
    print(snail(arr[0],arr[1],arr[2]))
}