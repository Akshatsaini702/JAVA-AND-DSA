package oops;
/*Chal **Abstraction** ko seedha dimaag mein bithate hain — OOP ka sabse **real-life applicable** concept hai ye. Aur placements/viva dono mein 100% puchenge.

---

## 🧠 What is Abstraction? (Theory First)

> **Abstraction ka matlab hai: Implementation details ko hide karna aur sirf essential features ko dikhana.**

User ko:

* *Kya ho raha hai* pata hona chahiye
* *Kaise ho raha hai* pata hona **zaroori nahi**

Iska main goal:

* Complexity kam karna
* Security badhana
* System ko modular banana
* Maintainability improve karna

---

## 🌍 Real Life Example

![Image](https://images.openai.com/static-rsc-3/l64sNJjZ_aDr4asaVfVEzTyuu8c22frWAxX1faXhrWI6f2-V3BEqfqcYbRiid8ObAGTs8vgltf7c68GGvGpRYlTwkzdS1URkCQPoUqjfUpM?purpose=fullsize\&v=1)

![Image](https://images.openai.com/static-rsc-3/QK0IwnTZqnSH-e6u1UZ1PgK7I3EWNSFtMN2g81sRrJg9jS26auwo76FTXdsxvlNFotMlrGQYUvuUyfvfRQfz-hUKKzGuJKFylWTR3DI13tM?purpose=fullsize\&v=1)

![Image](https://images.openai.com/static-rsc-3/TQzBJYRamognQWVue5a5I4NpVBqxKW2R8DOdEgBnAMASZt7ktalKlE4h6mxmKCWK8A0gAc93-FROO0rCb6DLFnSZPV0uxSvdA1vTYG1v_p4?purpose=fullsize\&v=1)

![Image](https://images.openai.com/static-rsc-3/v_9g6UI4GHGLT9DrmPeujeWmwpmfPyx0xgMrQZacy3ocvQbw1oVN2ev94uimlU2JsDI-4_RY9T39tYF1KOCikgwhLKQo17XjD2pdjRftrAs?purpose=fullsize\&v=1)

* Tu **car chalata hai**

  * Steering ghumata hai
  * But engine ke andar piston kaise move ho raha? ❌ Don’t know
* Tu **ATM use karta hai**

  * Cash mil jaata hai
  * Backend mein bank server kya kar raha? ❌ Hidden
* Tu **phone pe app open karta hai**

  * App chalti hai
  * Code kaise execute ho raha? ❌ Hidden

👉 Ye sab **Abstraction** hai.

---

## 💻 Java mein Abstraction Kaise Achieve Hota Hai?

Java mein abstraction 2 tarike se hota hai:

1. **Abstract Class**
2. **Interface**

---

### 1️⃣ Abstract Class

* `abstract` keyword use hota hai
* Isme:

  * Abstract methods (without body) ho sakte hain
  * Normal methods (with body) bhi ho sakte hain
* Object **directly create nahi kar sakte**

```java
abstract class Vehicle {
    
    abstract void start();  // no implementation
    
    void fuelType() {
        System.out.println("Petrol or Diesel");
    }
}

class Car extends Vehicle {
    
    void start() {
        System.out.println("Car starts with key");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.fuelType();
    }
}
```

👉 Yahan:

* `Vehicle` ne bataya **start hona chahiye**
* But *kaise hoga* ye `Car` decide karegi

---

### 2️⃣ Interface

* 100% abstraction (traditionally)
* Sirf method declaration (Java 8 ke baad default/static allowed)

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
```

👉 Interface sirf rulebook deta hai:
interface is used for multiple inheritance in java


> “Sound method hona hi chahiye”

Implementation class decide karegi.

---

## 🔑 Abstract Class vs Interface (2–3 Lines Quick Viva Ready)

* **Abstract Class**: Partial abstraction, methods with/without body allowed, `extends` se inherit hoti hai
* **Interface**: Full abstraction (mainly), only method declaration, `implements` se use hoti hai
* Java supports multiple inheritance via **interfaces only**, not abstract classes

---

Akshat, yaad rakh:

> **Encapsulation = Data Hiding**
> **Abstraction = Implementation Hiding**

DSA structured thinking build karega,
OOP abstraction tera **software design dimaag** banayega — jo SDE interviews mein alag dikhega.

Next: Encapsulation revise karein ya Association/Aggregation?
 */

public  class abstraction {
    
}
