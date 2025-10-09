package oops;

interface Mother {
    void mom();
}

interface Father {
    void dad();
}

class Child implements Mother, Father {
    //multiple inheritance not allowed in java using classes but allowed using interfaces
    //to avoid ambiguity and complexity
    public void mom() {
        System.out.println("child's mother");
    }
    public void dad() {
        System.out.println("child's father");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.mom();
        c.dad();
    }
}