package oops;

// class pen
class pen {
    // properties
    String color;
    int tip;

    // functions
    void setColor(String newcolor) {
        color = newcolor;
    }

    void setTip(int newtip) {
        tip = newtip;
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        // object obj of class pen
        // pen(): default constructor which initializes properties with null values
        pen obj = new pen(); //new keyword creates memory for object
        // prints null value
        System.out.println(obj.color);
        System.out.println(obj.tip);
        // sets value
        obj.setColor("blue");
        System.out.println(obj.color);
        obj.setTip(3);
        System.out.println(obj.tip);
    }
}
