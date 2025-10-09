package oops;

class Animals {
    void print() {
        System.out.println("Animal class");
    }
}

// all properties and methods of animals are inherited to mammals and mammals
// can have their own properties too
class Mammals extends Animals {
    void walk() {
        System.out.println("Mammals walk");
    }
}

// dogs class inherits properties of mammals and animals class
class Dogs extends Mammals {
    void speak() {
        System.out.println("dog barks");
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Dogs dodo = new Dogs();
        dodo.print();
        dodo.walk();
        dodo.speak();
    }
}
