
package oops;
import java.util.*;
/*Alright — **notes style**, short and placement-relevant 👇

---

# 🔒 Encapsulation (OOP)

### 📌 Definition:

Encapsulation is the process of **wrapping data (variables) and code (methods) into a single unit (class)** and **restricting direct access** to the data by making variables `private` and accessing them using **getters and setters**.

It provides:

* Data Hiding
* Controlled Access
* Better Security
* Maintainability

---

# 💻 Small Code Example:

```java
//Encapsulation Example

class Student {

    private int age;   // data hiding

    public int getAge() {   // getter
        return age;
    }

    public void setAge(int age) {   // setter with validation
        if(age > 0)
            this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.setAge(19);

        System.out.println(s.getAge());
    }
}
```

---

That’s enough for:

* Viva
* MCQs
* Interview theory
* Your current OOP notes file

Next topic? Inheritance or Polymorphism?
 */

public class encapsulation {
     public static void main(String[] args) {

        Student s = new Student();
        s.setAge(19);

        System.out.println(s.getAge());
    }}
    //

class Student {

    private int age;   // data hiding

    public int getAge() {   // getter
        return age;
    }

    public void setAge(int age) {   // setter with validation
        if(age > 0)
            this.age = age;
    }
}
  rectify it