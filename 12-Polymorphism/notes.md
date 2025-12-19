# Polymorphism

Polymorphism is a core concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass. It enables a single interface to represent different underlying forms (data types). The most common use of polymorphism in Java is through method overriding and method overloading.

## Types of Polymorphism

1. **Compile-time Polymorphism (Static Polymorphism)**: This is achieved through method overloading and operator overloading. The method to be invoked is determined at compile time based on the method signature.
    - **Method Overloading**: Multiple methods with the same name but different parameter lists within the same class.
    - **Operator Overloading**: Java does not support operator overloading like some other languages (e.g., C++), but it allows certain operators to behave differently based on the context (e.g., `+` for string concatenation).

2. **Runtime Polymorphism (Dynamic Polymorphism)**: This is achieved through method overriding. The method to be invoked is determined at runtime based on the object type.

    - **Method Overriding**: A subclass provides a specific implementation of a method that is already defined in its superclass.

## Note:- In Java,if we do not give access specifier to a method,by default it is considered as private.