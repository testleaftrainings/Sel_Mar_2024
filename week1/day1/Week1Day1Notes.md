### Agenda:
      > 9:30  to 10:30 -> Core Java Introduction
      > 10:30 to 10:50 -> Breakout
      > 10:50 to 11:00 -> Break
      > 11:00 to 11:45 -> Data types and Variables
      > 11:45 to 12:00 -> Breakout
      > 12:00 to 12:20 -> Operators
      > 12:20 to 1:00  -> Conditional Statements




















### Java Introduction:

1. **What is Java?**
      - Java is a computer programming language. 
      - Java is a versatile and widely-used programming language. 
      - It allows developers to write code that can run on different types of devices, from computers to mobile phones.
      - Java is strong and reliable.
      - Robustness in Java refers to its ability to handle errors and unexpected situations gracefully. 
      - It includes features like strong memory management.
      - Java uses a way of organizing code based on objects.
      - Object-oriented programming is a programming principle that organizes code into objects, which are instances of classes. This approach promotes code reuse, modularity, and easier maintenance.

2. **Why Java?**

     -  Java is known for being flexible.
     -  Java's adaptability means that it can be used in various scenarios. 
     -  Whether you're building a small application or a large-scale system, Java provides the flexibility to adapt to different requirements and environments.
     - Java works on different types of devices.
     - Being ''platform-independent'' means that Java code can run on various devices, such as computers, smartphones, and other gadgets. This is possible because Java programs are compiled into an intermediate form (bytecode), which can be executed on any device with a Java Virtual Machine (JVM).
     - Java is versatile and excels in a wide range of applications.
     - It is commonly used in web development, mobile app development (Android), enterprise systems, scientific applications, and more. 
     - Its broad applicability makes it a popular choice for developers working on diverse projects.

### Java Architecture:
   
1. **JDK (Java Development Kit):**
    - JDK is like a toolkit for Java developers.
    - The JDK includes everything a developer needs to write, compile, and run Java applications.
    - It contains the Java compiler, libraries, and other tools to help create software. 
    - If you want to build Java applications, you need the JDK.

2. **JRE (Java Runtime Environment):**
    - JRE is like a package to run Java programs.
    - The JRE is necessary for running Java applications. 
    - It includes the Java Virtual Machine (JVM) and essential libraries. If you only want to run Java programs and not develop them, you just need the JRE. It allows your computer to execute Java applications.

3. **JVM (Java Virtual Machine):**
   - JVM is like a virtual computer for Java.
   - The JVM is a virtualized environment that runs Java bytecode.
   - When you compile your Java code, it turns into bytecode, a set of instructions for the JVM. 
   - The JVM, in turn, translates these instructions into machine code that your computer understands. 
   - It makes Java programs "write once, run anywhere" by enabling them to run on any device with a compatible JVM.

### IDE:
  1. *Definition:*
      An IDE, or Integrated Development Environment, is like a digital workspace where programmers write, edit, and manage their code. It provides tools such as a code editor, debugger, and compiler, all in one place, making it easier for developers to create and maintain their software.

### Package:
   1. *Definition:*
      In Java, a package is a way to organize and group related classes and interfaces. It helps in avoiding naming conflicts and enhances the overall structure of a program.
   2. *_Naming Convention:*_
      start with lowerCase    

### Class:
   1. *Definition:*
      In Java, a class is a blueprint or template that defines the properties (attributes) and behaviors (methods) that objects created from the class will have.

### Variables:
   1. *Definition:*
     Variables in Java are like containers that store data. They have a type (int, double, String) and a name. Use variables to store and manipulate data.

### Datatypes:
   1. *Definition:*
       Datatypes specify the type of data a variable can hold. 

### Conditional Statements:
   1. Conditional statements  are used to control the flow of the program based on certain conditions. These statements allow the program to make decisions and execute different blocks of code depending on whether a specified condition evaluates to true or false. The primary conditional statements in Java include:

### 1. `if` Statement:

**Definition:**
The `if` statement is used to execute a block of code only if a specified condition is true.

**Syntax:**
```java
if (condition) {
    // Code to be executed if the condition is true
}
```

### 2. `if-else` Statement:

**Definition:**
The `if-else` statement is used to execute one block of code if the condition is true and another block of code if the condition is false.

**Syntax:**
```java
if (condition) {
    // Code to be executed if the condition is true
} else {
    // Code to be executed if the condition is false
}
```

### 3. `if-else if-else` Statement:

**Definition:**
The `if-else if-else` statement allows you to check multiple conditions in sequence. It executes the first block of code whose condition is true.

**Syntax:**
```java
if (condition1) {
    // Code to be executed if condition1 is true
} else if (condition2) {
    // Code to be executed if condition2 is true
} else {
    // Code to be executed if none of the conditions is true
}
```

### Switch-case statement:

1.  The switch-case statement in Java is a conditional statement used to make decisions based on the value of an expression. 
 - The switch statement evaluates the expression and then compares it against various case values. When a match is found, the associated block of code is executed.

**Syntax:**

```java
switch (expression) {
    case value1:
        // Code to be executed if expression equals value1
        break;
    case value2:
        // Code to be executed if expression equals value2
        break;
    // Additional cases as needed
    default:
        // Code to be executed if none of the cases match
}
```
*Key points about the switch-case statement:*
1. *Expression:*
    The expression is evaluated once and its value is then compared with the constant values specified in the case statements.
2. *Case Values:*
    Each case specifies a constant value that the expression is compared against. If there's a match, the code block following that case is executed.
3. *Break Statement:*
    The break statement is used to exit the switch statement after a match is found. Without break, the flow of execution would continue to subsequent case statements.
4. *Default Case:*
    The default case is optional and serves as a fallback if none of the case values match the expression. It is executed when no other matching case is found.

### Differences and Usage of If and Switch case Statements:
1. Number of Conditions:
`if`: Suitable for handling a relatively small number of conditions or conditions that don't share a common expression.
`switch`: Especially useful when there are multiple conditions sharing the same expression.
2. Equality Comparison:
`if`: Allows for complex conditions involving equality, inequality, or other relational operators.
`switch`: Specifically designed for equality-based comparisons. Each case checks if the expression equals a constant value.
3. Complex Conditions:
`if`: Provides flexibility to handle more complex conditions with logical operators (AND, OR).
`switch`: Limited to simple equality conditions; each case checks if the expression equals a specific value.
4. Default Case:
`if`: No default case; you can handle default behavior with an additional else statement.
`switch`: Has a built-in default case, which is executed when none of the case values match the expression.


# How to create a package:
   - Inside the Project you created -> Right click on src/main/java
   -> Click New -> Click Package -> Give a name -> Click Finish
      To view the folder structure in your system 
      Right click -> package -> Show In -> System Explorer
     

# Operators:
     - Arithmetic Operators
           - +(add)
             - (sub)
             *(mul)
             /(div)
             %(mod) 
     - Relational Operators
             ==
             !=
             >
             <
             >=
             <=
     - Logical Operators
     - Assignment Operator
          



  