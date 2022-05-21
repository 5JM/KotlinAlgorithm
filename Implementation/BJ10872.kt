package Implementation

fun f(n:Int):Int=if(n<1)1 else n*f(n-1)
fun main()=println(f(readln().toInt()))