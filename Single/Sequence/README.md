## Main.kts

```kotlin
val fooSequence = generateSequence(1, { it + 1 })
var x = fooSequence.take(5).toList()
println(x.equals(listOf(1,2,3,4,5)))

println(generateSequence(2, { it + 5 }).take(5).toList() == listOf(2,7,12,17,22));
```