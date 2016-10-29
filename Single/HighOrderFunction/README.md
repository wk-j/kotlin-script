## Main.kts

```kotlin
var z = (1..9)
    .map { it * 3}
    .filter { it < 20 }
    .groupBy { it % 2 == 0 }
    .mapKeys { if (it.key) "even" else "odd" }

println(z)
```