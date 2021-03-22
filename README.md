# Java11Features
Test programs to check java 11 new features.
- Java 11 is the first long-term support (LTS) release after Java 8. 
- A major change in this version is that we don't need to compile the Java source files with javac explicitly anymore:
- Java 11 adds a few new methods to the String class: isBlank, lines, strip, stripLeading, stripTrailing, and repeat.
- In Java 11 now it's easier to read and write Strings from files. We can use the new readString and writeString static methods from the Files class.
- The java.util.Collection interface contains a new default toArray method which takes an IntFunction argument.This makes it easier to create an array of the right type from a collection
- A static not method has been added to the Predicate interface. We can use it to negate an existing predicate, much like the negate method.
- Support for using the local variable syntax (var keyword) in lambda parameters was added in Java 11.
- We can make use of this feature to apply modifiers to our local variables, like defining a type annotation.
- The new HTTP client from the java.net.http package was introduced in Java 9. It has now become a standard feature in Java 11.The new HTTP API improves overall performance and provides support for both HTTP/1.1 and HTTP/2.
- Java 11 introduces the notion of nestmates and the associated access rules within the JVM.
- Support for Shebang Files 