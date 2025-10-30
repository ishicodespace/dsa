

import java.util.Scanner;

public class PrimeNumber {
    static boolean check_prime(int num){
        //corner cases only for n>=2, can be omitted
        if(num==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(num);i++){ /*There is a small issue with the loop condition in your code for
             checking prime numbers. The condition i < Math.sqrt(num) should be i <= Math.sqrt(num) because 
             if num is a perfect square, you need to check the square root as a potential divisor. */
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
    static void primes_InRange(int range){
        for(int i=2;i<=range;i++){
            if(check_prime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int range=in.nextInt();
       primes_InRange(range);
      System.out.println( check_prime(2));
in.close();
    }
}

