package functions;

public class swap {
    public static void swapping(int a,int b){
int temp=a;
a=b;
b=temp;
System.out.println(a);
System.out.println(b);
    }
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static int binCoeffient(int n,int r){
        return factorial(n)/(factorial(r)*(factorial(n-r)));
    }
    public static void main(String[] args) {
        swapping(34, 45);
        System.out.println(factorial(5));
        System.out.println(binCoeffient(5, 2));
    }
}
