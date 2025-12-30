# Array in Java

An array in Java is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed.

## Creating Arrays

**Arrays can be created in two ways:**

![alt text](/images/array1.png)

1. Using the `new` keyword:

   ```java
   int ar[]=new int[5]; // Creates an array of integers with a length of 5
   int[] b= new int[5]; // Another way to create an array of integers with a length of 5
   ```

2. Using array literals:

   ```java
    int ar1[]={1,2,3,4,5}; // Creates and initializes an array of integers
    ```
  
## Array have property length

In Java, arrays have a built-in property called `length` that provides the number of elements in the array. This property is useful for iterating through the array or performing operations based on its size.

```java
int ar[]={1,2,3,4,5};
System.out.println("Length of the array: " + ar.length); // Output: Length of the array: 5
```

## NOTE: The `length` property is accessed without parentheses, unlike methods

## Traversing or Accessing Array Elements

Array elements can be accessed using their index, which starts from 0. You can read or modify the elements of an array using their index.

**Using index to access and modify array elements:**

```java
int ar1[]={1,2,3,4,5,6,5};
System.out.println("First element: " + ar1[0]); // Output: First element: 1
ar1[1] = 25; // Modifying the second element
System.out.println("Modified second element: " + ar1[1]); // Output: Modified second element: 25
```

**Accessing array elements using a loop:**

```java
int ar1[]={1,2,3,4,5,6,5};
for(int i=0; i<ar1.length; i++){
    System.out.println("Element at index " + i + ": " + ar1[i]);
}
```

## OR

```java
for(int element : ar1){
    System.out.println("Element: " + element);
}
```

## 2D Arrays ~ Arrays of Arrays or Multidimensional Arrays

A 2D array is an array of arrays or collection of arrays. It can be visualized as a table or matrix with rows and columns.

![alt text](/images/2dary.png)

**Creating and initializing a 2D array:**

```java
int matrix[][] = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

## OR

```java
int matrix[][] = new int[3][3]; // Creates a 3x3 2D array
```

**Accessing elements in a 2D array:**

```java
System.out.println("Element at row 1, column 2: " + matrix[1][2]); // Output: Element at row 1, column 2: 6
```

## traversing a 2D array

```java
for(int i=0; i<matrix.length; i++){
    for(int j=0; j<matrix[i].length; j++){
      System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

## using for-each loop

```java
for(int[] row : matrix){
    for(int element : row){
        System.out.print(element + " ");
    }
    System.out.println();
}
```

## Jagged Arrays

A jagged array is an array of arrays where the inner arrays can have different lengths. This allows for more flexibility in storing data.

```java
int jaggedArray[][] = {
    {1, 2, 3},
    {4, 5},
    {6, 7, 8, 9}
};
```

## OR

```java
int jaggedArray[][] = new int[3][];
jaggedArray[0] = new int[3]; // First row with 3 elements
jaggedArray[1] = new int[2]; // Second row with 2 elements
jaggedArray[2] = new int[4]; // Third row with 4 elements
```

**Accessing elements in a jagged array using for loop:**

```java
for(int i=0; i<jaggedArray.length; i++){
    for(int j=0; j<jaggedArray[i].length; j++){
        System.out.print(jaggedArray[i][j] + " ");
    }
}
```

## Sort method in Java

In Java, the `Arrays` class provides a static method called `sort()` that can be used to sort arrays. This method can sort arrays of primitive data types (like `int`, `char`, etc.) as well as arrays of objects (like `String`, `Integer`, etc.).
The `sort()` method sorts the array in ascending order by default. For arrays of objects, it uses the natural ordering of the objects (for example, alphabetical order for strings).

## for accending order

`Arrays.sort(arrayName);`

## for decending order

`Arrays.sort(arrayName, Collections.reverseOrder());`

### Example of sorting an array of integers

```java
import java.util.Arrays;
public class SortExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};
        Arrays.sort(numbers); // Sorts the array in ascending order
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
```

### Example of sorting an array of strings

```java
import java.util.Arrays;
public class SortStringExample {
    public static void main(String[] args) {
        String[] fruits = {"Banana", "Apple", "Orange", "Mango"};
        Arrays.sort(fruits); // Sorts the array in alphabetical order
        System.out.println("Sorted array: " + Arrays.toString(fruits));
    }
}
```

## Sorting

**1.Bubble Sort**

```java
for(int i=0;i<n-1;i++){
    for(int j=0;j<n-1-i;j++){
        if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}
```

**2.Insertion Sort**

```java
for(int i=1;i<n;i++){
    int key = arr[i];
    int j = i - 1;
    while(j >= 0 && arr[j] > key){
        arr[j + 1] = arr[j];
        j--;
    }
    arr[j + 1] = key;
}
```

**3.Selection Sort**

```java
for(int i=0;i<n-1;i++){
    int minIndex = i;
    for(int j=i+1;j<n;j++){
        if(arr[j]<arr[minIndex]){
            minIndex = j;
        }
    }
    int temp = arr[minIndex];
    arr[minIndex] = arr[i];
    arr[i] = temp;
}
```
