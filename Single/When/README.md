## Main.kts

```kotlin
val i = 10
val rs = when {
    i < 7 -> "< 7"
    else -> ">= 7"
}

println(rs == ">= 7")

rs = when {
    0,1,2 -> "0 or 1 or 2"
    in 1..10 -> "in the range 1 to 10"
    else -> "none of above"
}

println(rs == "in the range 1 to 10")
```