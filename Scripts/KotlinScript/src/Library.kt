
fun factorial(n: Int) : Long {
    return if (n == 0) 1 else n * factorial (n - 1)
}

inline fun IntRange.forOdd(f: (Int) -> Unit) {
    this.forEach { if (it %2 == 1) f(it) }
}