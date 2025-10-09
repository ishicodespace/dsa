package oops;

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("Constructor called");
    }
    // parameterised constructor
    Student(String name) {
        this.name = name;
    }
    Student(int roll) {
        this.roll = roll;
    }   
}

public class ParameterisedConstructor {
    public static void main(String[] args) {
        //constructor overloading: multiple constructors with the same name and different parameters
        //constructor is called according to the parameters passed during object creation
        Student s1 = new Student();
        Student s2 = new Student("John");
        Student s3 = new Student(101);
    }
}

