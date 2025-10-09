package oops;

public class CopyConstructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ishika";
        s1.roll = 10;
        s1.password = "abcd123";

        // copy constructor called
        Student s2 = new Student(s1); 
        s2.password = "xyz987";
        System.out.println(s2.name + " " + s2.roll);
        System.out.println(s2.password);
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student() {
        System.out.println("Constructor called");
        marks = new int[3];
    }

    //copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }
}
