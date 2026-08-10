# Java Memory Management

---

## 1. What is memory?

>Memory is a place where a computer temporarily stores information that a program needs while it is running.

>A running program needs memory to store its instructions, variables, objects, method information, and temporary data.

Think of your computer as having:

 - CPU : does the actual processing/calculation.

 - Memory (RAM) : keeps the data and instructions that the CPU currently needs.

 - Storage (SSD/HDD) : keeps files and programs for the long term.

>**When we say a Java program "needs memory," we are referring primarily to runtime storage used by the JVM to execute a Java application.**

>**At the operating system level, a Java process receives a virtual address space. The JVM then manages different portions of that process's memory for different purposes.**

---

## 2. Why does a program need memory?

let say we write a code : 
```java
int age = 25;
```
>now a cpu does not execute a Java file directly, 
The source code is compiled into bytecode.

>source code ⟼ byteCode ⟼ JVM ⟼ execution

>During execution, the JVM needs runtime state, it needs somewhere to maintain the value associated with `age` for the current method invocation.
Therefore, memory is fundamentally required because execution is stateful. The JVM must maintain the state necessary to continue executing instructions.

---

## 3. What does memory management mean?

> **Java Memory Management is the process by which the JVM manages runtime memory allocation, organization, access, lifetime, and reclamation for application objects, execution frames, class metadata, and JVM runtime structures.**

There are several distinct operations involved.

### Allocation

The JVM needs to obtain memory for something.

Example:

```
 Student s= new Student();
```

An object needs storage.

### Access

The executing code needs to read or modify that memory.

```
    s.setAge(25);
```

### Lifetime management

The JVM needs to determine how long a particular piece of runtime state needs to exist.

A method's stack frame generally exists only while that method invocation is active.

An object may survive much longer.

### Reclamation

When heap objects are no longer reachable, the Garbage Collector can reclaim their memory.

So:
```
Memory Management
│
├── Allocation
├── Access
├── Lifetime
├── Organization
└── Reclamation
```
---

# 4. Why can't everything simply be stored in one memory area?

>This is where the architecture becomes important.
Different types of runtime information have different **lifetimes, access patterns, ownership models, and management requirements**.

Consider these two things:

```java
void calculate() {
	int x=10;
}
```
and:
```java
Student s=new Student();
```
The lifetime of `x` is associated with a particular method invocation.

The lifetime of the `Student` object is not necessarily tied to that invocation.

For example:

```java
Student createStudent() {
    Student s = new Student();
    return s;
}
```

>After `createStudent()` returns, the local variable `s` disappears from that method's execution frame, but the `Student` object can continue to exist because the caller may hold its reference.
Therefore, the JVM needs different runtime mechanisms for different kinds of state.
This is why JVM runtime memory is divided into different **runtime data areas**.

---

## 5. JVM Architecture

>Please Refer to 03-Features_Architecture Directory to Study JVM Architecture

![alt image](/images/JVM_achi.png)


>### The JVM Run-Time Data Areas

![alt image](/images/jvmRuntime.png)


## **1. Shared Data Areas**

>Shared Data Areas are JVM runtime memory areas that are shared by all threads running within the same JVM. Multiple threads can access these areas simultaneously.
### **1.1. Heap**

>The Java Virtual Machine Heap is a runtime data area shared among JVM threads from which memory for class instances and arrays is allocated. The heap is managed by an automatic storage management system, typically a garbage collector, which reclaims memory associated with objects that are no longer reachable.

### 1.2. Method Area

>**The Method Area is a shared runtime data area of the JVM that stores the per-class and per-interface information required during program execution.** It is created when the JVM starts and logically exists for the lifetime of the JVM. When a class is loaded, the **Class Loader** loads its bytecode into the JVM, which then creates a runtime representation of the class. This representation contains information about the class structure, including its fields, methods, constructors, superclass, implemented interfaces, and other class-level metadata. The Method Area is shared among all JVM threads because the class information loaded by the JVM can be accessed by multiple threads simultaneously. The Method Area is a **logical concept defined by the JVM Specification**, so the specification does not require it to be implemented as a particular physical memory region. A JVM implementation may organize this memory differently; for example, in the HotSpot JVM, class metadata is primarily stored in **Metaspace**, which uses native memory. The JVM Specification also does not define a fixed size or a specific memory-management algorithm for the Method Area. If the JVM cannot allocate sufficient memory for the required class metadata, it may throw an `OutOfMemoryError`, such as `OutOfMemoryError: Metaspace` in HotSpot.

### 1.3. Run-Time Constant Pool

>**The Run-Time Constant Pool is a per-class or per-interface runtime structure associated with the Method Area that contains constants and symbolic references required by the JVM during execution.** When the JVM loads a class or interface, it creates a runtime representation that includes a Run-Time Constant Pool derived from the constant-pool information present in the class file. The constant pool contains different types of information, including references to classes, fields, methods, interfaces, strings, numeric constants, and name-and-type information. These references are initially represented symbolically rather than as direct runtime memory addresses. For example, a method reference can symbolically identify the class, method name, and method descriptor that the JVM must resolve when the method is accessed or invoked. The JVM uses these symbolic references during **linking, resolution, field access, and method invocation** to connect the bytecode with the appropriate runtime classes, fields, and methods. The Run-Time Constant Pool is therefore an important part of the JVM's mechanism for converting symbolic information contained in class files into usable runtime references. If the JVM requires more memory to create or maintain the runtime constant pool than is available, it may throw an `OutOfMemoryError`.

## **2. Per-thread Data Areas**

>**Per-Thread Data Areas are JVM runtime data areas created separately for each thread.** Each JVM thread has its own independent execution state, so these areas are not shared with other threads. The main per-thread data areas are the **PC Register, JVM Stack, and Native Method Stack**. Their lifetime is associated with the lifetime of the thread.

### 2.1. PC Register

>**Each JVM thread has its own Program Counter (PC) Register, which keeps track of the instruction currently being executed by that thread.** For a non-native method, it contains the address or position of the current JVM instruction; for a native method, its value is undefined. The PC Register is created when the thread starts and destroyed when the thread terminates.

### 2.2. JVM Stack

>**Each JVM thread has its own private JVM Stack, which stores the execution state of method invocations.** Every method call creates a **stack frame** containing information such as local variables, the operand stack, and other method-execution data. When the method returns, its frame is removed from the stack. The JVM Stack allows the JVM to track method execution and generate stack traces. If the stack cannot grow further, the JVM may throw `StackOverflowError`; if a dynamic stack expansion fails due to insufficient memory, it may throw `OutOfMemoryError`.

### 2.3. Native Method Stack

>**The Native Method Stack is a per-thread memory area used to support the execution of native methods written in languages such as C or C++.** It is similar to the JVM Stack but is specifically associated with native method execution rather than Java bytecode execution. Its size and implementation are JVM-dependent. A stack allocation failure may result in `StackOverflowError`, while failure to expand the stack may result in `OutOfMemoryError`. A JVM that does not support native method invocation does not need to provide a Native Method Stack.


## 6. Type of Memories
There are 2 types of memory which Java creates. JVM manages these both:

1. Stack
2. Heap

### Stack Memory

- Stack stores temporary variables & separate memory block for methods.
- Stores primitive data types.
- Stores reference of heap objects:
    - Strong reference
    - Weak reference
    - Soft reference
- Each thread has its own stack memory.
- Variables within a scope are only visible, and as soon as any variable goes out of the scope, it gets deleted from the stack (in LIFO order).
- When stack memory goes full, it throws `"java.lang.StackOverflowError"`.

### Heap Memory

- Stores objects & there is no order of allocating the memory.
- Garbage Collector is used to delete unreferenced objects from the heap.
- Mark & Sweep Algorithm.
- Types of Garbage Collector:
    - Single GC
    - Parallel GC
    - GC / CMS (Concurrent Mark & Sweep)
- Heap memory is shared with all the threads.

### Lets understand with an example:-

So, we have a simple class with various types of data stored.

>**Now let's create memory for it.**
![alt text](/images/memoryManagementEx.png)

>**Now as soon as we encounter the closing bracket of memoryManagementTest method, its scope ends. It will delete its scope, so all of the allocated portion of stack gets deleted (in LIFO order).**
![alt text](/images/memoryManagementEx1.png)

>**Now control comes back to main() method. Since nothing is there after calling memoryManagementTest API, we encounter the closing bracket which means the scope of main ends; its portion in stack begins to be deleted in LIFO order.**
![alt text](/images/memoryManagementEx2.png)

>**So now the stack is cleared & all the references are deleted from the stack as well. Now the memory looks like this.**
![alt text](/images/memoryManagementEx3.png)


>**Now the stack is cleared. All the references are deleted but the objects are in the heap.So that's where garbage collector's work comes.Garbage Collector will delete all the unreferenced objects from the heap.**

![alt text](/images/memoryManagementEx4.png)

>Garbage Collector runs periodically & JVM controls when to run the garbage collector. We can also tell the JVM to run the garbage collector using `System.gc()` but this doesn't guarantee that GC will run; that is why all of this is called automatic memory management.

>The frequency of GC running is directly proportional to how much of the heap memory is currently full.

