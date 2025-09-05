package oops;

//overloading
class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(double a, double b) {
        return (int)(a + b);
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// overriding
class Dog {
    void display() {
        System.out.println("dog barks");
    }
}

class Pug extends Dog {
    @Override
    void display() {
        System.out.println("pug barks");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // overloading
        Calculator a = new Calculator();
        System.out.println(a.sum(4.5, 4.5));
        System.out.println(a.sum(4, 5));
        // overriding
        Pug p = new Pug();
        p.display();
    }
}
