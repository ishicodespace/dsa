package oops;

// class pen user defined data type
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

    String getColor() {
        return color;
    }

    int getTip() {
        return tip;
    }
}

public class ClassAndObject1 {
    public static void main(String[] args) {
        // object obj of class pen
        // pen(): default constructor which initializes properties with null values
        pen obj = new pen(); // new keyword creates memory for object in heap
        // System.out.println(obj); -> prints reference id of object
        System.out.println(obj.color); // default value is null
        System.out.println(obj.tip); // default value is 0
        // sets value
        obj.setColor("blue");
        obj.color= "red"; // direct access to property
        System.out.println(obj.getColor());
        obj.setTip(3);
        System.out.println(obj.getTip());
    }
}
