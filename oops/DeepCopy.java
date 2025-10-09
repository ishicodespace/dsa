package oops;

public class DeepCopy {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ishika";
        s1.roll = 10;
        s1.password = "abcd123";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        // copy constructor called
        Student s2 = new Student(s1);

        s2.password = "xyz987";
        System.out.println(s2.name + " " + s2.roll);
        s1.marks[2] = 100;
        // after copying, the marks array is NOT shared between s1 and s2
        // this is called a deep copy
        // changes made to the marks array of s1 will NOT be reflected in s2
        // this is because both s1 and s2 have different references to the marks array
        // this is useful when we want to keep the marks array separate for each student
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student() {
        // initialize the marks array here too to avoid null pointer exception
        // When you create Student s1 = new Student(); without marks initialization,
        // s1.marks stays null
        // Then s1.marks[0] = 100; → ❌ NullPointerException
        marks = new int[3];
        System.out.println("Constructor called");
    }

    // deep copy constructor
    Student(Student s1) {

        // The constructor’s main job is to initialize your object’s state.
        // That includes: Setting default or starting values, Allocating memory for
        // instance fields like arrays or objects.
        this.marks = new int[3]; // allocate new memory for marks array
        // essentially means whenever I create a new Student, give them a marks array
        // that can hold 3 subjects.

        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
