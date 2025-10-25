class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printName(Student s) {
       System.out.println(s.name);
    }
}

public class demo {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        s1.printName(s1); // Output: Alice
    }
}