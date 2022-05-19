package Implementation

import java.util.*

fun pibo(n:Int):Int =
    when(n){
        in 0..1 -> n
        else -> pibo(n-1) + pibo(n-2)
    }

fun main()=println(pibo(Scanner(System.`in`).nextInt()))
