# Unhandled NumberFormatException in Scala Auxiliary Constructor

This repository demonstrates a common but easily missed error in Scala: an unhandled `NumberFormatException` within an auxiliary constructor.  The `MyClass` example attempts to convert a String to an Int without proper error handling.  This leads to a runtime exception if the string is not a valid integer.

The solution showcases how to gracefully handle this exception, either by using `Try`, providing a default value, or throwing a custom exception with more context.
