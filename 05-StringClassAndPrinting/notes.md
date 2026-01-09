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

## Methods of String

Some commonly used methods of the `String` class present in `java.lang.String` include:

```java
- length() return int
- toLowerCase() return String
- toUpperCase() return String
- trim() return String
- charAt(int index) return char
- substring(int beginIndex) return String
- substring(int beginIndex, int endIndex) return String
- replace(char oldChar, char newChar) return String
- startsWith(String prefix) return boolean
- endsWith(String suffix) return boolean
- indexOf(String str) return int
- indexOf(String str, int fromIndex) return int
- indexOf(int ch) return int
- lastIndexOf(String str) return int
- lastIndexOf(String str, int fromIndex) return int
- equals(Object obj) return boolean
- equalsIgnoreCase(String anotherString) return boolean
- compareTo(String anotherString) return int
- valueOf(...) return String
- concat(String str) return String
```

## Difference between equals() and == in Java

Both equals() method and == operator can be used to compare string variables or string literals in java but there is a difference between both. equals() method compares the content(the sequence of characters) of string variables or string literals. It returns true if both the content are same else returns false while == operator compares the references(address) of string variables or string literals. It returns true if both the variables or literals points to same reference else returns false.

If the comparison of two strings using == operator returns true then equals() method for same comparison will definitely return true while vice-versa may or may not return true.

---

![alt text](/images/equalm.png)

## Reqular Expressions with Strings

A regular expression is a sequence of characters that forms a search pattern. When you search for data in a text, you can use this search pattern to describe what you are searching for. A regular expression can be a single character, or a more complicated pattern.

- Java provides support for regular expressions through the `java.util.regex` package. Regular expressions are used for pattern matching within strings.

![alt text](/images/matchingsy.png)

![alt text](/images/meta.png)

![alt text](/images/quanti.png)

### Commonly Used Methods for Regular Expressions

- `matches(String regex)`: Checks if the entire string matches the given regular expression.
- `split(String regex)`: Splits the string around matches of the given regular expression.
- `replaceAll(String regex, String replacement)`: Replaces each substring of the string that matches the given regular expression with the specified replacement string.
- `replaceFirst(String regex, String replacement)`: Replaces the first substring of the string that matches the given regular expression with the specified replacement string.
- `Pattern.compile(String regex)`: Compiles the given regular expression into a pattern.
- `Matcher matcher(CharSequence input)`: Creates a matcher that will match the given input against this pattern.


---

## Java string memory allocation

String values in java are stored inside a special memory known as **string pool** or **string constant pool** which exist inside the heap memory. This memory is used to allocate space for string values only. String values given inside `""` in your program are created inside string pool. To understand memory allocation of strings, let's consider we have following string variables declared inside a program.

 ```java
 1. String s1 = "refresh java";
 2. String s2 = new String("Hello World");
 3. String s3 = new String("hello");
 4. String s4 = "refresh java";
 5. String s5 = "hello";
 ```

![alt text](/images/stringPoolMemory.png)

Let's understand how java assigns memory for above strings variables.

- Line 1, java checks if string literal `"refresh java"` is already in string pool or not, since it's not there, java creates this string literal in string pool and assigns the reference(address) of this in `s1`.
- Line 2 is creating object `s2` using `new` keyword, so java will create it inside the heap memory with value as `"Hello World"` and it will also create the string literal(`"Hello World"`) inside the string pool as well.
- Line 3 is also creating object `s3` using `new` keyword, so it will also be created inside the heap memory with value as `"hello"` and the same string literal(`"hello"`) would also be created inside string pool.
- Line 4, java again checks the string literal `"refresh java"` inside the string pool, since it's already there in pool, so it won't create it again. Java assigns the reference of existing string literal in `s4`.
- Line 5, java again checks the string literal `"hello"` inside string pool, since it's already there in pool, so it won't create it again. Java assigns the reference of existing string literal in `s5`.

### Why java uses a special memory for string ?

Since String is one of the most useful data type, to improve the memory usage and application performance java usage string pool memory as it doesn't create unnecessary or duplicate objects, instead it uses the existing string objects.

### What is string literal in java ?

A series of characters in your program that is enclosed in double quotes(`""`) is a string literal. For example `"hello world"`, `"refresh java"`, `"java is easy to learn"` are string literals in java. Whenever it encounters a string literal in your code, the compiler creates a String object with its value in string constant pool. String literals are string constants in java.

### How can I check if two string variables or literal have same reference(address) ?

You can use `==` operator to compare if two string variables or literals have same address. For example `s1==s2`, `s1==s4` etc. You can refer next tutorial for more details about this.

## String is immutable in Java

Immutable simply means something that is not changeable, once a string value in java is created, you can not change that value. For example in above program the code `s1+s2` will create a new string `"refreshJava"` and assigns the reference of this in `s1` but the original string `"refresh"` will still be there in string pool memory, that is why string in java is immutable.

### Why string is immutable in Java ?

Since immutable strings can not be changed, the same string can be referenced in multiple programs or applications which significantly improves the memory usage and application performance.

> String pool, string constant pool and string literal pool and string intern pool are same things.
>

> Digits can also be stored as string in java, for example String str = "12345"; is a valid string.
>

> The '+' operator, which performs addition on primitives (such as int and double), is overloaded to perform concatenation on String objects. The compiler, internally uses the append method of StringBuffer/StringBuilder class to implement string concatenation.

---

## StringBuffer and StringBuilder in Java

Apart from **`String`** class java has given two more classes to handle string values in java, **`StringBuffer`** and **`StringBuilder`**. These classes were added with some purpose, this tutorial explains the purpose to add these classes, the difference between both and when to use StringBuffer or StringBuilder.

String in java is immutable, which means you can not change string value once created. Whenever we do string manipulation like *concatenation, substring, replace* etc, it generates a new string and leaves the original string as it is in memory which becomes a garbage value. For an example the code given below will generate a garbage value as `"refresh java"` in memory.

  `String str = "refresh java";
  str = str + " tutorial";`

The concatenation operation above will create a new strings as `"refresh java tutorial"` in string pool memory and assigns it's reference in `str` but this operation won't change the original string `"refresh java"`, it will still exist in pool memory as a garbage value.

## what is garbage value ?

Any value or object inside the memory that is not being referred by program or application is known as garbage. The process of collecting and destroying such values from memory is known as garbage collection.

The string manipulation operations doesn't cost much if it is not happening frequently, but if it's happening frequently and at many number of places in your application, this may cause serious memory leak and performance issue as it will generate a lot of garbage in memory. To solve this problem java designer has given two more classes, StringBuffer and StringBuilder.

The string values stored in StringBuffer or StringBuilder data type are mutable. In other words objects of StringBuffer and StringBuilder classes are mutable which means if you apply any operation on such strings, it will change the original string itself rather than creating a new string. As a result it will not generate garbage in memory. The **Syntax** of declaring StringBuffer and StringBuilder is :

```jsx
 StringBuffer var_name = new StringBuffer("StringBuffer value");

 StringBuilder var_name = new StringBuilder("StringBuilder value");
 // Example
 StringBuffer strbuff = new StringBuffer("refresh java");
 StringBuilder strbdr = new StringBuilder("java is easy");
```

Here **`StringBuffer`** and **`StringBuilder`** are the data type(classes), `var_name` is the name of variable given as per the programmers choice and the value of variable is given inside `""`.

Java considers string literal(value given in `""`) as **`String`** type, so you can not assign string literal directly to StringBuffer and StringBuilder variable as given below. You must have to use `new` keyword to create StringBuffer and StringBuilder.

```jsx
 // Both line will throw compilation error.
 StringBuffer strbuff = "refresh java";
 StringBuilder strbdr = "java is easy";
```

You can also not use + operator to concat string on StringBuffer and StringBuilder variables.

```jsx
 StringBuffer strbuff = new StringBuffer("refresh java");
 StringBuilder strbdr = new StringBuilder("java is easy");
 // Both line will throw compilation error.
 strbuff = strbuff + " another value";
 strbdr = strbdr + " another value";
```

### How can I add another string value in StringBuffer or StringBuilder variable ?

You need to use append() method of these classes to add another string. Refer the program given below to see the use of this method.

### StringBuffer and StringBuilder program in Java

```jsx
 class StringBufferAndBuilder
  {
    public static void main(String args[]) 
      {
         String str = "refresh java";
         String str2 = str;
         StringBuffer strbuff = new StringBuffer("StringBuffer on refresh java");
         StringBuffer strbuff2 = strbuff;
         StringBuilder strbuild = new StringBuilder("StringBuilder on refresh java");
         StringBuilder strbuild2 = strbuild;

         str = str + " tutorial";
         strbuff = strbuff.append(" tutorial");
         strbuild = strbuild.append(" tutorial");
         
         System.out.println("str = "+str);
         System.out.println("str2 = "+str2);
         System.out.println("strbuff = "+strbuff);
         System.out.println("strbuff2 = "+strbuff2);
         System.out.println("strbuild = "+strbuild);
         System.out.println("strbuild2 = "+strbuild2);
      }
  }
```

**Output:**
```
str = refresh java tutorial
str2 = refresh java
strbuff = StringBuffer on refresh java tutorial
strbuff2 = StringBuffer on refresh java tutorial
strbuild = StringBuilder on refresh java tutorial
strbuild2 = StringBuilder on refresh java tutorial
```

As you can see in the output, both **`String`** variable have different value while both the **`StringBuffer`** and **`StringBuilder`** variable have same value, that's because **`String`** is immutable. Once you add a string literal in **`String`** variable, java creates a new string object and assigns the reference of it in **`String`** variable while in-case of StringBuffer and StringBuilder, the same string is modified.

## Useful StringBuilder and StringBuffer methods in Java

Table below shows some of the useful methods of StringBuffer and StringBuilder class which is commonly used for string manipulation. Both the classes have same methods, the only difference is that methods of StringBuffer class is `synchronized`. Below table assumes we have a variable `s1` of type `StringBuffer`.

| Name | Description | Example |
| --- | --- | --- |
| append(String str) | It appends the string represented by `str` at the end of given string. | s1 = `new` StringBuffer(`"refresh"`);s1.append(`"Java"`);`// s1 = "refreshJava"` |
| insert(`int` offset, String str) | Used to insert string represented by `str` at index specified by `offset` in given string. | s1 = `new` StringBuffer(`"refresh"`);s1.insert(2, `"java"`);`// s1 = "rejavafresh"` |
| delete (`int` startIndex, `int` endIndex) | It deletes characters from `startIndex` to `(endIndex-1)` from given string. | s1 = `new` StringBuffer(`"refresh java"`);s1.delete(2,7);`// s1 = "re java"` |
| replace (`int` start, `int` end, String str) | It replaces characters from `start` to `(end-1)` index with string represented by `str` in given string. | s1 = `new` StringBuffer(`"refresh java"`);s1.replace(0,7,`"tutorial"`);`// s1 = "tutorial java"` |
| reverse() | It reverses the sequence of characters of given string. | s1 = `new` StringBuffer(`"refresh java"`);s1.reverse();`// s1 = "avaj hserfer"` |
| setCharAt(`int` index, `char` ch) | Used to replace the character at given `index` with character represented by `ch` in given string. | s1 = `new` StringBuffer(`"refresh"`);s1.setCharAt(0,`'s'`);`// s1 = "sefresh"` |

## String vs StringBuffer vs StringBuilder

- The String object is **`immutable`** while objects of StringBuffer and StringBuilder are **`mutable`**.
- StringBuffer is **`thread safe`** as it's methods are `synchronized` while StringBuilder is not, so use StringBuffer in multi-threaded environment where thread safety is needed.
- StringBuffer is **`not as faster as`** StringBuilder for string manipulation operations, since methods of StringBuffer class is synchronized.
- StringBuilder was added in **`java 1.5`**, before that there was only String and StringBuffer classes for string handling.
- In single threaded environment, prefer String over StringBuilder if you don't need mutable objects as String is more easy and convenient to use. Use StringBuilder if mutable objects needed.
- In multi-threaded environment, prefer StringBuffer if you need mutable objects as StringBuffer is thread safe. Use String if mutable objects not needed. 