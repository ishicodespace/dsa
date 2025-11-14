package recursion.Basics;

public class ProductOfDigits {

    public static int ProductOfDigits(int n) {
        if (n == 0) {
            return 1;
        }

        return n % 10 * ProductOfDigits(n / 10);
    }
    
    public static void main(String[] args) {
        System.out.println(ProductOfDigits(13490));
    }
}
