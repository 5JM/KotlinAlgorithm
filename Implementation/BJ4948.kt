package Implementation

import java.util.*
import kotlin.collections.ArrayList

private fun fastSosu(a : Int, b : Int){
    var count=0
    // 소수인지 저장하는 array
    val primeArr = BooleanArray(b + 1){true}
    val sqrt = kotlin.math.sqrt(b.toDouble()).toInt()
    // sqrt의 배수를 채로 거름
    for (i in 2..sqrt){
        // 이미 지워진 경우(4, 6 의 배수 등등)
        if (!primeArr[i]) continue
        // 소수의 배수 제외
        else {
            var j = 2
            while (i*j <= b) {
                if (primeArr[i * j]) primeArr[i * j] = false
                j++
            }
        }
    }

    for (i in a..b){
        if (i == 0 || i == 1) continue
        if (primeArr[i]) count++
    }
    println(count)
}

fun main(){
    val sc = Scanner(System.`in`)
    val arr = ArrayList<Int>()

    while(true) {
        val n = sc.nextInt()
        if(n==0) break
        arr.add(n)
    }
    for(i in arr)
        fastSosu(i+1,2*i)
}