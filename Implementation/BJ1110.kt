package Implementation

//백준1110 - 더하기 사이클
fun main(){
    var n = readLine()!!.toInt()
    val _n = n
    var count = 0
    while(true){
        n=(n%10)*10 + (n%10 + n/10)%10
        count+=1
        if(_n == n) break
    }
    println(count)
}