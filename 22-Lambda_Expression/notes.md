# Lamdba Expression

Lambda expression in Java is a feature introduced in Java 8 that allows you to implement one-function interfaces (functional interfaces) more simply and concisely. It is an anonymous function that adds functional programming techniques to Java, making it easier to write code in specific situations compared to using anonymous inner classes.It can be used to create threads, comparators and can be used to add event Listeners.

## How was Before Lambda Expression?

```java
// Before Java 8
MyInter person = new MyInter() {  
    @Override 
    public void MyInterMethod() {
        System.out.println("Before Java 8 without lambda");
    }  
};

// Java 8: Using lambda expression
MyInter p2 = () -> {
    System.out.println("Lambda implemented");
};
```

## Lambda Expression representation :

```java
  MyInter p2=()->{
    System.out.println("Lambda Expression representation...");
  };
------------------------OR--------------------------
  MyInter p2=()-> System.out.println("Lambda Expression representation...");

```

## **Java Lambda Expression Syntax**

### **1. No Parameter Syntax**

It is the case when the function does not require any input parameter, so don't provide anything in the parameters and the rest of the things are the same.

```java
// No Parameter Syntax

() -> {body of function}

```

### **2. One Parameter Syntax**

We only need to pass one input parameter in this situation; however, while using lambda, we don't need to specify the data type of input parameters because the compiler discovers it automatically.

```java
// One Parameter Syntax
(a) -> {body of function}

```

### **3. Multiple Parameter Syntax**

The case, as the name implies, refers to a circumstance in which two input parameters are necessary.

```java
// Two Parameter Syntax
( a, b) -> {body of function}

```

## Functional Interfaces

A functional interface is an interface that contains only one abstract method. They can have multiple default or static methods but only one abstract method. Lambda expressions are primarily used to provide the implementation of functional interfaces.

```java
@FunctionalInterface
interface MyInter {
    void MyInterMethod(); // Single abstract method
}
```

## **CAPTURE IN LAMBDA EXPRESSIONS**

- Lambda expressions can contain multiple statements.
- Variables can be declared inside lambda expressions.
- Lambda expressions can have local variables.
- These expressions can access or capture local variables if they are final or cannot be modified.
- Lambda expressions can even capture instance variables, whether they are final or not.
- Lambda expressions are similar to inner classes.
- A lambda expression can be passed to a method as an object, since it is used to define a method.
- When a method takes a functional interface as a parameter, you can pass a lambda expression to that method.

## **METHOD REFERENCE**

- Method references are created or defined using functional interfaces.
- `::` (scope resolution operator in C/C++) is the operator used for referencing.
- In Java, `::` is used for method reference.
- Any method can be called or referred to by a functional interface with a single method.
- For non-static members, methods are assigned using objects.
- Constructors of any class can be assigned as method references.
- This method is used to write compact code.
- Method referencing is similar to polymorphism.

## Advantages of Lambda Expressions

1. **Conciseness**: Lambda expressions reduce the amount of boilerplate code, making it easier to read and maintain.
2. **Improved Readability**: The syntax of lambda expressions is more straightforward, which enhances code readability.
3. **Functional Programming**: Lambda expressions enable functional programming techniques in Java, allowing for more expressive and flexible code.
4. **Enhanced API Usage**: Many Java APIs, such as the Collections Framework, have been enhanced to take advantage of lambda expressions, making it easier to work with collections and streams.
5. **Parallel Processing**: Lambda expressions can be used with the Stream API to facilitate parallel processing, improving performance for large data sets.
6. **Event Handling**: Lambda expressions simplify event handling in GUI applications by allowing developers to define event listeners more concisely.

## Disadvantages of Lambda Expressions

1. **Debugging Difficulty**: Debugging lambda expressions can be more challenging than traditional code, as stack traces may not provide clear information about the source of errors.
2. **Readability for Complex Logic**: While lambda expressions improve readability for simple cases, they can become difficult to read and understand when used for complex logic.
3. **Limited to Functional Interfaces**: Lambda expressions can only be used with functional interfaces, which may limit their applicability in certain scenarios.
4. **Performance Overhead**: In some cases, the use of lambda expressions may introduce performance overhead due to the creation of additional objects, although this is generally minimal.