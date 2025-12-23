# Interfaces

An Abstract Class is defined as a class that’s declared with the “abstract” keyword. It is a collection of common subclass characteristics that should include at least one abstract method. An abstract class can have multiple concrete methods. Programmers using Java 8 and later can also incorporate default and static methods.

-An abstract class cannot be instantiated, meaning you cannot create an object with it.

-Programmers use abstract class vs interface Java when they need:

-Default functionality for subclasses

-Templates for future specific classes

-Defining a common interface for any subclasses

-Code reusability

An interface is a blueprint used to implement a class. It is a collection of abstract methods and contains no concrete methods, unlike abstract class. However, the interface offers full abstraction in Java, something that abstract classes cannot do.

Like a class, an interface can contain methods and variables, though the declared methods default to abstract.

Interfaces cannot be instantiated, though abstract classes that implement interfaces can.

Programmers use interface when they need:

-To achieve abstraction

-To support a dynamic resolution at run time

-Achieving loose coupling

-Separating a method’s definition from the inheritance’s hierarchy

## An interface in java is declared using interface keyword, followed by interface name. After interface name it's interface body enclosed in { }. The basic syntax of declaring an interface is:

 ```java
 interface interfaceName {
    // constant declarations
    // Method signatures
  }
  
 Example :  

 interface MyInterface {
     int id = 20;
     void print();
     public int calculateArea();
  }
  ```
## Key Points about Interfaces:
- All methods in an interface are implicitly public and abstract (except static and default methods).
- All variables in an interface are implicitly public, static, and final (constants).
- A class can implement multiple interfaces, allowing for multiple inheritance of type.
- An interface can extend multiple other interfaces.
- Interfaces cannot have constructors because they cannot be instantiated.
- From Java 8 onwards, interfaces can have default and static methods with concrete implementations.
- From Java 9 onwards, interfaces can have private methods to share code between default methods.
- Interfaces are used to achieve abstraction and multiple inheritance in Java.
- To implement an interface in a class, the class must use the `implements` keyword and provide concrete implementations for all abstract methods defined in the interface.

```java
interface Animal {
    void eat();
    void sleep();
}
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
```

## NOTE: we cannot make private, protected or default methods in interface. All methods are by default public in interface.

## summary table


| Concept | How it appears | Example from your code | What it really means |
| --- | --- | --- | --- |
| Interface | Blueprint / contract | `interface Test` | Defines *what* methods must exist, not *how* |
| Interface constant | `public static final` by default | `Test.X` | One shared constant, no object needed |
| Interface static method | Belongs to interface only | `Test.meth3()` | Called using interface name, never via object |
| Child interface | Interface inheritance | `interface Test2 extends Test` | Adds more behavior to parent interface |
| Implementing class | Provides implementation | `class My implements Test2` | Must implement **all** abstract methods |
| Object creation | Real instance | `new My()` | Actual object in memory |
| Interface reference | Polymorphism | `Test t = new My();` | Reference limits accessible methods |
| Child interface reference | Wider access | `Test2 t2 = new My();` | Can call parent + child methods |
| Method call (runtime) | Dynamic binding | `t.meth1()` | Calls `My`’s version at runtime |
| `this` keyword | Current object | `this.meth1()` | Refers to the `My` object itself |
| Illegal instantiation | Not allowed | `new Test()` | Interfaces cannot be instantiated |
| Illegal static access | Compile error | `t.meth3()` | Static interface methods aren’t polymorphic |
