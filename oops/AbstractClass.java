package oops;

abstract class Animal {
    String color;

    // constructor of abstract classes can be created
    Animal() {
        String color = "brown";
        System.out.println("animal constructor");
    }

    // non abstract method
    void eat() {
        System.out.println("eats");
    }
    // abstract method

    abstract void walk();
    // no implementation only idea (no body of function), implementation will depend
    // on class that extends it
}

class horse extends Animal {
    horse() {
        System.out.println("horse constructor");
    }

    // by default color will be brown but can be changed using a function below
    // because constructor of parent class is called first
    void changeColor() {
        color = "dark brown";
    }

    // The type horse must implement the inherited abstract method Animal.walk()
    void walk() {
        System.out.println("walks on 4");
    }
}

class chicken extends Animal {
    void walk() {
        System.out.println("chicken walks");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        // objects of abstract classes cannot be created
        // Animal a = new Animal(); -> error
        horse h1 = new horse(); //calls animal constructor then horse constructor
    }
}
