# Operators and Expressions

**What is an Operator ?**

An operator is a special symbol that tells the compiler or interpreter to perform specific mathematical, relational, or logical operations and produce a final result.
**more simplely**:

operators are special symbols that perform operations on variables or values.

**Types of Operators:**

1. **Arithmetic Operators:** Used to perform basic mathematical operations.

   - Addition (`+`)
   - Subtraction (`-`)
   - Multiplication (`*`)
   - Division (`/`)
   - Modulus (`%`)
   - Increment (`++`)
   - Decrement (`--`)

2. **Relational Operators:** Used to compare values.

   - Equal to (`==`)
   - Not equal to (`!=`)
   - Greater than (`>`)
   - Less than (`<`)
   - Greater than or equal to (`>=`)

3. **Logical Operators:** Used to combine multiple boolean expressions.

   - Logical AND (`&&`)
   - Logical OR (`||`)
   - Logical NOT (`!`)

4. **Assignment Operators:** Used to assign values to variables.

   - Assignment (`=`)
   - Add and assign (`+=`)
   - Subtract and assign (`-=`)
   - Multiply and assign (`*=`)
   - Divide and assign (`/=`)
   - Modulus and assign (`%=`)

5. **Bitwise Operators:** Used to perform operations on individual bits.

   - AND (`&`)
   - OR (`|`)
   - XOR (`^`)
   - NOT (`~`)
   - Left shift (`<<`)
   - Right shift (`>>`)
   - Unsigned right shift (`>>>`)

6. **Ternary Operator:** A shorthand for an
   `if-else` statement.
   - Syntax: `condition ? expression1 : expression2`
   - Example: `int result = (a > b) ? a : b;` (assigns the greater of `a` or `b` to `result`)
   - Used for concise conditional assignments.
   - Evaluates the condition; if true, returns `expression1`, otherwise returns `expression2`.

### Operator Precedence and Associativity

Operator precedence determines which operators are evaluated first in an expression; operators with higher precedence are evaluated before those with lower precedence. Associativity determines the evaluation order for operators with the same precedence.

Most binary operators in Java are left-to-right associative. Assignment operators (for example =, +=, -=) and the ternary operator ?: are right-to-left associative.

Examples

1. In `a + b * c` the multiplication is evaluated first: `b * c`, then `a + (result)`.
2. In `a - b + c` evaluation is left-to-right: `(a - b) + c`.
3. Parentheses override precedence: `(a + b) * c` forces addition before multiplication.

### Key Points to Remember

- Understand operator precedence to predict expression evaluation.
- Use parentheses to make intent explicit.
**NOTE: Go through the Java Language Specification for the complete precedence table.**