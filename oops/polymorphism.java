package oops;

public class polymorphism {

    public static void main(String[] args) {

        // Overriding Example
        Animal a = new Dog();
        a.sound();   // Dog barks (runtime)

        // Overloading Example
        MathOperation m = new MathOperation();
        System.out.println(m.add(2, 3));
        System.out.println(m.add(2, 3, 4));
    }
}
// Parent Class
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Child Class (Method Overriding)
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class MathOperation {

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

