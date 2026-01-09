# Data types ,Literal and Variables in java.

## Data Types in Java

In Java, data types specify the type of data that a variable can hold. Java is a
statically typed language, which means that every variable must be declared with a data type before it can be used. Java has two main categories of data types: primitive data types and reference data types.

### Primitive Data Types 

| Type    | Category       | Size              | Range / Values                                          |
| ------- | -------------- | ----------------- | ------------------------------------------------------- |
| byte    | Integer        | 8 bits (1 byte)   | –128 to 127                                             |
| short   | Integer        | 16 bits (2 bytes) | –32,768 to 32,767                                       |
| int     | Integer        | 32 bits (4 bytes) | –2,147,483,648 to 2,147,483,647                         |
| long    | Integer        | 64 bits (8 bytes) | –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float   | Floating-point | 32 bits (4 bytes) | ~ ±3.4e38 (≈7 decimal digits precision)                 |
| double  | Floating-point | 64 bits (8 bytes) | ~ ±1.8e308 (≈15 decimal digits precision)               |
| char    | Character      | 16 bits (2 bytes) | Unicode values from 0 to 65,535                         |
| boolean | Boolean        | 1 bit (logical)   | true or false                                           |

**NOTE:-Java Support unicode values in which ASCII values are a subset.**

### Reference Data Types
Reference data types are used to store objects and arrays. They do not hold the actual data but rather a reference (or address) to the location in memory where the data is stored. Examples of reference data types include:
- Classes
- Interfaces
- Arrays
- Enums
- Strings
- Objects
- etc.
## Literals in Java
Literals are fixed values that are directly written into the code. They represent constant values of different data types. Here are some examples of literals in Java:
- Integer literals: `42`, `-7`, `0`
- Floating-point literals: `3.14`, `-0.001`, `2.0`
- Character literals: `'A'`, `'z'`, `'\n'`
- String literals: `"Hello, World!"`, `"Java Programming"`
- Boolean literals: `true`, `false`
- Null literal: `null`
- Byte literals: `0b1010` (binary), `012` (octal), `0xA` (hexadecimal)

**Now note that when we declare a variable `int x`, it indicates that `x` is a primitive variable of type int. But when you write `Integer x`, it means `x` is an object of the Integer wrapper class, which wraps the primitive int value and provides additional methods and features such as nullability, conversions, and utility functions.**

# Why Java primitive types have these specific sizes?
Java’s primitive data types have fixed sizes to guarantee platform independence and consistent behavior across all systems. These sizes were chosen to balance memory efficiency with the ability to represent a wide range of values. By standardizing the size of each primitive type, Java ensures portability, predictable performance, and alignment with common CPU architectures and IEEE floating-point standards. Unlike languages such as C or C++, where data type sizes vary by platform, Java programs behave the same way everywhere because the underlying primitives are always the same size.
