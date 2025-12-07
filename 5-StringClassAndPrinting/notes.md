# Printing format in Java

## System.out.print()

In Java, `System.out.print()` is used to print text to the console without adding a new line at the end.

## System.out.println()

`System.out.println()` is used to print text to the console and adds a new line at the end.

## System.out.printf()

System.out.printf() is used to print formatted text to the console. It allows you to specify a format string and corresponding arguments, enabling you to control the appearance of the output.

## System.out.format()

`System.out.format()` is similar to `System.out.printf()`. It is used to print formatted text to the console using a format string and arguments.

## Explanation of Components

In all the above methods:

- `System` is a final class from the java.lang package.
- `out` is a class variable which hold reference of type PrintStream declared in the System class.
- `println ,print, printf, format` is a instance method of the PrintStream class.

## Example Usage

```java
public class PrintExample {
    public static void main(String[] args) {
        // Using print()
        System.out.print("Hello, ");
        System.out.print("World!");
        // Using println()
        System.out.println("Hello, World!");
        // Using printf()
        System.out.printf("Hello, %s! You have %d yen.%n", "John", 5);
        // Using format()
        System.out.format("The price of %s is $%.2f%n", "Orange", 1.5);
    }
}
```

## Format Specifier

Format specifiers are used in `printf` and `format` methods to define how the output should be formatted. Here are some common format specifiers:

- `%d`: Decimal integer
- `%f`: Floating-point number
- `%s`: String
- `%c`: Character
- `%n`: New line

Format of a format specifier:

```java
%[argument_index$][flags][width][.precision]conversion
```

- `argument_index$`: Specifies which argument to format.
- `flags`: Modifies the output format (e.g., left-justified, zero padded).
- `width`: Minimum number of characters to be written to the output.
- `.precision`: For floating-point numbers, it specifies the number of digits after the decimal point
- `conversion`: The type of data to be formatted (e.g., d, f, s, c).

---

## String

### What is a String?

In Java, a `String` is a sequence of characters. It is an object that represents a sequence of characters and is widely used in Java programming.
Strings in Java are immutable, meaning once a String object is created, its value cannot be changed. Any modification to a String results in the creation of a new String object.

![alt text](/images/string.png)

### Creating Strings

Strings can be created in two ways:

1. Using string literals:

   ```java
   String str1 = "Hello, World!";
   ```

2. Using the `new` keyword:

   ```java
   String str2 = new String("Hello, World!");
   ```

### String Constructors

The `String` class provides several constructors to create String objects:

- `String(char[] value)`: Creates a string from a character array.
- `String(String original)`: Creates a new string that is a copy of the original string.
- `String(byte[] bytes)`: Creates a string from a byte array.

example of String(char[] value) constructor:

```java
char[] charArray = {'H', 'e', 'l', 'l', 'o'};
String strFromCharArray = new String(charArray); // "Hello"
```

example of String(String original) constructor:

```java
String original = "Hello, World!";
String copy = new String(original); // "Hello, World!"
```

example of String(byte[] bytes) constructor:

```java
byte[] byteArray = {72, 101, 108, 108, 111};
String strFromByteArray = new String(byteArray); // "Hello"
```

| Reference Variable Type | Where the Reference Is Stored | Where the Object Is Stored |
| ----------------------- | ----------------------------- | -------------------------- |
| Local variable          | Stack                         | Heap                       |
| Instance variable       | Heap (inside the object)      | Heap                       |
| Static variable         | Method Area / Metaspace       | Heap                       |


![alt text](/images/string2.png)