// kotlinc-js -output Scripts/Library.js -meta-info Scripts/Library.kt
// https://kotlinlang.org/docs/tutorials/javascript/getting-started-command-line/command-line-library-js.html

fun factorial(n: Int) : Long {
    return if (n == 0) 1 else n * factorial (n - 1)
}

inline fun IntRange.forOdd(f: (Int) -> Unit) {
    this.forEach { if (it %2 == 1) f(it) }
}