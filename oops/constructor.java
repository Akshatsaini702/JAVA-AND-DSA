package oops;

/*Perfect — this is an important one for both **OOP viva + LLD later**.
I’ll keep it **notes-style + one single code** that includes:

✔ Default Constructor
✔ Parameterized Constructor
✔ Copy Constructor
✔ Shallow Copy
✔ Deep Copy

---

# 🏗️ Constructor (Java)

### 📌 Definition:

A Constructor is a **special method** used to **initialize objects**.

* Name is same as class name
* No return type (not even void)
* Called automatically when object is created

```java
Student s = new Student();  // constructor called
```

---

# 📦 Types of Constructors

### 1️⃣ Default Constructor

* Takes no parameters
* Assigns default values

---

### 2️⃣ Parameterized Constructor

* Takes parameters
* Used to assign user-defined values

---

### 3️⃣ Copy Constructor

* Creates a new object by copying values of another object

Syntax:

```java
Student(Student s)
```

---

# 🧠 Copy Types

## 🔹 Shallow Copy

* Copies **reference**
* Both objects point to same memory
* Change in one affects other

---

## 🔹 Deep Copy

* Copies **actual values**
* Creates separate memory
* Change in one does NOT affect other

---

# 💻 Code Example (All in One)

```java
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {

    int age;
    Address addr;

    // 1. Default Constructor
    Student() {
        age = 18;
        addr = new Address("Delhi");
    }

    // 2. Parameterized Constructor
    Student(int age, Address addr) {
        this.age = age;
        this.addr = addr;
    }

    // 3. Shallow Copy Constructor
    Student(Student s) {
        this.age = s.age;
        this.addr = s.addr;   // reference copied
    }

    // Deep Copy Method
    Student deepCopy() {
        Address newAddr = new Address(this.addr.city);
        return new Student(this.age, newAddr);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();  // default
        Student s2 = new Student(20, new Address("Mumbai")); // parameterized

        Student s3 = new Student(s2);   // shallow copy
        Student s4 = s2.deepCopy();     // deep copy

        s2.addr.city = "Chennai";

        System.out.println(s3.addr.city); // Chennai (shallow affected)
        System.out.println(s4.addr.city); // Mumbai (deep not affected)
    }
}
```

---

📌 Remember for interviews:

| Copy Type | Memory | Effect of Change |
| --------- | ------ | ---------------- |
| Shallow   | Same   | Affects both     |
| Deep      | New    | Independent      |

This much is **more than enough** for:

* OOP exams
* Viva
* MCQs
* Placement interviews

Next: Inheritance types?
 */
public class constructor {

    public static void main(String[] args) {

        Student s1 = new Student();  // default
        Student s2 = new Student(20, new Address("Mumbai")); // parameterized

        Student s3 = new Student(s2);   // shallow copy
        Student s4 = s2.deepCopy();     // deep copy

        s2.addr.city = "Chennai";

        System.out.println(s3.addr.city); // Chennai (shallow affected)
        System.out.println(s4.addr.city); // Mumbai (deep not affected)
    }
}

// Address class
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

// Student class
class Student {

    int age;
    Address addr;

    // 1. Default Constructor
    Student() {
        age = 18;
        addr = new Address("Delhi");
    }

    // 2. Parameterized Constructor
    Student(int age, Address addr) {
        this.age = age;
        this.addr = addr;
    }

    // 3. Shallow Copy Constructor
    Student(Student s) {
        this.age = s.age;
        this.addr = s.addr;   // reference copied
    }

    // Deep Copy Method
    Student deepCopy() {
        Address newAddr = new Address(this.addr.city);
        return new Student(this.age, newAddr);
    }}
