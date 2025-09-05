package doubleDimArrays;

public class SpiralMatrixAntiClockwise {
    public static void spiralPrint(int arr[][]) {
        int startRow=0,startColumn=0;
        int endRow=arr.length-1,endColumn=arr[0].length-1;
        while(){
            for(int i=startRow;i<=endRow;i++){
                System.out.print(arr[i][startColumn]);
            }
            startColumn++;
            for(int j=startColumn;j<=endColumn;j++){
                System.out.print(arr[endRow][j]);
            }
            endRow--;
            for(int i=endRow;i>=startRow;i++){
                System.out.print(arr[i][endColumn]);
            }
            endColumn--;
            for(int j=endColumn;j>=startColumn;j++){
                System.out.print(arr[startRow][j]);
            }
            startRow++;
        }
    }


    public static void main(String[] args) {
        int arr[][] = { { 1, 6, 1, 14, 21 }, { 2, 7, 12, 15, 25 }, { 3, 8, 13, 16, 22 }, { 4, 9, 17, 19, 24 },
                { 5, 10, 20, 18, 23 } };
        spiralPrint(arr);
    }
}
