## Main.kts

```kotlin
var fooNullable: String? = "abc"
println(fooNullable?.length)

fooNullable = null;
println(fooNullable?.length ?: 1000)
```