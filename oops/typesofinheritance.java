package oops;
/*Haan bhai — types ko **2–3 lines me crisp** likh le notes me like this 👇

---

# 📦 Types of Inheritance in Java

### 1️⃣ Single Inheritance

When **one child class inherits from one parent class**.
It allows reuse of properties and methods of a single base class.

> Example: Dog inherits Animal

---

### 2️⃣ Multilevel Inheritance

When a **class inherits from a child class**, forming a chain.
Here, a class acts as both parent and child.

> Example: Puppy → Dog → Animal

---

### 3️⃣ Hierarchical Inheritance

When **multiple child classes inherit from the same parent class**.
All child classes share common properties of the base class.

> Example: Dog and Cat inherit Animal

---

### 4️⃣ Multiple Inheritance

When a **single class inherits from more than one parent class**.
❌ Not supported in Java through classes to avoid ambiguity
(achieved using Interfaces)

---

### 5️⃣ Hybrid Inheritance

Combination of two or more types of inheritance
(like multiple + multilevel).
❌ Not supported using classes in Java
(achieved using Interfaces)

---

Bas itna hi likhna hai — perfect for viva + placements.

Next: Polymorphism short?
 */

// Base Class (Parent)
class Animal {

    void eat() {
        System.out.println("Animal eats food");
    }
}

// -----------------------------
// 1. Single Inheritance
// Dog inherits Animal
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

// -----------------------------
// 2. Multilevel Inheritance
// Puppy inherits Dog (which already inherits Animal)
class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy weeps");
    }
}

// -----------------------------
// 3. Hierarchical Inheritance
// Cat also inherits Animal
class Cat extends Animal {

    void meow() {
        System.out.println("Cat meows");
    }
}

// -----------------------------
public class typesofinheritance {

    public static void main(String[] args) {

        // Single Inheritance
        Dog d = new Dog();
        d.eat();   // inherited method
        d.bark();

        // Multilevel Inheritance
        Puppy p = new Puppy();
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // own method

        // Hierarchical Inheritance
        Cat c = new Cat();
        c.eat();   // inherited from Animal
        c.meow();
    }
}
