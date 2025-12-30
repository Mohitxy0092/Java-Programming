# Polymorphism

Polymorphism is a core concept in object-oriented programming and polymorphism also known as one of the pillars of OOP that allows objects of different classes to be treated as objects of a common superclass. It enables a single interface to represent different underlying forms (data types). The most common use of polymorphism in Java is through method overriding and method overloading.

## Types of Polymorphism

1. **Compile-time Polymorphism (Static Polymorphism)**: This is achieved through method overloading and operator overloading. The method to be invoked is determined at compile time based on the method signature.
    - **Method Overloading**: Multiple methods with the same name but different parameter lists within the same class.
    - **Operator Overloading**: Java does not support operator overloading like some other languages (e.g., C++), but it allows certain operators to behave differently based on the context (e.g., `+` for string concatenation).

    Example of Method Overloading:

    ```java
    class Addition {
        // Method to add two integers
        int add(int a, int b) {
            return a + b;
        }

        // Method to add three integers
        int add(int a, int b, int c) {
            return a + b + c;
        }
    }
    ```

2. **Runtime Polymorphism (Dynamic Polymorphism)**: This is achieved through method overriding. The method to be invoked is determined at runtime based on the object type.

    - **Method Overriding**: A subclass provides a specific implementation of a method that is already defined in its superclass.
    Example of Method Overriding:

    ```java
    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }
    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }
    public class Polymorphism {
        public static void main(String[] args) {
            Animal myAnimal = new Animal();
            Animal myDog = new Dog();

            myAnimal.sound();  // Outputs: Animal makes a sound
            myDog.sound();     // Outputs: Dog barks
        }
    }
    ```

## Note:- In Java, if no access specifier is provided for a method, it is assigned default (package-private) access, meaning it is accessible only within the same package

## Benefits of Polymorphism

- **Code Reusability**: Polymorphism allows for code to be reused across different classes, reducing redundancy.
- **Flexibility and Maintainability**: It makes the code more flexible and easier to maintain, as new classes can be added with minimal changes to existing code.
- **Improved Readability**: Polymorphic code is often easier to read and understand, as it abstracts away specific implementations.
- **Dynamic Method Resolution**: It allows for dynamic method resolution, enabling more dynamic and adaptable code behavior at runtime.

