package recursion.Basics;

public class ArmstrongNum {

    // count the no of digits
    public static int countDigits(int n) {
        if (n >= 0 && n <= 9) {
            return 1;
        }
        return 1 + countDigits(n / 10);
    }

    // num to the power of no of digits
    public static int power(int num, int count) {
        if (count == 0) {
            return 1;
        }
        return num * power(num, count - 1);
    }

    // armstrong function
    public static int armstrong(int n) {
        int count = countDigits(n);
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += power(digit, count);
            temp = temp / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 1634;
        if (num == armstrong(num)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
