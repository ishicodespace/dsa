package oops;

class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor");
    }
}

class Horse extends Animal {
    Horse() {
        super(); // calls parent class constructor
        super.color = "brown"; // accessing parent class variable using super keyword
        System.out.println("horse constructor");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
     System.out.println(    h.color); //prints brown
    }
}