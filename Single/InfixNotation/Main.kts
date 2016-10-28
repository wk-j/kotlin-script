class Example(val x: String) {
    infix fun append(y: String) = "$x $y"  
}

val ex = Example("Go")
println( ex append "Home")