package Implementation

fun worldEnd(N : Int){
	var n=N
	var number = 665
	while(n>0){
		var count = 0
		var tmp = ++number
		while(tmp > 0){
			if(tmp % 10 == 6) count++
			else count = 0
			tmp/=10
			if(count == 3) n--
		}
	}
	print(number)
}

fun main()=worldEnd(readln().toInt())
