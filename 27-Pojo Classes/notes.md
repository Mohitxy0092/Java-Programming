# POJO Classes

**POJO** stands for **Plain Old Java Object**. It is a simple Java class used mainly to hold data.

Key characteristics:

1. **Simple Java class**
    - Contains **instance variables (fields)**.
    - Provides **getter and setter methods** to access and modify those fields.
2. **Public class**
    - The class should generally be declared as `public`.
3. **Default constructor**
    - Should have a **public no-argument (default) constructor**.
4. **No framework-specific annotations**
    - A POJO should not use persistence/framework annotations such as:
        - `@Entity`
        - `@Table`
        - `@Id`
        and many more..
5. **No inheritance or interface implementation**
    - It should **not extend another class**.
    - It should **not implement an interface**.
6. **Purpose**
    - POJOs are commonly used to **represent and transfer data** without being tightly coupled to a particular framework.

**Example:**
```java
public class Student {

    private int id;
    private String name;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

## **Enum Classes**

- It has a collection of CONSTANTS (variables which values cannot be changed).
- Its CONSTANTS are static and final implicitly.
- It cannot extend any class, as it internally extends `java.lang.Enum`.
- It can implement interfaces.
- It can have variables, constructor, and methods.
- It cannot be instantiated.
- No other class can extend the `Enum` class.
- It can have an abstract method, and all constants should implement that abstract method.

### 1. Normal Enum Class
> Example:

```Java
//FileName:- EnumDemo.java
package EnumCodes;

public enum EnumDemo {
   MONDAY,
   TUESDAY,
   WEDNESDAY,
   THURSDAY,
   FRIDAY,
   SATURDAY,
   SUNDAY;
}

//FileName:- Main.java
import EnumCodes.normalEnum.EnumDemo;

public class Main {
   public static void main(String[] args) {
      for (EnumDemo e : EnumDemo.values()) {
         System.out.print(e.ordinal() + " ");
      }
      System.out.print("\n");
      EnumDemo e = EnumDemo.valueOf("MONDAY");
      System.out.println(e.name());
   }
}
```
>Mostly four methods are used in Enum:
> 
> `.values()`
> 
> `.ordinal()`
> 
> `.valueOf()`
> 
> `.name()`

Enum Constant Values

Internally, for every constant we define in an enum, an ordinal value is assigned, starting from 0.

For example:

MONDAY → 0

TUESDAY → 1

WEDNESDAY → 2

and so on.

This happens automatically when we don't define custom values for the enum constants.

We can access the ordinal value using the `ordinal()` method:

```java 

 for (EnumDemo e : EnumDemo.values()) {
        System.out.print(e.ordinal() + " ");
}

```

# Enum Methods

### 1. `values()`

`values()` returns an **array containing all the constants** present in the enum.

Each constant has an **ordinal value**, which represents its position in the enum, starting from `0`.

```java
EnumDemo.values();
```

For example:

```java
MONDAY→ ordinal 0
TUESDAY→ ordinal 1
WEDNESDAY→ ordinal 2
```

### 2. `valueOf()`

`valueOf("FRIDAY")` searches through all the constants in the enum and returns the constant that **exactly matches** the given `String`.

```java
EnumDemo.valueOf("FRIDAY");
```

It returns:

```java
FRIDAY
```

> The string must match the enum constant exactly, including **case**.
>

### 3. `name()`

`name()` returns the **name of the enum constant** as a `String`.

```java
EnumDemo.FRIDAY.name();
```

Output:

```java
FRIDAY
```


## checkout code files for these
### 2. Enum With Custom Values
### 3. Enum with Abstact
### 4. Enum with Interface
### 5. Enum with Overriding


> **Why `enum` is better than `final` and `static`?**

In Java, `enum` is usually better than `static final` constants when you're representing a **fixed set of related values**.

### Example with `static final`

```java
public static final int PENDING = 1;
public static final int APPROVED = 2;
public static final int REJECTED = 3;
```

Problems:

- Any `int` can be passed:

```java
processStatus(999); // Compiles!
```

- No type safety.
- You have to manually maintain unique values.
- Related behavior tends to end up elsewhere.
- Debugging/logging gives you `1`, `2`, `3` rather than meaningful names.

### With `enum`

```java
public enum Status {
    PENDING,
    APPROVED,
    REJECTED
}
```

Now:

```java
void processStatus(Status status) {
    // ...
}

processStatus(Status.APPROVED); // Good
processStatus(999);             // Compile-time error
```

The main benefit of `enum` is **type safety and clarity**.

With `static final`:

```java
static final int PENDING = 1;
static final int APPROVED = 2;

int status = 100;   // Compiles, even though invalid
```

With `enum`:

```java
enum Status {
    PENDING, APPROVED, REJECTED
}

Status status = Status.PENDING;
```

Now only `PENDING`, `APPROVED`, or `REJECTED` can be assigned.

Also, enums can have methods and fields:

```java
enum Status {
    PENDING, APPROVED, REJECTED;

    boolean isFinal() {
        return this == APPROVED || this == REJECTED;
    }
}
```

# 

## **Final class:**

A class that **cannot be inherited/extended** by another class.

```java
final class Animal {
    //something
}
```

```java
class Dog extends Animal { } // Compile-time error
```

### **Why to use final class?**

> To prevent inheritance and modification of the class's behavior through subclassing.