package oops;

//creating a class inside main method
// Java does not allow static keyword with local inner class
// So, we cannot declare a class inside a method as static
class StudentClass {
    // creating a new data type which is Student class
    public static void print(Student1 s) { //error
        System.out.println(s.name);
    }
    public static void main(String[] args) {
        // since the class is inside main we cannot use it outside main in another method
        // ****the scope of this class is only inside main method
         class Student1 {
            String name;
            int roll;
            double percentage;
        }
        // ClassName objectName = new ClassName();
        // similarly how we write int a; a = 10;
        // here Student is a new data type
        Student1 s1 = new Student1();
        // assigning values to the properties of Student class like a=10;
        s1.name = "Ishika";
        s1.roll = 34;
        s1.percentage = 98.5;
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.percentage);
        print(s1); //error
    }
}