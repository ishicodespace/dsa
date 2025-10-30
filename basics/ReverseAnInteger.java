public class ReverseAnInteger {
    // overflow: if reverse exceeds the range of integer, then return 0
    public static int reverse(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;

            // Check overflow/underflow
            if (reverse > Integer.MAX_VALUE / 10 ||
                    (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reverse < Integer.MIN_VALUE / 10 ||
                    (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234)); 
        System.out.println(reverse(-1234)); 
    }
}
