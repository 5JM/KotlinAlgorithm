package Sort

import java.util.*

fun main()= with(Scanner(System.`in`)){
	Array(nextInt()){nextInt()}.sorted().forEach { println(it) }
}