package Implementation

import java.util.*
import kotlin.math.sqrt

fun goldBah(){
    val sc = Scanner(System.`in`)
    val N = 10000
    val check = BooleanArray(N + 1)
    for (i in 2..N) check[i] = true
    // 에라토스테네스의 체
    for(i in 2..sqrt(N.toDouble()).toInt())
        for(j in i+i .. N step i) check[j] = false

    val t = sc.nextInt()
    for (i in 0 until t) {
        val n = sc.nextInt()
        for (j in n/2 downTo 2) {
            if (check[j] && check[n - j]) {
                println("$j ${n-j}")
                break
            }
        }
    }
}

fun main()= goldBah()
