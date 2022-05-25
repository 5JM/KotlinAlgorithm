package Implementation

import java.util.*

fun main()= with(Scanner(System.`in`)){
	val (n,M)=readLine()!!.split(" ").map { it.toInt() }
	val arr=Array(n){nextInt()}
	var result=0
	for(i in 0 .. arr.lastIndex-2)
		for(j in i+1 .. arr.lastIndex-1)
			for(z in j+1 .. arr.lastIndex){
				val sum=arr[i]+arr[j]+arr[z]
				if(sum in result+1 .. M) result=sum
			}
	print(result)
}