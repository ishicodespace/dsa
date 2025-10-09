package oops.accessModifiers;

public class Test {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Ishika"; // accessible
        // obj.roll = 34; // not accessible: compile time error
        System.out.println(obj.name);
        // System.out.println(obj.roll); // not accessible: compile time error
    }
}
