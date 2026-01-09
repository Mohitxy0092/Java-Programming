# Operators and Expressions

**What is an Operator?**

An operator is a special symbol that tells the compiler or interpreter to perform a specific mathematical, relational, or logical operation and produce a result.

**More simply:** operators are special symbols that perform operations on variables or values.

## Operator and Operands

An operator is a symbol that represents an operation (e.g., `+`, `*`). Operands are the values or variables on which the operator acts.  
Example: in `5 + 3`, `+` is the operator and `5` and `3` are operands.

---

## Types of Operators

### 1. Arithmetic Operators

**Used to perform basic mathematical operations.**

#### Addition (`+`)

- Returns the sum of two numbers.

  - example:

      ```java
      int sum = a + b;
      ```

#### Subtraction (`-`)

- Returns the difference between two numbers.

  - example:

      ```java
      int difference = a - b;
      ```

#### Multiplication (`*`)

- Returns the product of two numbers.

  - example:

      ```java
      int product = a * b;
      ```

#### Division (`/`)

- Returns the quotient.

  - example:

      ```java
      int quotient = a / b;
      ```

#### Modulus (`%`)
  
- Returns the remainder of division.

  - When dividing positive numbers:

      ```java
      If a < b, then a % b = a
      If a == b, then a % b = 0
      If a > b, then a % b is the remainder
      ```

  - Sign Rule :

    - The result of % has the same sign as the left operand.
    - Examples:

      ```java
      -7 % 3  → -1
      7 % -3  → 1
      -7 % -3 → -1
      ```

- example:

```java
   int a=9;
   int b=4;
   int x=3;
   int y=10;
   int op1= -7;
   int op2= 4;
   System.out.println(x%y); //3
   System.out.println(a % b); // remainder is 1
   System.out.println(op1 % op2); // remainder is -3
```

Example showing evaluation order:

```java
int a = 10, b = 3, c = 2;
int result = a + b * c; // b * c evaluated first -> 10 + 6 = 16
```

---

### 2. Unary Operators

   **Operate on a single operand to produce a new value.**

#### Increment (`++`): Increases an integer value by one

   **post increment:** current value used, then incremented.

- example:

   ```java
   int a = 5;
   int b = a++;
   System.out.println("b: " + b + ", a: " + a); // b:5 and a:6
   ```

**pre increment:** value incremented first, then used.

- example:

   ```java
   int a = 5;
   int b = ++a;
   System.out.println("b: " + b + ", a: " + a); // b:6 and a:6
   ```

#### Decrement (`--`): Decreases an integer value by one

**pre decrement:** value decremented first, then used.

- example:

   ```java
   int a = 5;
   int b = --a;
   System.out.println("b: " + b + ", a: " + a); // b:4 and a:4
   ```

**post decrement:** current value used, then decremented.

- example:

   ```java
   int a = 5;
   int b = a--;
   System.out.println("b: " + b + ", a: " + a); // b:5 and a:4
   ```

```java
   All these increment and decrement operators can be used with:
   - Integer
   - float 
   - double 
   - char
   - byte
   datatypes,but not with boolean.
   ```

**logical NOT operator can be used with boolean.**

#### Logical NOT (`!`): Inverts a boolean value

- example:

   ```java
   boolean flag = true;
   boolean result = !flag; // result is false
   ```

---

### 3. Relational Operators

**Used to compare values. Return boolean.**

#### Equal to (`==`)

Returns true if operands are equal.

- example:

   ```java
   boolean eq = (a == b);
   ```

#### Not equal to (`!=`)

Returns true if operands are not equal.

- example:

   ```java
   boolean ne = (a != b);
   ```

#### Greater than (`>`)

- example:

   ```java
   boolean gt = (a > b);
   ```

#### Less than (`<`)

- example:

   ```java
   boolean lt = (a < b);
   ```

#### Greater than or equal to (`>=`)

- example:

   ```java
   boolean ge = (a >= b);
   ```

#### Less than or equal to (`<=`)

- example:

   ```java
   boolean le = (a <= b);
   ```

Example:

   ```java
   int a = 5, b = 3;
   System.out.println(a > b); // true
   ```

---

### 4. Logical Operators

#### Logical AND (`&&`)

True if both operands are true.

- example:

   ```java
   boolean both = (a > b) && (c > d);
   ```

#### Logical OR (`||`)

True if at least one operand is true. Second operand skipped if first is true.

- example:

   ```java
   boolean either = (a > b) || (c > d);
   ```

#### Logical NOT (`!`)

Inverts the boolean value.

- example:

   ```java
      boolean a = true;
      boolean notA = !a;
      System.out.println(notA);
   ```

---

### 5. Assignment Operators

**Assign values to variables. Compound forms update and assign.**

#### Assignment (`=`)

- example:

   ```java
   int x = 10;
   ```

#### Add and assign (`+=`)

Equivalent to `x = x + y`.

- example:

   ```java
   x += 5;
   ```

#### Subtract and assign (`-=`)

- example:

   ```java
   x -= 2;
   ```

#### Multiply and assign (`*=`)

- example:

   ```java
   x *= 3;
   ```

#### Divide and assign (`/=`)

- example:

   ```java
   x /= 2;
   ```

#### Modulus and assign (`%=`)

- example:

   ```java
   x %= 4;
   ```

---

### 6. Bitwise Operators

**Operattion performs on bits.**

![alt text](/images/bitwise.png)

![alt text](/images/bitwise1.png)

#### Bitwise AND (`&`)

- example:

   ```java
   int a = 5;  // 0101
   int b = 3;  // 0011
   int r = a & b;
   Sysem.out.println(r); // Output: 1 (0001)
   ```

#### Bitwise OR (`|`)

- example:

   ```java
   int a = 5;  // 0101
   int b = 3;  // 0011
   int r = a | b;
   Sysem.out.println(r); // Output: 7 (0111)
   ```

#### Bitwise XOR (`^`)

- example:

   ```java
   int a = 5;  // 0101
   int b = 3;  // 0011
   int r = a ^ b;
   System.out.println(r); // Output: 6 (0110)
   ```

#### Bitwise NOT (`~`)

- example:

   ```java
   int a=5; // 0101
   int r = ~a;
   System.out.println(r); // Output: -6 (inverts bits)
   ```

#### Left shift (`<<`)

Shifts bits left; fills with zeros on the right.
**NOTE: Each left shift give results as `n*2^number of shifts`**

   ex: `5<<2 = (5*2^2) = 20`

- example:

   ```java
   int a = 5;  // 0101
   int r = a << 2; // shifts bits left by 2 positions
   System.out.println(r); // Output: 20 (10100)
   ```

#### Right shift (`>>`)

Shifts bits right; fills with zeros on the left.

- example:

   ```java
   int a= 5; // 0101
   int r = a >> 1; // 0010
   System.out.println(r); // Output: 2 (0010)
   ```

#### Unsigned right shift (`>>>`)

Shift bits right; fills with zeros on the left regardless of sign.

- example:

   ```java
   int a=5; // 0101
   int r = a >>> 1; // 0010
   System.out.println(r); // Output: 2 (0010)
   ```

Bitwise example:

   ```java
   int a = 5;  // 0101
   int b = 3;  // 0011
   int and = a & b; // 0001 -> 1
   ```

---

### 7. Ternary Operator

**Shorthand for an if-else expression.**

#### Syntax

`condition ? expression1 : expression2`

- example:

   ```java
   int result = (a > b) ? a : b; // assigns the greater of a or b
   ```

---

## Operator Precedence and Associativity

Operator precedence determines evaluation order; higher-precedence operators are evaluated first. Associativity resolves evaluation for operators with the same precedence (most binary operators are left-to-right; assignment and ternary are right-to-left).

Common examples:

- `*`, `/`, `%` evaluated before `+`, `-`
- `+`, `-` evaluated left-to-right
- `==`, `!=` evaluated after arithmetic
- `&&` evaluated before `||`
- Parentheses `()` have the highest precedence.

Examples:

   ```java
   int x = 2 + 3 * 4;   // 2 + (3*4) = 14
   int y = (2 + 3) * 4; // (2+3) * 4 = 20
   ```

---

## Key Points to Remember

- Know precedence to predict results.
- Use parentheses to make intent explicit.
- Prefer short, clear expressions over dense hacks.

**NOTE:** See the Java Language Specification for the complete precedence table. 
