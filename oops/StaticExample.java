package oops;

 class Student { //if no access modifier is given then it is default access modifier
    static String name;
    int roll;
}
public class StaticExample {
    
    
    public static void main(String[] args) {
        Student.name="Ishika"; //static variables can be accessed using class name
    }
}
