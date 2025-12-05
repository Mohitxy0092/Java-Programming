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
