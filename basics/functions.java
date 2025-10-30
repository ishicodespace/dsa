

import java.util.*;

public class Functions {
//     static int sum(int a, int b) { // paramaters or formal
//         return a + b;
//     }
//     static void print(){
//         int x = in.nextInt();
//         int y = in.nextInt();
//         System.out.println(sum(x,y));
//     }

public static void swap(int a,int b){
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a:"+a+" "+"b:"+b);
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
                int y = in.nextInt(); 
                System.out.println("a:"+x+" "+"b:"+y);
                swap(x, y);
                System.out.println(x); //value not changed known as call by value because a copy of variable was passed not the same
                // argument or actual parameters
                in.close();
    }
}
