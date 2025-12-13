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

## Method Overloading

Method overloading is a feature in Java that allows a class to have multiple methods with the same name but different parameter lists (different types, number, or both). The correct method to be called is determined at compile time based on the arguments passed.

```java
public class overl {
    public class overl{
  static int max(int a, int b) {
    return (a > b) ? a : b;
  }

  static float max(float a, float b) {
    return (a > b) ? a : b;
  }

  static int max(int a, int b, int c) {
    return max(max(a, b), c);
  }

  public static void main(String[] args) {
    System.out.println(max(10, 20));
    System.out.println(max(10.5f, 7.2f));
    System.out.println(max(5, 15, 10));
  }
}
}
```

## Variable Arguements

Variable arguments (varargs) in Java allow a method to accept zero or more arguments of a specified type. This is useful when you don't know in advance how many arguments will be passed to the method. Varargs are defined using an ellipsis (`...`) after the parameter type.

### NOTE: A method can have only one varargs parameter, and it must be the last parameter in the method's parameter list

```java
public class vargs {
  static void show(int ...A){
    for(int x : A){
      System.out.println("values : "+x);
    }
  }
  void printString(String ...s){
      
    for(int i=0;i<s.length;++i) {
      System.out.println("index : "+i + " name: "+ s[i]);
    }
  }
  
  void printString(int start,String... s) {

    for (int i = 0; i < s.length; ++i) {
      System.out.println("index : " + start + " name: " + s[i]);
      start++;
    }
  }
  public static void main(String args[]){
    show();
    show(12,13,14,15);
    show(new int[]{1,2,3,4,5});
    vargs s=new vargs();
    s.printString("John", "Mohn", "Don", "Swarn", "parteek");
    System.out.println("Calling function with starting point : ");
    s.printString(3,"John","Mohn","Don","Swarn","parteek");
  }
}
```

### Recursion in Java

Recursion is a programming technique where a method calls itself to solve a problem. In Java, recursion can be used to break down complex problems into simpler subproblems. A recursive method typically has two main components: a base case that stops the recursion and a recursive case that continues the recursion.

```java
public class recur {
  static int fib(int x){
    if(x<=0) return 0;
    if(x==1) return 1;
    return fib(x-1)+fib(x-2);
  }
  public static void main(String[] args) {
    System.out.println(fib(5));
  }
}
```

Output:5
