package doubleDimArrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int startRow = 0;
        int endRow = arr.length - 1;
        int startColumn = 0;
        int endColumn = arr[0].length - 1;
        while (startRow <= endRow && startColumn <= endColumn) {
            // TOP (from starting column to ending column)
            for (int j = startColumn; j <= endColumn; j++) {
                System.out.println(arr[startRow][j]+" ");
            }

            // RIGHT  (from starting row to ending row)
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.println(arr[i][endColumn]);
            }

            // BOTTOM  (from ending column to starting column)
            for (int j = endColumn - 1; j >= startColumn; j--) {
                System.out.println(arr[endRow][j]+" ");
            }

            // LEFT  (from ending row to starting row)
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.println(arr[i][startColumn]+" ");
            }

            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }
    }
}
