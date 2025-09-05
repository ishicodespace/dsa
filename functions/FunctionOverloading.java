package functions;

public class FunctionOverloading {
    //Function Overloading with different number of parameters and same name

    static float sum(float a,float b){
        return a+b;
    }
    static int sum(int a,int b,float c){
        return (int) (a+b+c);
    }
    public static void main(String[] args) {
        System.out.println(sum(34f,7f));
    }
}
