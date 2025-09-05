package functions;

import java.util.Scanner;

public class BinToDec {
    public static int convert_BinToDec(int binary) {
        int decimal = 0;
        int power = 0;
        while (binary != 0) {
            int binaryDigit = binary % 10;
            decimal = decimal + (binaryDigit * (int)Math.pow(2, power));
            power++;
            binary = binary / 10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int binary = in.nextInt();
        System.out.println(convert_BinToDec(binary));
        in.close();
    }
}
