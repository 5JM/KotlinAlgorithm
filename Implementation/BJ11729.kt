package Implementation

import kotlin.math.pow

/*
	@params
	n : 원판의 갯수
	start : 시작 기둥
	mid : 중간 기둥
	to : 도착 기둥
*/

private val s = StringBuffer()
fun hanoi(n : Int, start : Int, mid : Int, to : Int){
	if(n==1){
		s.append("$start $to\n")
		return
	}
	hanoi(n-1 ,start, to, mid) // n-1 개를 기둥1에서 기둥2로
	s.append("$start $to\n")// 1개를 기둥1에서 기둥3으로
	hanoi(n-1, mid, start, to) // 기둥2에 있던 n-1개를 기둥3으로
}

fun main(){
	val n = readln().toInt()
	s.append("${2.toDouble().pow(n).toInt()-1}\n")
	hanoi(n, 1,2,3)
	println(s)
}