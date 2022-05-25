package Implementation

import java.util.*
import kotlin.collections.ArrayList

fun main(){
	val sc = Scanner(System.`in`)
	val n = readln().toInt()
	val arr = ArrayList<Pair<Int,Int>>()
	for(i in 0 until n)
		arr.add(Pair(sc.nextInt(), sc.nextInt()))

	val rank = IntArray(n){1}

	for (i in 0 until n )
		for (j in 0 until n)
			if (arr[i].first > arr[j].first && arr[i].second > arr[j].second) rank[j]++

	rank.forEach { print("$it ") }
}