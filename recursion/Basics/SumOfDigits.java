package recursion.Basics;

public class SumOfDigits {

    public static int SumOfDigits(int n) {

        //base case
        if (n == 0) {
            return 0; //return 0 cause sum hai
        }

        //self work add last digit 563%10=3
        //recursive work add remaining digits 563/10=56
        return n % 10 + SumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(SumOfDigits(563));
    }
}

// if(n>=0||n<=9){
// return n;
//}
// return n%10+SumOD(n/10);