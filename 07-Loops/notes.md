# Loops

Loops are fundamental constructs in programming that allow you to execute a block of code multiple times based on certain conditions. They help automate repetitive tasks and can significantly reduce the amount of code you need to write.

## Types of Loops in Java

### 1. For Loop

**Definition:** A for loop is used when the number of iterations is known beforehand. It consists of three parts: initialization, condition, and increment/decrement.

**Syntax:**

```java
for (initialization; condition; increment/decrement) {
  // code block to be executed
}
```

**Example:**

```java
for (int i = 0; i < 5; i++) {
  System.out.println("Iteration: " + i);
}
```

### 2. While Loop

**Definition:** A while loop is used when the number of iterations is not known and depends on a condition being true.

**Syntax:**

```java
while (condition) {
  // code block to be executed
}
```

**Example:**

```java
int i = 0;
while (i < 5) {
  System.out.println("Iteration: " + i);
  i++;
}
```

```java
int[] arr = {1, 2, 3, 4};

int sum = 0;
int i = 0;

while (i < arr.length) {
    sum = sum + arr[i];
    i++;
}

System.out.println(sum);

```

### 3. Do-While Loop

**Definition:** A do-while loop is similar to a while loop, but it guarantees that the code block will be executed at least once.

**Syntax:**

```java
do {
  // code block to be executed
} while (condition);
```

**Example:**

```java
int i = 0;
do {
  System.out.println("Iteration: " + i);
  i++;
} while (i < 5);
```

## 4.Nested Loops

**Definition:** Nested loops allow you to run one loop inside another loop. The inner loop will execute all its iterations for each iteration of the outer loop.
**Syntax:**

```java
while (condition) {
  while (condition) {
    //it can be any number of nested loops
    // code block to be executed
  }
}
```

**Example:**

```java
int i = 1;
while (i <= 3) {
  int j = 1;
  while (j <= 2) {
    System.out.println("i: " + i + ", j: " + j);
    j++;
  }
  i++;
}
```

## Nested For Loops

**Syntax:**

```java
for (initialization; condition; increment/decrement) {
  for (initialization; condition; increment/decrement) {
    //it can be any number of nested loops
    // code block to be executed
  }
}
```

**Example:**

```java
for (int i = 1; i <= 3; i++) {
  for (int j = 1; j <= 2; j++) {
    System.out.println("i: " + i + ", j: " + j);
  }
}
```

## 5. For-Each Loop

**Definition:**
The for-each loop, is used to iterate over elements in an array or a collection without needing to manage the loop counter manually.
**Syntax:**

```java
for (dataType element : arrayOrCollection) {
  // code block to be executed
}
```

**Example:**

```java
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
  System.out.println("Number: " + number);
}
```

## Loop Control Statements

Loop control statements are used to alter the flow of execution in loops. The main loop control statements in Java are:

### 1. Break Statement

The `break` statement is used to exit a loop prematurely when a certain condition is met.
**Example:**

```java
for (int i = 0; i < 10; i++) {
  if (i == 5) {
    break; // Exit the loop when i is 5
  }
  System.out.println("Iteration: " + i);
}
```

### 2. Continue Statement

The `continue` statement is used to skip the current iteration of a loop and proceed to the
next iteration.
**Example:**

```java
for (int i = 0; i < 10; i++) {
  if (i % 2 == 0) {
    continue; // Skip even numbers
  }
  System.out.println("Odd Iteration: " + i);
}
```
