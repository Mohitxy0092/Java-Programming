# Generics in Java

## Q1 : Why we need Generics in Java what are the problems without Generics?

Generics were introduced in Java to provide stronger type checks at compile time and to support generic programming. Before generics, developers often used `Object` references to store different types of objects, which led to several problems:

1. **Type Safety**: Without generics, you could inadvertently add an object of the wrong type to a collection, leading to `ClassCastException` at runtime when you try to retrieve and cast the object.
2. **Code Clarity**: Code that uses generics is often clearer and easier to read because it explicitly states what type of objects a collection can hold.
3. **Elimination of Casts**: With generics, you don't need to cast objects when retrieving them from a collection, reducing boilerplate code and potential runtime errors.
4. **Reusability**: Generics allow you to create classes, interfaces, and methods that operate on a parameterized type, making them more reusable across different types.
5. Compile-Time Checking: Generics enable the compiler to catch type-related errors at compile time rather than at runtime, leading to more robust code.
6. Improved Performance: By avoiding the need for casting, generics can lead to better performance since there is less overhead associated with type checking at runtime.

Overall, generics enhance the robustness, maintainability, and readability of Java code by providing a way to define classes and methods with a placeholder for the type of data they operate on.

## What is Generics in Java?

Generics allow you to write classes, interfaces, and methods that work with different data types, without having to specify the exact type in advance.

This makes your code more flexible, reusable, and type-safe.

## Why Use Generics?

1. **Code Reusability:** Write one class or method that works with different data types.
2. **Type Safety:** Catch type errors at compile time instead of runtime.
3. **Cleaner Code:** No need for casting when retrieving objects.

### Example of Generics in Java:

```java
class Data <T> {
    private T obj;
    public void setData(T obj) {
        this.obj=obj;
    }
    public T getData() {
        return obj;
    }
}
public class genericDemo3 {
    public static void main(String[] args) {
        Data<Integer> d=new Data<>();
        d.setData(10);
        d.setData(20);
        System.out.println(d.getData());
    }
}
```

In this example, `Data` is a generic class that can hold any type of object specified by the type parameter `T`. When we create an instance of `Data<Integer>`, it means that this instance will only hold `Integer` objects. This ensures type safety and eliminates the need for casting when retrieving the data.

---

## Note: Generics does not work with primitive types (int, float, char, etc). Instead, we use their wrapper classes (Integer, Float, Character, etc).

---

## No Parameterized Types

When you create a generic class or method without specifying a type parameter, it is called a raw type. Using raw types can lead to unsafe operations and is generally discouraged.

### Example of Raw Type:

```java
class Data {
    private Object obj;
    public void setData(Object obj) {
        this.obj=obj;
    }
    public Object getData() {
        return obj;
    }
}
public class genericDemo4 {
    public static void main(String[] args) {
        Data d=new Data();
        d.setData(10); // Storing an Integer
        d.setData("Hello"); // Storing a String
        Integer value = (Integer) d.getData(); // This will cause a ClassCastException at runtime
        System.out.println(value);
    }
}
```

In this example, the `Data` class uses `Object` to store any type of data. When we retrieve the data, we have to cast it to the expected type, which can lead to a `ClassCastException` if the type does not match. This is one of the main problems that generics aim to solve by providing type safety at compile time.

---

## Multiple Type Parameters

Generics in Java can also support multiple type parameters, allowing you to create classes or methods that can work with more than one type.

### Example of Multiple Type Parameters:

```java
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    
    public V getValue() {
        return value;
    }
}
public class Demo{
    public static void main(String[] args){
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());
    }
}
```

In this example, the `Pair` class uses two type parameters, `K` and `V`, to represent the key and value types, respectively. When we create an instance of `Pair<String, Integer>`, it means that the key is of type `String` and the value is of type `Integer`. This allows for greater flexibility and type safety when working with pairs of related data.
---

## Bounded Type Parameters
Generics in Java can also have bounded type parameters, which restrict the types that can be used as arguments for a type parameter. This is done using the `extends` keyword.
### Example of Bounded Type Parameters:

```java
class Box<T extends Number> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
public class Demo {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setValue(10);
        System.out.println("Integer Value: " + intBox.getValue());

        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(20.5);
        System.out.println("Double Value: " + doubleBox.getValue());

        // Box<String> strBox = new Box<>(); // This will cause a compile-time error
    }
}
```

In this example, the `Box` class has a bounded type parameter `T` that extends the `Number` class. This means that only types that are subclasses of `Number` (like `Integer`, `Double`, etc.) can be used as type arguments for `Box`. Attempting to use a type like `String` will result in a compile-time error, ensuring type safety and preventing invalid types from being used.

---

## Subtypes
In Java Generics, subtyping works differently than with regular classes. If you have a generic class `Box<T>`, then `Box<SubType>` is not considered a subtype of `Box<SuperType>`, even if `SubType` is a subtype of `SuperType`. This is known as invariance in generics.

