# Exception Handling

## types of errors

1. **Syntax Errors**: These occur when the code does not conform to the rules of the programming language. For example, missing a colon at the end of a function definition.

    ```java
    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!")
        }
    }
    ```

    In the above code, there is a syntax error because of the missing semicolon at the end of the `System.out.println` statement.because there is no semicolon at the end of the print statement.
    syntax errors are usually caught by the compiler or interpreter before the program is run.
2. **Runtime Errors**: These occur during the execution of the program. Examples include division by zero or trying to access a variable that has not been defined.

    ```java
    public class Division {
        public static void main(String[] args) {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        }
    }
    ```

    In the above code, there is a runtime error because of division by zero. This will cause the program to crash when it is executed.
    It can be caught using exception handling mechanisms provided by the programming language.
3. **Logical Errors**: These occur when the program runs without crashing but produces incorrect results. This is often due to a mistake in the program's logic.

    ```java
    public class Calculator {
        public static void main(String[] args) {
            int a = 10;
            int b = 2;
            int c=5;
            int result = a/b*c;
            System.out.println("Result: " + result);
        }
    }
    ```

      In the above code, there is a logical error in the calculation of the result. The intended operation was to divide `a` by `b` and then multiply by `c`, but due to operator precedence, the multiplication is performed first. This results in an incorrect output.

---
logical errors are the hardest to detect because the program runs without any errors, but the output is not what was expected, and it can only be identified through thorough testing and debugging.

**Syntax and Logical errors are faced by developers during the coding phase.**
**Runtime errors are often faced by users during the execution phase.**

## What is an Exception?

An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. When an exception occurs, the program's control is transferred to a special block of code designed to handle the exception.

## What is Exception Handling?

Exception handling is a mechanism that allows developers to handle runtime errors gracefully without crashing the program. It involves using specific constructs provided by the programming language to catch and manage exceptions.

## Why is Exception Handling Important?

1. **Graceful Degradation**: It allows the program to continue running or terminate gracefully instead of crashing abruptly.
2. **Error Reporting**: It provides a way to report errors to the user or log them for debugging purposes.
3. **Resource Management**: It helps in managing resources like file handles, database connections, etc., ensuring they are properly released even in the event of an error.
4. **Improved User Experience**: By handling exceptions, developers can provide meaningful error messages to users, improving the overall user experience.
5. **Separation of Error-Handling Code from Regular Code**: It allows developers to separate the error-handling logic from the main logic of the program, making the code cleaner and easier to maintain.

## Common Exception Handling Constructs

1. **try-catch block**: The code that may throw an exception is placed inside a `try` block, and the code to handle the exception is placed inside a `catch` block.

    ```java
    try {
        // Code that may throw an exception
    } catch (ExceptionType e) {
        // Code to handle the exception
    }
    ```

2. **Nested try-catch blocks**: You can have try-catch blocks inside other try or catch blocks to handle different exceptions separately.

    ```java
    try {
        // Code that may throw an exception
        try {
            // Code that may throw another exception
        } catch (AnotherExceptionType e) {
            // Handle another exception
        }
    } catch (ExceptionType e) {
        // Handle the first exception
    }
    ```

3. **Nested catch blocks**: You can have multiple catch blocks to handle different types of exceptions separately.

    ```java
    try {
        // Code that may throw an exception
    } catch (FirstExceptionType e) {
        // Handle first exception
    } catch (SecondExceptionType e) {
        // Handle second exception
    }
    ```

4. **finally block**: This block is used to execute code that must run regardless of whether an exception occurred or not, such as closing resources.

    ```java
    try {
        // Code that may throw an exception
    } catch (ExceptionType e) {
        // Code to handle the exception
    } finally {
        // Code that will always execute
    }
    ```

## Best Practices for Exception Handling

1. **Catch Specific Exceptions**: Always catch specific exceptions rather than using a generic exception handler
2. **Avoid Empty Catch Blocks**: Do not leave catch blocks empty; always handle the exception appropriately.
3. **Log Exceptions**: Always log exceptions for debugging and auditing purposes.

## Built-in Exceptions class in Java

Java provides a rich set of built-in exception classes that can be used to handle various types of errors. Some common built-in exceptions include:

- `ArithmeticException`: Thrown when an arithmetic operation fails, such as division by zero.
- `NullPointerException`: Thrown when trying to access a member of a null object.
- `ArrayIndexOutOfBoundsException`: Thrown when trying to access an array element with an invalid index.
- `FileNotFoundException`: Thrown when trying to access a file that does not exist.
- `IOException`: Thrown when an I/O operation fails or is interrupted.
- `ClassNotFoundException`: Thrown when trying to load a class that cannot be found.
- `NumberFormatException`: Thrown when trying to convert a string to a numeric type, but the string does not have the appropriate format.
These built-in exceptions can be caught and handled using the exception handling constructs discussed earlier.

## Here is exception and Error Hierarchy in Java

![alt text](../images/Exceptions.png)

## NOTE: There are more exceptions and errors in Java, but these are some of the most commonly encountered ones

**For a complete list, refer to the Java documentation.**
[Link to Java Documentation](https://rollbar.com/blog/java-exceptions-hierarchy-explained/)

## Class Exception in Java

In Java, Class exception is the superclass of all exceptions that can be thrown during the normal operation of the Java Virtual Machine. It is a part of the `java.lang` package and extends the `Throwable` class.

1. string .getMessage(): This method returns a detailed message about the exception, which can be useful for debugging purposes.

    ```java
    try {
        int result = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println(e.getMessage()); // Output: / by zero
    }
    ```

2. void printStackTrace(): This method prints the stack trace of the exception to the standard error stream. It provides information about the sequence of method calls that led to the exception being thrown.

    ```java
    try {
        int result = 10 / 0;
    } catch (ArithmeticException e) {
        e.printStackTrace(); // it itself contains println method.
    }
    ```

    Output:

    ```java
    java.lang.ArithmeticException: / by zero
        at Main.main(Main.java:5)
    ```

3. string toString(): This method returns a string representation of the exception, which includes the exception's class name and the detailed message.

    ```java
    try {
        int result = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println(e.toString()); // Output: java.lang.ArithmeticException: / by zero
        System.out.println(e); // bydefault calls toString();
    }
    ```

These methods are commonly used for debugging and logging purposes when handling exceptions in Java.

## Custom Exceptions

In addition to the built-in exceptions provided by Java, developers can create their own custom exception classes to handle specific error conditions in their applications. Custom exceptions can extend the `Exception` class or any of its subclasses.

  ```java
  // Let 's create a custom exception called MinimumBalanceException which is thrown when a bank account balance goes below 5000
  class MinimumBalanceException extends Exception{
    public String toString(){
      return "MinimumBalanceException: Balance cannot go below 5000 .Try again!";
    }
  }
  ```

## Checked vs Unchecked Exceptions

1. **Checked Exceptions**:Checked exceptions are checked at compile-time. It means if a method is throwing a checked exception then it should handle the exception using try-catch block or it should declare the exception using throws keyword, otherwise the program will give a compilation error.
Examples of checked exceptions include `IOException`, `SQLException`, and `ClassNotFoundException`.

2. **Unchecked Exceptions**: Unchecked exceptions are not checked at compile time. It means if your program is throwing an unchecked exception and even if you didn’t handle/declare that exception, the program won’t give a compilation error. Most of the times these exception occurs due to the bad data provided by user during the user-program interaction. It is up to the programmer to judge the conditions in advance, that can cause such exceptions and handle them appropriately. All Unchecked exceptions are direct sub classes of RuntimeException class.
Examples of unchecked exceptions include `ArithmeticException`, `NullPointerException`, and `ArrayIndexOutOfBoundsException`.

## NOTE:All the user defined exception classes are unchecked in nature because compiler don't forces us to handle them. they are simply thrown to sequence of calling functions without being handled

**In summary, checked exceptions must be either caught or declared in the method signature, while unchecked exceptions do not have this requirement.**

## Throw vs Throws

1. **throw**: The `throw` keyword is used to explicitly throw an exception from a method or a block of code. It is followed by an instance of the exception class.

2. **throws**: The `throws` keyword is used in a method signature to declare that the method may throw one or more exceptions. It indicates to the caller of the method that they need to handle or declare these exceptions.

Example:

```java
class NegativeNumber extends Exception{
  public String toString() {
    return "Dimensions cannot be negative..";
  }
}
public class th{
  static int meth3(int a,int b) throws NegativeNumber {
    if(a<0 || b<0 ) {
      throw new NegativeNumber();
    }
    return a*b;
    }
  static void meth2() throws NegativeNumber {
    int a=2,b= -21;
    int c= meth3(a,b);
    System.out.println(c);
  }
  public static void main(String arpgs[]) {
    try {
       meth2();
     } catch (Exception e) {
      System.out.println(e);
     }
  }
}
```

## Finally Block

The `finally` block is used in conjunction with `try` and `catch` blocks to ensure that a specific section of code is executed regardless of whether an exception was thrown or caught. It is typically used for cleanup activities, such as closing resources like file streams or database connections.

```java
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int data = 25 / 0; // This will throw ArithmeticException
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed. Cleanup can be done here.");
        }
    }
}
```

## Try with Resources

The `try-with-resources` statement is a special form of the `try` statement that automatically manages resources that need to be closed after use. It ensures that each resource is closed at the end of the statement, even if an exception occurs. This feature was introduced in Java 7.

```java
 // Just an example you may read some file handling before this...
package resourcesdemo;
import java.io.*;
import java.util.*;

public class ResourcesDemo 
{
    
    static void Divide() throws Exception
    {
        
        
        try(FileInputStream fi=new FileInputStream("/Users/name/Desktop/Test.txt");Scanner sc=new Scanner(fi) )
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/c);
        }
        
    }
    
    public static void main(String[] args) throws Exception
    {
        try
        {
        Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        //int x=sc.nextInt();
        
       // System.out.println(x);
        
    }
    
}
```

## All classes of Exception extend from Throwable. In Java, the Exception class is a subclass of Throwable, which means every exception you handle in Java is derived from Throwable, ensuring that they all have the common behaviors and properties. This hierarchy allows for consistent exception handling throughout your code.
