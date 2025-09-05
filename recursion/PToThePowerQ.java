package recursion;

public class PToThePowerQ {
    public static int power(int p, int q) {
        if (q == 0) {
            return 1;
        }
        int smallPow = power(p, q / 2);

        if (q % 2 == 0) { //even
            return smallPow * smallPow;
        }
        else { //odd power
            return p * smallPow * smallPow;
       }
    }
    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
}
