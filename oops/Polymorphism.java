package oops;

//overloading: same name but different parameters
class Calculator {
    //functions differ in number of arguments or type of arguments
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// overriding: parent and child class both contain same method with same name and same parameters
// but child class provides its own implementation of that method
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
        //compiler knows at compile time which sum function to call so its called compile time polymorphism
        Calculator a = new Calculator();
        System.out.println(a.sum(4.5, 4.5));
        System.out.println(a.sum(4, 5));

        // overriding
        Pug p = new Pug();
        p.display();
    }
}
