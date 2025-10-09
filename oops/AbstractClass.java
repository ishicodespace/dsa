package oops;

//abstract class -> class with abstract/ non-abstract methods
//abstract method -> method without body
abstract class Animal {
    String color;

    // non abstract method-> method with body
    void eat() {
        System.out.println("animal eats");
    }

    // abstract method-> method without body
    abstract void walk();
    // no implementation only idea (no body of function), implementation will depend on class that extends it

    // constructor of abstract classes can be created
    Animal() {
        //color will be brown by default unless changed
        String color = "brown";
        System.out.println("animal constructor");
    }
}

// horse is an animal -> inheritance
class horse extends Animal {

    // constructor of horse
    horse() {
        System.out.println("horse constructor");
    }

    // by default color will be brown but can be changed using a function below
    // because constructor of parent class ie Animal is called first
    void changeColor() {
        color = "white";
    }

    // The type horse must implement the inherited abstract method Animal.walk()
    void walk() {
        System.out.println("horse walks on 4 legs");
    }
}

class Mustang extends horse {
    // mustang is a horse which is an animal
    // so mustang inherits all properties of horse and animal

    // constructor of mustang
    Mustang() {
        System.out.println("mustang constructor");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("chicken walks on 2 legs");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        // objects of abstract classes cannot be created
        // Animal a = new Animal(); -> error
        horse h1 = new horse(); //calls animal constructor then horse constructor
        h1.eat(); // prints eats
        h1.walk(); // prints walks on 4
        System.out.println(h1.color); // prints brown
        h1.changeColor();
        System.out.println(h1.color); // prints white

        Mustang m1 = new Mustang(); //calls animal constructor then horse constructor then mustang constructor
        
        Chicken c1 = new Chicken(); //prints animal constructor
        c1.eat(); //prints animal eats
        c1.walk(); //prints chicken walks on 2 legs
        c1.color = "yellow";
        System.out.println(c1.color); //prints yellow

    }
}
