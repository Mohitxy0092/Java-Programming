# Topics
1. Singleton Class
2. Wrapper Classes
3. Immutable Classes


## Singleton Class
> The objective of this class is to create only one object.
> For example :
If we want to create a DBConnection, we want it to be singleton.

#### To create a singleton class, a class must implement the following properties:

- Create a `private` constructor of the class to restrict object creation outside of the class.
- Create a `private` attribute of the class type that refers to the single object.
- Create a `public static` method that allows us to create and access the object we created. Inside the method, we will create a condition that restricts us from creating more than one object.

#### Example: A General Java Singleton Class Syntax
```java
package SingletonClasses;

public class SingletonExample {
    private static SingletonExample instance;
    private SingletonExample() {

    }
    public static SingletonExample getInstance(){

    }
}

```
In the above example,

- `private static SingletonExample obj` - a reference to the object of the class.
- `private SingletonExample() ` - a private constructor that restricts creating objects outside of the class.
- `public static SingletonExample getInstance()` - this method returns the reference to the only object of the class.
Since the method `static`, it can be accessed using the class name.


### Different Ways of Creating Singleton Class

- **Lazy Initialization**
- **Eager Initialization**
- **Synchronization Block**
- **Double Check Lock**
- **Bill Pugh Solution**
- **`enum` Singleton**

### 1. Lazy Initialization

**Definition:**

In Lazy Initialization, the Singleton object is **created only when it is first requested**. This saves memory because the object is not created until it is actually needed.

```java
public class LazyExample {
    private static LazyExample instance;
    private LazyExample() {}

    public static LazyExample getInstance() {
        if(instance==null) {
            instance=new LazyExample();
        }
        return instance;
    }
}

```

**Advantage:**

- **Saves memory** because the object is created only when it is needed.
- **Faster startup** because object creation is delayed until the first `getInstance()` call.

**Disadvantage:**
    ![alt text](/images/LazyExample.png)
- **Not thread-safe**
  If multiple threads call `getInstance()` at the same time, they may create multiple objects.
- **Can break the Singleton property in multithreading**
  For example, two threads may both see `instance == null` and both create an object.
- **Needs synchronization for thread safety**
  In a multithreaded application, additional mechanisms such as synchronization or double-checked locking are required.

---

### 2. Eager Initialization

**Definition:**

In Eager Initialization, the Singleton object is **created when the class is loaded**, before it is actually requested.

### Why it is called eager

The object is initialized as soon as the program/class initialization occurs, even if no other class is currently using it.

```java
public class SingletonEagerExample {
    private static final SingletonEagerExample instance=new SingletonEagerExample();

    private SingletonEagerExample() {}

    public static SingletonEagerExample getInstance(){
        return instance;
    }

```

**Advantage:** Simple and inherently thread-safe.

**Disadvantage:** Object is created unnecessarily if it is never used.

---

### 3. Synchronization Block

**Definition:**

A synchronization block is used to make Singleton object creation **thread-safe**. It ensures that only one thread at a time can execute the critical section where the object is created.

- It is used to overcome the problem of Lazy Initialization where two objects might created if two threads tries to get the object for the first time.

So, this synchronized keyword does two things:

- put a lock on the method
- unlock the method.

So, only one thread is allowed to enter the method at a time. Hence the possibility of 2 objects being created will be zero.

```java
public class SingletonSynchronized {
    private static SingletonSynchronized instance;
    private SingletonSynchronized(){};
    public static SingletonSynchronized getInstance() {
        synchronized(SingletonSynchronized.class){
            if(instance==null) {
                instance =new SingletonSynchronized();
            }
        }
        return instance;
    }
}
```

**Disadvantage:** Every call to `getInstance()` enters the synchronized block, which can reduce performance.

---

### 4. Double-Checked Locking

**Definition:**

Double-Checked Locking improves the synchronized version by **checking whether the object exists twice**: once before synchronization and once inside synchronization.

So, here the synchronized is not on method, but on the block. Because of synchronized on the block, the lock unlock once only.

```java
public class DoubleChecked {
    private static volatile DoubleChecked instance;
    private DoubleChecked() {}
    public static DoubleChecked getInstance() {
        if(instance==null) {
            synchronized (DoubleChecked.class){
                if(instance ==null) {
                    instance=new DoubleChecked();
                }
            }
        }
        return instance;
    }
}
```

### Memory diagram

![alt text](/images/MemoryDiagram.png)

Each core has its dedicated L1 Cache which is used to cache the objects. Time to time it syncs with memory.

### Double Checked Locking — Memory Issue

Now let's say Thread T1's computation is happening at core-1 and it enters the method to get object.

Since it'll get null for the first time an object will be created & temporarily stored in cache.

At this point Thread T2 whose computation is happening at Core-2 tries to get the object.

Now we do have the object created but not yet synced with the memory.

Hence a second object will be created because the object is not there in memory.

Therefore two objects are created despite double checked locking.

This is solved using the `volatile` keyword.

`volatile` Keyword means that the object will be created in memory instead of cache.

So, if we've created any object volatile, any read/write operation happening to this always happens in memory.

Since we're using memory synchronized, this is also a bit slow.

### Bill Pugh Singleton Pattern

**Definition:**

The Bill Pugh Singleton Pattern uses a **static inner helper class** to create the Singleton instance. The instance is created only when the inner class is loaded.

```java
public class SingletonBillPugh {
    private SingletonBillPugh() {}
    private static class instanceHelper {
        private static final SingletonBillPugh instance= new SingletonBillPugh();
    }
    public static SingletonBillPugh getInstance(){
        return instanceHelper.instance;
    }
}
```

### How it works

`instanceHelper` is not loaded until `getInstance()` is called. Therefore, the object is created **lazily**.

It is also **thread-safe** because Java class loading is handled safely by the JVM.

### Advantages

1. **Thread-safe** without using `synchronized`.
2. **Lazy initialization** — object is created only when needed.

### Disadvantage

1. The implementation is slightly more complex than basic eager initialization.


## ENUM SINGLETON

As we know, in Enum, all constructors are private & only one object of enum is created per JVM. So by default enum are singleton only.

### Code shown in the notes

```java
enum EnumClass {
    INSTANCE
}
```

## IMMUTABLE CLASSES

**IMMUTABLE CLASS:**

- We can not change the value of an object once it is created.
- Declare class as `final` so that it can not be extended.
- All class members should be private. So that direct access can be avoided.
- And class members are initialized only once using constructor.
- There should not be any setter methods, which is generally use to change the value.
- Just getter methods. And returns copy of the member variable.
- Example: String, Wrapper Classes etc.

### Code

```java 
final class MyImmutableClass {

    private final String name;
    private final List<Object> petNameList;

    MyImmutableClass(String name, List<Object> petNameList) {
        this.name = name;
        this.petNameList = petNameList;
    }

    public String getName() {
        return name;
    }

    public List<Object> getPetNameList() {

        // this is required, because making list final,
        // means you can not point to new list, but still can add,
        // delete values in it
        // so thats why we send the copy of it.

        return new ArrayList<>(petNameList);
    }
}
```

### Immutable Class — List Copy Example

```java 
List<Object> petNames = new ArrayList<>();

petNames.add("sj");
petNames.add("pj");

MyImmutableClass obj =
        new MyImmutableClass("myName", petNames);

obj.getPetNameList().add("Hello");

System.out.println(obj.getPetNameList());
```

Output:

```
[sj, pj]
```

Since we're passing the copy of the list, new items won't be added to it hence making it truly final.