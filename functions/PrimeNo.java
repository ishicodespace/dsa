package functions;

import java.util.Scanner;

public class PrimeNo {
    public static boolean isPrime(int num) {
    
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
      for(int i=2;i<=n;i++){
        if(isPrime(i)){
            System.out.print(i+", ");
        }
      }
    }
}
