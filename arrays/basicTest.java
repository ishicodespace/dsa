package arrays;

public class basicTest {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[1] = 10;
        arr[3] = 30;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //default value is 0
        }
    }
}
