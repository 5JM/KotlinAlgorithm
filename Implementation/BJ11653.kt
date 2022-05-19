package Implementation

import java.util.*

fun soinsu(){
    var N = Scanner(System.`in`).nextInt()
    var i = 2
    while (N>=i){
        if(N%i==0){
            println(i)
            N/=i
        }
        else i++
    }
}
fun main()= soinsu()
