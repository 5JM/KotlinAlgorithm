package Implementation

fun main() {
	val n = readln().toInt()
	// 4자리수일때,
	// x분해합은 x + x1 + x2 + x3 + x4인데
	// 분해합이 될수있는 최대값은 x+9+9+9+9 임.
	for(i in n-9*"$n".length .. n)
		if( sum(i) + i == n ) {
			print(i)
			return
		}
	print(0)
}
fun sum(n : Int) : Int{
	var sum = 0
	"$n".forEach { sum += it-'0' }
	return sum
}