## Main.kts

```kotlin
fun String.remove(c: Char) = this.filter { it != c }

println("CS".remove('C') == "S")
    
```