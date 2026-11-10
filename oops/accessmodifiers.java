package oops;
/* private default protected public 
Alright Akshat — this is one of those **core OOP pillars** in Java that silently decides whether your codebase becomes scalable… or a total mess later when your full-stack + SDE prep projects grow in size.

Let’s break **Access Modifiers in Java** properly (with theory + real intuition 👇)

---

# 🔐 What are Access Modifiers?

In Java, **Access Modifiers control the visibility (scope) of:**

* Classes
* Variables
* Methods
* Constructors

Meaning:

> **Who can access what? From where?**

This is how Java implements **Encapsulation**
(= Data Hiding + Controlled Exposure)

Without this → anyone could change anything → fragile code → not production ready.

---

# 📦 Types of Access Modifiers in Java

There are **4 Access Modifiers:**

| Modifier    | Same Class | Same Package | Subclass (diff pkg) | Other Package |
| ----------- | ---------- | ------------ | ------------------- | ------------- |
| `private`   | ✅          | ❌            | ❌                   | ❌             |
| *default*   | ✅          | ✅            | ❌                   | ❌             |
| `protected` | ✅          | ✅            | ✅                   | ❌             |
| `public`    | ✅          | ✅            | ✅                   | ✅             |

Now let’s understand each like a system designer, not just exam answer 👇

---

## 🔒 1. `private` Access Modifier

* Accessible **only inside the same class**
* Most restrictive modifier

```java
class Student {
    private int marks = 90;

    private void display() {
        System.out.println(marks);
    }
}
```

📌 Even subclass **cannot access** it directly.

### Why use `private`?

For **Data Hiding**.

Real world analogy:

> Your ATM PIN is private
> Only *you* (same class) should access it

So in production-level code:

* All instance variables should be **private**
* Access via getters/setters

```java
public int getMarks() {
    return marks;
}
```

---

## 📁 2. Default (No Modifier)

If you don’t write anything:

```java
int age;
void show(){}
```

This is called **Package-Private**

Accessible:

* Inside same class
* Inside same package

Not accessible:

* Outside package

Analogy:

> Flat members inside same apartment building
> but not people from another society

---

## 🛡️ 3. `protected`

Accessible:

* Same class
* Same package
* Subclass (even in different package)

Not accessible:

* Non-subclass in another package

```java
protected int salary;
```

### Special Case:

If subclass is in another package:

```java
class Manager extends Employee {
    void show() {
        System.out.println(salary); // allowed
    }
}
```

But:

```java
Employee e = new Employee();
System.out.println(e.salary); // NOT allowed
```

Protected works via:

> **Inheritance, not object reference**

---

## 🌍 4. `public`

Accessible from:

* Anywhere
* Any package
* Any class

```java
public class Main {
    public int data;
}
```

Use when:

* You want global access
* APIs / utility methods
* Framework entry points

---

# 🧠 Class Level Access Modifier

At class level you can only use:

* `public`
* default

❌ You **cannot** use:

* `private`
* `protected`

```java
public class A {}   // allowed
class B {}          // default allowed
private class C {}  // ❌ error
```

---

# 🎯 Interview Insight (Very Important for SDE)

### Best Practice:

```java
class Account {
    private double balance;   // hide data

    public void deposit(double amount) {
        if(amount > 0)
            balance += amount;
    }
}
```

Why?

* Prevents direct manipulation
* Adds validation layer
* Increases maintainability
* Follows Encapsulation

This is exactly how **banking systems, payment gateways, backend services** are designed.

---

Since you’re building projects now for placements, this is the difference between:

> "It works" code
> vs
> "Industry standard" code

If you want, next I can show:

* Access modifiers across **packages**
* OR tricky MCQ-type inheritance cases (asked in interviews)

What should we tackle?
 */

public class accessmodifiers {
    
    
}
