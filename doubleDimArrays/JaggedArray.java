package doubleDimArrays;

public class JaggedArray {
    public static void main(String[] args) {
        int arr[][]=new int[5][]; //dont define the column size
        arr[0]=new int[5];
        for(int i=0;i<arr.length;i++){
            //define a row for each row
          arr[i]=new int[i+1]; //column size= i+1
          for(int j=0;j<i+1;j++){  //loop size will change for every column = i+1
            System.out.print(arr[i][j]);
          }
          System.out.println();
    }
}
}
