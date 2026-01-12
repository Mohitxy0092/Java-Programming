# Java Documentation and Annotations

In this section, we will explore how to document your Java code effectively using JavaDocs and how to use annotations to provide metadata for your classes, methods, and fields.

## JavaDocs

JavaDocs are a way to generate HTML documentation from comments in your Java source code. They provide a standard format for documenting classes, methods, and fields, making it easier for other developers (and yourself) to understand how to use your code.

**The Javadoc comments structure looks very similar to a regular multi-line comment**, but the key difference is the extra asterisk at the beginning:

```java
// This is a single line comment

/*
 * This is a regular multi-line comment
 */

/**
 * This is a Javadoc
 */
```

**Javadoc style comments may contain HTML tags as well.**

The Javadoc tool helps prepare documentation for classes. Java provides specific tags for documentation, known as Javadoc tags.

**Tags for classes or packages:**

- `@author`: Adds the author's name to the class.
- `@version`: Adds a version subheading with specified version text to the generated docs.
- `@since`: Indicates when the version was written or how long it may be valid.
- `@see`: Adds a "see also" heading with a link to references.

**Tags for methods:**

- `@param`: Describes the parameters accepted by the method.
- `@return`: Describes the value returned by the method.
- `@throws`/`@exception`: Describes the exception thrown by the method.
- `@deprecated`: Indicates whether the method is deprecated and should no longer be used.
- `@code`: Displays text in code font without interpreting it as HTML markup or nested Javadoc tags.

**Other available tags:**

- `@link`: Provides a link to a specific resource.
- `@value`: Provides the value for a static variable or member.
- `@serial`: Specifies the serial ID for serialization.

### Basic JavaDoc Syntax

To create a JavaDoc comment, you use the `/** ... */` syntax. Here’s an example of a JavaDoc comment for a simple class:

```java/**
 * This class represents a simple calculator.
  * It provides basic arithmetic operations.
  */
public class Calculator {
    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
}
```

### Generating JavaDocs

To generate JavaDocs, you can use the `javadoc` tool that comes with the JDK. You can run it from the command line like this:

```bash
javadoc -d doc Calculator.java
```

This command will generate HTML documentation in the `doc` directory based on the comments in `Calculator.java`.Then , you can open the generated HTML files in a web browser to view the documentation.

## Here are some commonly using JavaDoc Tags:

- `@author`: Specifies the author of the class or method.
- `@since`: Indicates the version when a feature was added.
- `@version`: Specifies the version of the class or method.
- `@param`: Describes a parameter for a method.
- `@return`: Describes the return value of a method.
- `@throws` or `@exception`: Describes the exceptions that a method can throw.
- `@see`: Provides a reference to another class or method.

## Built-in Annotations

Annotations are used to define attributes for a class, interface, or method. They provide metadata that gives additional information to the compiler or runtime environment.

Built-in annotations fall into two categories:

**Applied to Code:**
These annotations are applied directly to code and provide hints to the compiler to avoid showing errors and warnings.

Common code annotations include:

• **@Override:** Informs the compiler that the element is meant to override an element declared in a superclass.

• **@Deprecated:** Indicates that the marked element is deprecated and should no longer be used.

• **@FunctionalInterface:** Indicates that the type declaration is intended to be a functional interface.

• **@SuppressWarnings:** Tells the compiler to suppress specific warnings that it would otherwise generate.

• **@SafeVarargs:** When applied to a method or constructor, asserts that the code does not perform potentially unsafe operations on its varargs parameter.

**Applied to Other Annotations:**
These annotations are applied to user-defined annotations to control their behavior.

Meta-annotations include:

• **@Retention:** Specifies how the marked annotations are stored.

• **@Documented:** Indicates that elements using this annotation should be documented using the Javadoc tool.

• **@Target:** Restricts what kind of Java elements the annotation can be applied to.

• **@Inherited:** Indicates that the annotation type can be inherited from a superclass.

• **@Repeatable:** Indicates that the annotation can be applied more than once to the same declaration or type.

**Metadata:**
Metadata is "data that provides information about other data" in other words, "data about data."

For Example:

```java
class Book {
    String title;
    String author;

    @Deprecated
    void oldMethod() {
        // This method is deprecated
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
```

## User-defined Annotations

You can also create your own custom annotations in Java. Here’s an example of how to define and use a user-defined annotation:

The user defined annotation is created using the `@interface` keyword:

it is inherited from the `java.lang.annotation.Annotation` interface.

