```scala
class MyClass(val value: Int) {
  def this(s: String) = {
    try {
      this(s.toInt)
    } catch {
      case e: NumberFormatException =>
        println("Error converting string to Int: "+ e.getMessage())
        this(0) // Or throw a custom exception
    }
  }
}

val obj1 = new MyClass(10)
val obj2 = new MyClass("20")
val obj3 = new MyClass("abc") // This will now print an error message and use default value 0
println(obj1.value) // Output: 10
println(obj2.value) // Output: 20
println(obj3.value) // Output: 0
```