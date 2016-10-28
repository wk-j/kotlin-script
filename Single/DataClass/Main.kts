data class Example (val x: Int, val y: Int)

val ex = Example(100, 200)
println(ex.y == 200)

val newEx = ex.copy(y = 300)
println(ex.y == 200)
println(newEx.y == 300)

var (x,y) = newEx
println(x == 100)
println(y == 300)
