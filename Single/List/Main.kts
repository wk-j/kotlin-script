var fooList = listOf("a", "b", "c")
println(fooList.size == 3)
println(fooList.first() == "a")
println(fooList.last() == "c")

val fooMutableList = mutableListOf("a", "b", "c")
fooMutableList.add("d")
println(fooMutableList.size == 4)
