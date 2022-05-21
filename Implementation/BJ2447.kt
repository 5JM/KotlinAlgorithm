package Implementation

val sb = StringBuffer()

fun starPrint(y:Int, x:Int, n:Int){
    if((x/n)%3==1&&(y/n)%3==1) sb.append(" ")
    else if(n/3==0) sb.append("*")
    else starPrint(y,x,n/3)
}
fun main(){
    val n = readln().toInt()
    for(y in 0 until n){
        for(x in 0 until n) starPrint(y,x,n)
        sb.append("\n")
    }
    println(sb)
}