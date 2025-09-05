package doubleDimArrays;

public class DiagonalSum {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = 0;

        // BRUTE FORCE O(n^2)

        // for (int rows = 0; rows < arr.length; rows++) {
        // for (int colums = 0; colums < arr[0].length; colums++) {
        // if (rows == colums) {
        // sum += arr[rows][colums];
        // }
        // else if ((rows + colums) == (arr.length - 1)) {
        // sum += arr[rows][colums];
        // }

        // }
        //

        // OPTIMAL O(n)

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if (i != arr.length - 1 - i) { // when i!=j (middle element was added in previous loop already
                // dont include it again)
                sum += arr[i][arr.length - 1 - i]; // i+j=n-1 =>j=n-1-i (value of j in terms of i and n to remove j loop)
            }
        }
        System.out.println(sum);
    }
}
