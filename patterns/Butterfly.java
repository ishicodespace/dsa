package patterns;
public class Butterfly {
    public static void main(String[] args) {
        int n=10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n*2; j++) {
                if(i>=j||i+j>=(n*2)+1){             
                    System.out.print("*");

                } 
                else {
                    System.out.print("-");
                }
            }
         
            System.out.println();
        }
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <= n*2; j++) {
                if(i>=j||i+j>=(n*2)+1){             
                    System.out.print("*");

                } 
                else {
                    System.out.print("-");
                }
            }
         
            System.out.println();
        }
    }
}
