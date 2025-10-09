package oops;


//static keyword can be used with properties, methods, nested classes and blocks

class Student {
    String name;
    int roll;

    static String school; // static variable: shared by all objects of the class
    
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }    
}

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.school = "ABC High School";
        
        Student s2 = new Student();
        System.out.println(s2.school); // prints ABC High School even though we did not set it for s2
        // because school is static variable and shared by all objects of the class
        
    }
}
