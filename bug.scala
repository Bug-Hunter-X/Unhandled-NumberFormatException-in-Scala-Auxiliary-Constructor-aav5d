```scala
class MyClass(val value: Int) {
  def this(s: String) = this(s.toInt)
}

val obj1 = new MyClass(10)
val obj2 = new MyClass("20")
println(obj1.value) // Output: 10
println(obj2.value) // Output: 20

//The bug lies in the auxiliary constructor. If the String cannot be parsed to an Int, it will throw a NumberFormatException.  This is not explicitly handled.
val obj3 = new MyClass("abc") // This will throw a NumberFormatException
```