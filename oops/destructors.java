package oops;

/*Good one — because this is a **trick theory question** often asked in viva 😄

---

# 🧹 Destructor in Java (Basic)

### 📌 Definition:

A **Destructor** is a special method used to:

> **Deallocate memory and destroy objects when they are no longer needed**

---

## ❗But Important Point:

### 🚫 Java does **NOT** have destructors like C++

In C++:

```cpp
~Student() {
   // destructor
}
```

But in Java:

> Memory management is handled automatically by **Garbage Collector (GC)**

So programmer does **not manually destroy objects**.

---

# ♻️ Garbage Collector (GC)

In Java:

* When an object is **no longer referenced**
* JVM automatically deletes it from memory

Example:

```java id="7d9a2f"
Student s = new Student();
s = null;   // object eligible for GC
```

Now the object has:

* No reference pointing to it
  → Garbage Collector removes it automatically

---

# 🧪 finalize() Method (Acts Like Destructor)

Java provides a method:

```java
protected void finalize()
```

* Called before object is destroyed by GC
* Used to release resources like:

  * Files
  * Database connections
  * Network sockets

---

# 💻 Code Example:

```java id="k2a4rp"
class Student {

    protected void finalize() {
        System.out.println("Object is destroyed");
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s = null;

        System.gc();  // request GC
    }
}
```

---

# ⚠️ Note (Interview Important):

* `finalize()` is **not guaranteed** to run immediately
* GC runs automatically
* Java recommends using:

  * try-with-resources
  * close() methods
    instead of finalize()

---

### One-line Viva Answer:

> Java does not support destructors; memory is managed automatically by Garbage Collector and finalize() method acts similarly to destructor.

Enough for:

* OOP viva
* MCQs
* Placement interviews

Next: Inheritance?
 */
public class destructors {
    
}
