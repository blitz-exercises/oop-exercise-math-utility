# OOP Exercise: Math Utility - Method Overloading

## Story

Teachers at Blitz keep writing tiny calculators for their lessons, but the functions never line up: 
sometimes they add two numbers, sometimes many, and sometimes they need decimals. 
They want one consistent utility with a single method name that "just works" for common cases, 
choosing the right version automatically. Your job is to provide a Calculator that overloads a method 
so different inputs call the right implementation.

## Requirements

Build a `Calculator` class with overloaded `add` methods:

1. `add(int a, int b)` → returns `int`
2. `add(double a, double b)` → returns `double`
3. `add(int... nums)` (varargs) → returns `int`

The varargs version must validate that at least one number is provided; otherwise throw `IllegalArgumentException`.

A small `Demo` program shows each overload in action and prints results.

## Implementation Tasks

### Calculator.java

- Implement `add(int a, int b)` to return the sum of two integers
- Implement `add(double a, double b)` to return the sum of two doubles
- Implement `add(int... nums)` to return the sum of all provided integers
- For `add(int... nums)`, validate that at least one argument is provided; if none, throw `IllegalArgumentException`
- Do not introduce public mutable state (no public fields)

### Demo.java

- Create a `Calculator` instance
- Call `add(int, int)` with sample values and print the result
- Call `add(double, double)` with sample values and print the result
- Call `add(int...)` with multiple sample values and print the result
- Optionally, demonstrate that calling `add()` with no varargs should fail (commented-out example)

## Learning Objectives

- Understand method overloading (compile-time polymorphism)
- Learn how Java selects the appropriate overloaded method based on arguments
- Practice implementing varargs methods
- Learn to validate input parameters
- Understand the difference between method overloading and method overriding

## Building and Running

### Prerequisites

- Java 21 or higher
- Maven 3.6 or higher

### Build the Project

```bash
mvn clean compile
```

### Running the Application

You can run the application in two ways:

**Option 1: Using IntelliJ IDEA** (Recommended for beginners)

1. Open the project in IntelliJ IDEA
2. Navigate to the `Demo.java` file (`src/main/java/nl/blitz/oop/math/Demo.java`)
3. Right-click on the file or the `main` method
4. Select "Run 'Demo.main()'" from the context menu
5. Alternatively, click the green play button (▶) next to the `main` method

**Option 2: Using Maven Command Line**

```bash
mvn exec:java -Dexec.mainClass="nl.blitz.oop.math.Demo"
```

## Project Structure

```
.
├── pom.xml
├── README.md
├── .gitignore
├── .coderabbit.yaml
└── src/
    └── main/
        └── java/
            └── nl/
                └── blitz/
                    └── oop/
                        └── math/
                            ├── Calculator.java
                            └── Demo.java
```

## Notes

- This is a learning exercise - implement the TODO sections in the source files
- Method overloading allows multiple methods with the same name but different signatures
- Java selects the appropriate method based on the number and types of arguments
- Varargs allow a method to accept zero or more arguments of a specified type
- Always validate input when required (e.g., varargs must have at least one argument)

