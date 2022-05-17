package Implementation

import java.io.BufferedReader
import java.io.InputStreamReader

// 설탕 배달
fun sugarDelivery(n:Int){
    var sugar = n
    var count = 0 // 3키로 가방수
    while (true) {
        if (sugar % 5 == 0) { // 5키로 한번에 나눠지면 그게 최소 가방갯수 & 0키로일때
            println(sugar / 5 + count) // 5키로 가방수 + 3키로 가방수
            break
        } else if (sugar < 0) {
            println(-1)
            break
        }
        // 5키로로 한번에 안나눠 지면 3키로 가방 1개 늘리고 전체 설탕 3키로 뺌
        count++
        sugar -= 3
    }
}

fun main()=sugarDelivery(BufferedReader(InputStreamReader(System.`in`)).readLine().toInt())