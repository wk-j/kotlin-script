fun smartCastExamle(x: Any): Boolean {
    if (x is Boolean)  {
        return x
    } else if(x is Int) {
        return x > 0
    } else if(x is String) {
        return x.isNotEmpty()
    } else {
        return false
    }
}

println (smartCastExamle(true) == true)
println (smartCastExamle(10) == true)
println (smartCastExamle(-1) == false)
println (smartCastExamle("Hello") == true)
println (smartCastExamle("") == false)


fun smartCastWhenExamle(x: Any) = when(x) {
    is Boolean -> x
    is Int -> x > 0
    is String -> x.isNotEmpty()
    else -> false
}

println(smartCastWhenExamle(true) == true)