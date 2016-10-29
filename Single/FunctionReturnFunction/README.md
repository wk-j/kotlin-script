## Main.kts

```kotlin
    fun odd(x: Int): Boolean = x % 2 == 1
    println(odd(6)) // => false
    println(odd(7)) // => true

    // If the return type can be inferred then we don't need to specify it.
    fun even(x: Int) = x % 2 == 0
    println(even(6)) // => true
    println(even(7)) // => false

    // Functions can take functions as arguments and return functions.
    fun not(f: (Int) -> Boolean) : (Int) -> Boolean {
        return {n -> !f.invoke(n)}
    }
    // Named functions can be specified as arguments using the :: operator.
    //val notOdd = not(odd)
    //val notEven = not(even)


    println( not({ x -> x % 2 == 0 })(5) )
```