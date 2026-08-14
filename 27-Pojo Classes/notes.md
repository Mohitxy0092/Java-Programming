# POJO Classes

**POJO** stands for **Plain Old Java Object**. It is a simple Java class used mainly to hold data.

Key characteristics:

1. **Simple Java class**
    - Contains **instance variables (fields)**.
    - Provides **getter and setter methods** to access and modify those fields.
2. **Public class**
    - The class should generally be declared as `public`.
3. **Default constructor**
    - Should have a **public no-argument (default) constructor**.
4. **No framework-specific annotations**
    - A POJO should not use persistence/framework annotations such as:
        - `@Entity`
        - `@Table`
        - `@Id`
        and many more..
5. **No inheritance or interface implementation**
    - It should **not extend another class**.
    - It should **not implement an interface**.
6. **Purpose**
    - POJOs are commonly used to **represent and transfer data** without being tightly coupled to a particular framework.

**Example:**
```java
public class Student {

    private int id;
    private String name;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

## **Enum Classes**


