package oops;

class ClassAndObject2 {
    // creating a new data type which is Student class
    public static class Student {
        // static because we are accessing it in static main method
        String name;
        int roll;
        double percentage;
    }

    public static void main(String[] args) {
        // ClassName objectName = new ClassName();
        // similarly how we write int a; a = 10;
        // here Student is a new data type
        Student s1 = new Student();
        // assigning values to the properties of Student class like a=10;
        System.out.println(s1.name); // default value is null
        System.out.println(s1.roll); // default value is 0  
        System.out.println(s1.percentage); // default value is 0.0
        s1.name = "Ishika";
        s1.roll = 34;
        s1.percentage = 98.5;
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.percentage);
    }
}