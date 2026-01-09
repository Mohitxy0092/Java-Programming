# INTRODUCTION

The Java Development Kit (JDK) is a core component of the Java development environment. It’s a cross platform software toolkit that provides everything needed to build, compile, and debug Java applications. The JDK works alongside the Java Virtual Machine (JVM) and the Java Runtime Environment (JRE) to form the complete Java platform.

The Java Runtime Environment (JRE) is an open-access software package that provides the libraries, tools, and a dedicated Java Virtual Machine (JVM) needed to run Java applications. It’s an essential part of the overall Java ecosystem and is included within the Java Development Kit (JDK).

The JRE supplies the runtime environment required for executing Java programs. When Java source code is compiled, it’s converted into bytecode, a platform-independent format. To execute this bytecode on any system, the JRE is required.
The JRE manages several key operations during execution, including loading classes, performing memory access checks, and interacting with system resources. In essence, it serves as a software layer between Java applications and the underlying operating system, enabling Java’s “write once, run anywhere” capability.

The Java Virtual Machine (JVM) is a fundamental part of the Java Runtime Environment (JRE) and plays a key role in enabling Java’s platform independence. It acts as an execution engine that interprets or compiles Java bytecode into instructions the underlying hardware can understand. This is what gives Java its well-known Write Once, Run Anywhere (WORA) capability.

## Workflow of Java File Execution

**1.Writing the Java Program.**

You begin by creating a Java source file, for example `first.java`, which contains your Java code.

**2.Compilation using `javac`**

The source file is then compiled using javac, the Java compiler included in the JDK.
The compiler checks the code for errors.if everything is correct, it translates the source code into bytecode.

**3.Generation of Bytecode (`first.class`)**

After successful compilation, the compiler produces a `.class` file (e.g., `first.class`).
This file contains platform-independent bytecode, not machine code.

**4.Execution using `java First` command**

To run the program, you use the `java` command (from the JRE).
The java launcher loads the bytecode into the Java Virtual Machine (JVM).The JVM then verifies, interprets, or JIT-compiles the bytecode and executes it.The JRE provides the required runtime environment, while the JVM handles the actual execution.

**5.Runtime support by the JRE & JVM**

**a**.The JRE supplies the runtime environment required for executing the bytecode.
**b**.The JVM performs the actual execution, memory management, and garbage collection.

**Flow -> `first.java --> javac --> first.class --> java first`**

**compilation steps**

`javac fileName.java`

`fileName.class`

`java fileName`

# Skeleton of Java Program

**file name : first.java**

```java
import java.lang.*;
// Imports the java.lang package (loaded by default).
// The .* means all classes inside the package are accessible.

class first {   // Class name should match the file name (First.java)
    public static void main(String args[]) {
        /*  'static' allows the JVM to call first.main() without creating an object.
        'public' makes main() accessible to the JVM.
        'String args[] or String[] args' stores command-line arguments.
        'String' is a class and 'args[]' is method.
        */

        System.out.println("Hello World");  // Prints output to the console.
        /* 'System' is a class in Java
            'out is a object'
            println is a method which print the output to the console with newline
        */

        System.out.println(args[0]);
	    // give command line argument while running the program, compiler the code then java first arg1
	    // ex:javac 'first.java' after that 'java first hello' , java first 12, etc.
    }
}
```

# Key Points to Remember

- Java is platform-independent due to its use of bytecode and the JVM.
- The JDK is essential for Java development, while the JRE is necessary for running Java applications.
- The JVM is responsible for executing Java bytecode and managing system resources.
- Java programs go through a compilation and execution process involving the JDK, JRE, and JVM.
- The main method serves as the entry point for Java applications.
- Java follows an object-oriented programming paradigm, promoting code reusability and modularity.
- Java has a rich standard library that provides a wide range of functionalities for developers.
- Java supports multithreading, allowing concurrent execution of multiple threads within a program.
- Java has automatic memory management through garbage collection, reducing the risk of memory leaks.
- Java has a strong community and extensive documentation, making it easier for developers to find support and resources.
- Java is widely used in various domains, including web development, mobile app development, enterprise applications, and more.
- Java has a robust security model, making it suitable for building secure applications.

# NOTE

- Always ensure that the class name matches the file name in Java. whenever you create a public class, the file name must be the same as the class name.
- If you only write class without public access modifier, then the file name can be different from the class name.
- ex: assume file name is first.java and I have written class second inside it, without public keyword, then it is valid.

**file name : first.java**

```java
import java.lang.*;
class second{
	public static void main(String args[]){
	System.out.println("Hello World");
}
}
//second.class file is generated after compilation
```

- If you try to run a Java program without compiling it first, you will encounter an error because the Java Virtual Machine (JVM) requires bytecode to execute, which is generated during the compilation process.
- Java is case-sensitive, so be careful with the capitalization of keywords, class names, and method names.

# Reading from keyboard

- The `Scanner` class is used for user input and is part of `java.util`. It provides methods to read different types like int, string, double, and boolean. It is commonly used in console based applications.

| Method          | Description                                                                                |
| --------------- | ------------------------------------------------------------------------------------------ |
| nextBoolean()   | Reads the next token and parses it as a boolean (true/false).                              |
| nextByte()      | Reads the next token and parses it as a byte.                                              |
| nextDouble()    | Reads the next token and parses it as a double.                                            |
| nextFloat()     | Reads the next token and parses it as a float.                                             |
| nextInt()       | Reads the next token and parses it as an int.                                              |
| nextLine()      | Reads and returns the remainder of the current line (including spaces) as a String.        |
| next()          | Reads and returns the next token (delimited by whitespace) as a String.                    |
| nextLong()      | Reads the next token and parses it as a long.                                              |
| nextShort()     | Reads the next token and parses it as a short.                                             |
| hasNextInt()    | Returns true if the next token can be interpreted as an int (does not consume the token).  |
| hasNextFloat()  | Returns true if the next token can be interpreted as a float (does not consume the token). |
| useRadix(radix) | It tells the Scanner to read numbers in a different number system (radix).                 |

```java
import java.util.Scanner;
    OR
import java.util.*;
```

**`Scanner` is a class in `java.util` package. Scanner class has various methods in order to get input.new `Scanner(System.in)`.This creates an object of Scanner class which can be used later. System.in means to get input from user.**

```java
import java.lang.*;
import java.util.Scanner;
class first{
	public static void main(String args[]){
		int a,b,c;
		System.out.println("Enter values:");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		int sum=a+b+c;
		System.out.println("Sum is : "+sum);
		System.out.printf("Sum is %d",sum);
		s.nextLine();
		System.out.println("Enter your name");
		String name=s.nextLine();
		System.out.println(name);
}
}
```

- In the above example, we import the `Scanner` class from the `java.util` package. We create a `Scanner` object `s` to read input from the user. We then use various methods of the `Scanner` class to read integers and strings from the console.

# How is Java platform independent?

Java achieves platform independence through the use of bytecode and the Java Virtual Machine (JVM). When a Java program is compiled, it is transformed into an intermediate form called bytecode, which is not specific to any particular hardware or operating system. This bytecode can be executed on any platform that has a compatible JVM installed. The JVM acts as an intermediary between the bytecode and the underlying system, translating the bytecode into machine code that can be understood by the specific hardware. This allows Java programs to run on different platforms without modification, as long as a suitable JVM is available for that platform. This "write once, run anywhere" capability is a key feature of Java's platform independence.although Java is platform independent, the JDK (Java Development Kit) and JVM itself is platform dependent. This means that you need to download and install the appropriate version of the JDK for your specific operating system (e.g., Windows, macOS, Linux) in order to develop and run Java applications on that platform. Each version of the JDK is tailored to work with the underlying system architecture and provides the necessary tools and libraries for Java development on that particular platform.

# What is the difference between JDK, JRE and JVM?

| Feature             | JDK (Java Development Kit)                                                | JRE (Java Runtime Environment)                                         | JVM (Java Virtual Machine)                                             |
| ------------------- | ------------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| Purpose             | Tools for Java development: compiler, debugger, build tools, docs, etc.   | Runtime environment that provides libraries and the JVM to run apps.   | Executes Java bytecode, performs verification, JIT compilation and GC. |
| Components          | Includes a JRE plus development tools (javac, jar, javadoc, debugger).    | Includes the JVM + core class libraries and runtime files.             | Execution engine (class loader, bytecode verifier, JIT, GC)            |
| Usage               | Used by developers to write, compile and package Java applications.       | Used to run Java applications (end users or production).               | Part of the runtime that actually runs the bytecode.                   |
| Platform dependency | JDK distributions are platform-specific (binaries for each OS).           | JRE distributions are platform-specific.                               | JVM implementations are platform-specific, but bytecode is portable.   |
| Output              | Produces compiled bytecode (.class, .jar) after compilation.              | Does not compile; provides runtime to execute bytecode.                | Executes bytecode; does not produce compilation artifacts.             |
| Example command     | `javac MyProgram.java`                                                    | `java MyProgram` (uses the JRE/JVM to run)                             | N/A (invoked by the java launcher / JRE)                               |
| Target audience     | Java developers                                                           | End users / servers running Java applications                          | Runtime implementers and the running application                       |
| License             | OpenJDK is open-source; some vendor JDK builds may have commercial terms. | Open-source runtimes exist; some vendor runtime builds may have terms. | JVM implementations follow vendor licensing policies                   |
| Development tools   | Yes (compiler, debugger, profilers, etc.)                                 | No                                                                     | No                                                                     |
| Execution           | Includes a runtime so can run apps (primary role is development).         | Yes (provides runtime environment).                                    | Yes (executes bytecode)                                                |
| Memory management   | Not directly — runtime duties handled by the JVM included in JRE.         | Yes — via the JVM it ships with.                                       | Yes — garbage collection and memory management                         |
| Security features   | Includes development-time security tooling; ships security libraries.     | Runtime security features (class loading, permissions, etc.).          | Bytecode verification and runtime enforcement mechanisms               |
| Relationship        | JDK contains a JRE; JRE contains a JVM.                                   | JRE bundles a JVM and core libraries.                                  | JVM is a component inside the JRE.                                     |

# what is JIT ?
- The JIT (Just-In-Time) compiler is part of the JVM that improves Java performance   by converting frequently used bytecode into native machine code during runtime. Instead of interpreting the same bytecode repeatedly which is slow the JIT compiles hot methods once and then executes the native code directly.
- It performs optimizations like register allocation, removing common sub-expressions, and reducing memory access. However, JIT compilation itself uses CPU and memory, so JVM compiles only methods that are executed often to balance startup time and runtime speed.