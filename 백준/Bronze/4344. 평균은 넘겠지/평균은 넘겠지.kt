import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(){
	val br = BufferedReader(InputStreamReader(System.`in`))
	val c = br.readLine().toInt() // 케이스 개수

	for (i in 0 until c) {
		val str = StringTokenizer(br.readLine())
		val n = str.nextToken().toInt() // 처음 나온 숫자가 학생 수
		val arr = IntArray(n) // 학생 수 만큼 배열 생성
		var sum = 0
		var cnt = 0

		for (j in 1..n) {
			val token = str.nextToken().toInt()
			sum += token
			arr[j-1] = token
		}

		for (k in arr) 
			if (k > sum/n) cnt++ // 평균 넘는 학생 수 카운팅
			
		println(String.format("%.3f%%",100f*cnt/n))
	}
	br.close()
}