import java.util.Scanner;

public class ContinueKeyword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            int num = in.nextInt();
            if (num % 10 == 0) {
                continue;
            } else
                System.out.println(num);
        } while (true);
    }
}
