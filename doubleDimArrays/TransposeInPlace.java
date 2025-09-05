package doubleDimArrays;

public class TransposeInPlace {

    public static void main(String[] args) {
        int arr[][] = { { 1,3,2 }, { 7,4,5}, { 5,6,10 } };
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){ //from i to column length otherwise it will swap again and give og matrix
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
}
}
