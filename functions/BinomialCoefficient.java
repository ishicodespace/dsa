package functions;

import java.util.Scanner;

public class BinomialCoefficient {
    static int fact(int num){
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    static double binomial_coeff(int n,int r){
        return (fact(n)/(fact(r)*(fact(n-r))));
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int r=in.nextInt();
        System.out.println(binomial_coeff(n, r));
        in.close();
    }
}
