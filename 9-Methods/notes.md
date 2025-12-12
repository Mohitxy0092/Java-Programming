# Methods or functions in java

## Methods in Java are blocks of code that perform a specific task. They are used to organize code into reusable sections, making it easier to read, maintain, and debug. Methods can take input parameters, perform operations, and return a result

```java
returnType  methodName(parameter list){
    // method body
    // code to be executed
}
```

- `returnType`: The data type of the value that the method returns. If the method does not return a value, use `void`.
- `methodName`: The name of the method. It should be descriptive and follow Java naming conventions.
- `parameter list`: A comma-separated list of input parameters that the method accepts. Each parameter has a data type and a name.

## two types of methods in java

1. **Static Methods**: These methods belong to the class rather than an instance of the class. They can be called without creating an object of the class. Static methods are defined using the `static` keyword.

      ```java
      import java.util.*;
      public class method{
        static boolean func(int a,int b) {
          return a==b;
        }

        public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          int b=sc.nextInt();
          sc.close();
          boolean c=func(a,b);
          System.out.println(c);
        
        }
      }
      ```

2.**Instance Methods**: These methods belong to an instance of a class. They can only be called on an object of the class. Instance methods do not use the `static` keyword.

  ```java
  import java.util.*;
  public class method{
    boolean func(int a,int b) {
      return a==b;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      sc.close();
      method obj=new method();
      boolean c=obj.func(a,b);
      System.out.println(c);
    }
  }
  ```

## passing variables to methods will be done in two ways

1. **Pass by Value**: In Java, primitive data types (like int, float, char, etc.) are passed to methods by value. This means that a copy of the variable's value is made and passed to the method. Changes made to the parameter inside the method do not affect the original variable.

    ```java
    public class PassByValue {
        static void increment(int num) {
            num += 10;
            System.out.println("Inside method: " + num);
        }

        public static void main(String[] args) {
            int a = 5;
            System.out.println("Before method call: " + a);
            increment(a);
            System.out.println("After method call: " + a);
        }
    }
    ```

    Output:

    - Before method call: 5
    - Inside method: 15
    - After method call: 5

2. **Pass by Reference**: In Java, objects (like arrays, classes, etc.) are passed to methods by reference. This means that a reference (or address) to the object is passed to the method. Changes made to the object inside the method will affect the original object.

    ```java
    public class PassByReference {
        static void modifyArray(int[] arr) {
            arr[0] = 99;
            System.out.println("Inside method: " + arr[0]);
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            System.out.println("Before method call: " + arr[0]);
            modifyArray(arr);
            System.out.println("After method call: " + arr[0]);
        }
    }
    ```

  Output:

- Before method call: 1
- Inside method: 99
- After method call: 99

## NOTE

- Java always uses pass by value. However, when passing objects, the value being passed is the reference to the object, which can lead to modifications of the object's state.
- Primitive data types are passed by value, while object references are also passed by value, but they refer to the same object in memory.
