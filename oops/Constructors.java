package oops;

class student {
    String name;
    int marks[];
    // default constructor
    student() {
        System.out.println("hey");
    }

    // parameterised constructor
    student(String name) {
        marks = new int[2];
        this.name = name;
        this.marks[0] = 12;
        this.marks[1] = 13; 
    }
    // copy constructor
    student(student s2) {
        this.name = s2.name;
        this.marks = s2.marks; //array is not copied. its reference is copied
    }
}

public class Constructors {

    public static void main(String[] args) {
        //constructor overloading: multiple constructors with the same name and different parameters
        student s1 = new student();
        student s2 = new student("ishika");
        student s3 = new student(s2); //copy
        s2.marks[1] = 50; //s2 value changed reflected in s3 too: shallow copy
        for (int i = 0; i < 2; i++) {
            System.out.println(s3.marks[i]);
        }
        System.out.println(s2.name);
        
    }
}
