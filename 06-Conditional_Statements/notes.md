# Conditional Statements

Conditional statements are used to perform different actions based on different conditions. In programming, they allow you to control the flow of execution depending on whether a certain condition is true or false.

## Types of Conditional Statements

1. **if statement**: The `if` statement is used to execute a block of code if a specified condition is true.

      ```java
      Syntax
    if (condition) {
      // block of code to be executed if the condition is true
    }
    ```

      Example:

      ```java
      int number = 10;
      if (number > 0) {
          System.out.println("The number is positive.");
      }
      ```

2. **if-else statement**: The `if-else` statement is used to execute one block of code if a condition is true, and another block of code if the condition is false.

      ```java
      Syntax
    if (condition) {
      // block of code to be executed if the condition is true
    }

    else {
      // block of code to be executed if the if condition is false
    }
    ```

      Example:

   ```java
    int number = -5;
    if (number > 0) {
        System.out.println("The number is positive.");
    } else {
        System.out.println("The number is not positive.");
    }
    ```

3. **else-if ladder**: The `else-if` ladder is used to check multiple conditions sequentially.
  
      ```java
      Syntax
    if (condition1) {
      // block of code to be executed if condition1 is true
    } else if (condition2) {
      // block of code to be executed if condition2 is true
    } else {
      // block of code to be executed if both condition1 and condition2 are false
    }
    ```

    Example:

    ```java
    int number = 0;
    if (number > 0) {
        System.out.println("The number is positive.");
    } else if (number < 0) {
        System.out.println("The number is negative.");
    } else {
        System.out.println("The number is zero.");
    }
4. **Nested if**: You can use nested `if` statements to check multiple conditions within another `if` statement.

    ```java
    Syntax
    if (condition1) {
      // code to run if condition1 is true
      if (condition2) {
        // code to run if both condition1 and condition2 are true
      }
    }
    ```

      Example:

      ```java
          int number = 15;
          if (number > 0) {
              if (number % 2 == 0) {
                  System.out.println("The number is positive and even.");
              } else {
                  System.out.println("The number is positive and odd."); 
              }
          }
      ```

## Switch Case

Switch case is a control statement that allows a variable to be tested for equality against a list of values. Each value is called a case, and the variable being switched on is checked for each case.

  ```java
    Syntax
    switch (variable) {
        case value1:
            // code to be executed if variable == value1
             break;
        case value2:
            // code to be executed if variable == value2
            break;
          // you can have any number of case statements
        default:
            // code to be executed if variable doesn't match any case
            break;
    }
  ```

  Example:

  ```java
      int day = 3;
      String dayName;
      switch (day) {
          case 1:
              dayName = "Monday";
              break;
          case 2:
              dayName = "Tuesday";
              break;
          case 3:
              dayName = "Wednesday";
              break;
          case 4:
              dayName = "Thursday";
              break;
          default:
              dayName = "Invalid day";
              break;
      }
      System.out.println("Day: " + dayName);
  ```

## Difference between if-else and switch-case

- **if-else** statements can evaluate a wide range of conditions (e.g., relational, logical), while **switch-case** statements can only evaluate discrete values (e.g., integers, characters, enums).
- **switch-case** statements can be more efficient and easier to read when dealing with multiple discrete values, while **if-else** statements are more flexible for complex conditions.

- **switch-case** directly compares the value of a variable to the case values, while if-else statements evaluate boolean expressions.
