package Sort

import java.util.*

fun main()= with(Scanner(System.`in`)){
	val sb = StringBuffer()
	Array(nextInt()){nextInt()}.sorted().forEach { sb.append("$it\n") }
	print(sb)
}