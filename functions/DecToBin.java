package functions;

import java.util.Scanner;

public class DecToBin {
    public static int convert_DecToBin(int decimal){
        int binary=0;
        int power=0;
    while(decimal>0){
binary=binary+(decimal%2)*(int)Math.pow(10, power);
power++;
decimal/=2;
    }
    return binary;

    }
   public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int decimal=in.nextInt();
    System.out.println(convert_DecToBin(decimal));
    in.close();
   }
}

// int decimal=in.nextInt();
// String binary="";
// while(decimal!=0){
// binary=binary+Integer.toString(decimal%2);
// decimal/=2;
// }

// System.out.println("Equivalent Binary Number: " +binary);

