package oops;

class Animals {
    void print() {
        System.out.println("Animal class");
    }
}

class Mammals extends Animals {
    void walk() {
        System.out.println("Mammals walk");
    }
}

class Dogs extends Mammals {
    void speak() {
        System.out.println("dog barks");
    }

}

public class Inherit {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.print();
        d.walk();
        d.speak();
    }
}
