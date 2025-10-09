package oops;

public class ShallowCopy {

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
        // even after copying, the marks array is shared between s1 and s2
        // this is called a shallow copy
        // changes made to the marks array of s1 will be reflected in s2
        // this is because both s1 and s2 have the same reference to the marks array
        // this can lead to problems if we want to keep the marks array separate for
        // each student
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        // Modifying s2's marks to see the effect on s1
        s2.marks[2] = 50;
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }
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

    //shallow copy constructor
    Student(Student s1) {
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    this.marks = s1.marks;
    }
}
