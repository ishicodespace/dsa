
package doubleDimArrays;


public class Questions {

    public static int noOfSevens(int arr[][]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int[][] transpose(int arr[][]) {
        int transpose[][] = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        return transpose;
    }
 
    public static int largestElementInArray(int arr[][]) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 4, 7 }, { 11, 4, 3 }, { 2, 2, 3 } };
       
        int transpose[][] = transpose(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Cell Position: " + j + "," + i + ": ");
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < transpose.length; i++) {

            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println(largestElementInArray(arr));
        System.out.println(noOfSevens(arr));

    }

}
