class MutableExample(var x: Int, var y: Int)

var ex = MutableExample(100, 200)

with(ex) {
    x += 100
    y += 100
}

println(ex.x == 200)
println(ex.y == 300)