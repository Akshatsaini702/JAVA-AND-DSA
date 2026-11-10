package oops;
//getters to return the value and setters to swt the value
// "this" keyword is used tp referto the current object
/*Yes — what you’re doing right now is actually **the correct way** 👍

Writing:

* 📌 Basic definition in comments
* 📌 Small code example in the same file

is **far better than making fancy notes in a notebook** that you’ll never execute.

Because:

> Placements test whether you can **write working code**, not whether you can *explain theory on paper*.

So for your current phase (DSA grind + building projects because you already saw resume without deployed GitHub = no replies 😅), this method is solid.

---

# 🔐 Getters and Setters (Basic Theory)

In OOP, we follow a principle called:

> **Encapsulation = Data Hiding + Controlled Access**

We make class variables:

```java
private
```

So that:

* No other class can directly access or modify them
* Prevents accidental or invalid data changes
* Adds validation before updating values

But then question:

> If variables are private… how will we read or update them?

That’s where:

### ✅ Getter

* Used to **get / read** the value of a private variable
* Provides **read-only access**

Naming convention:

```java
getVariableName()
```

---

### ✅ Setter

* Used to **set / update** the value of a private variable
* Provides **controlled write access**
* Can include validation logic

Naming convention:

```java
setVariableName()
```

---

# ❗Why Not Make Variables Public?

If we do this:

```java
public int age;
```

Anyone can do:

```java
person.age = -10;
```

Which is invalid.

But with setter:

We can add:

```java
if(age > 0)
```

So:

> Only valid data enters the system

This is exactly how:

* Banking systems
* Payment APIs
* Authentication services
  are designed in real backend systems.

---

# 💻 Code Example

```java
//Encapsulation using Getters and Setters

class Student {

    // Private Data Members (Data Hiding)
    private String name;
    private int age;

    // Getter Method for name
    public String getName() {
        return name;
    }

    // Setter Method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter Method for age
    public int getAge() {
        return age;
    }

    // Setter Method for age with validation
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Akshat");
        s1.setAge(20);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
```

---

📌 This is the **minimum level** of Getter/Setter understanding required for:

* OOP viva
* MCQs
* Coding interviews
* Later LLD rounds

If you want, next I can give:
👉 Constructor theory + example (same notes style you’re following)
 */
public class gettersandsetters {
    //Encapsulation using Getters and Setters
    public static void main(String[] args){
         Student s1 = new Student();

        s1.setName("Akshat");
        s1.setAge(20);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
    }
       
class Student {

    // Private Data Members (Data Hiding)
    private String name;
    private int age;

    // Getter Method for name
    public String getName() {
        return name;
    }

    // Setter Method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter Method for age
    public int getAge() {
        return age;
    }

    // Setter Method for age with validation
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }
}

