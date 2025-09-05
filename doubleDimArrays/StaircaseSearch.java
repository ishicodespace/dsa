package doubleDimArrays;

public class StaircaseSearch {
    //when i=0,j=m-1
    public static boolean topSearch(int arr[][], int key) {
int i=0;
int j=arr[0].length-1;

while(i<arr.length && j>=0){
    if(arr[i][j]==key){
        return true;
    }
    else if(key<arr[i][j]){
        j--;
    }
    else{
        i++;
    }
}
return false;
    }
    //when i=n-1,j=0
    public static boolean bottomSearch(int arr[][], int key){
        int i=arr.length-1;
        int j=0;
        
        while(i>=0 && j<arr[0].length){
            if(arr[i][j]==key){
                return true;
            }
            else if(key<arr[i][j]){
                i--;
            }
            else{
                j++;
            }
        }
        return false;
            }
    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 100;
        System.out.println( bottomSearch(arr, key));
    }
}
//USING ROW WISE BINARY SEARCH 
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         boolean flag=false;
//     for(int i=0;i<matrix.length;i++){
//          flag=binarySearch(matrix[i],target);
//          if(flag) return true;
//         }
    
//     return flag;
//     }
// public static boolean binarySearch(int arr[],int key){
// int start=0;
// int end=arr.length-1;
// while(start<=end){
//     int mid=(start+end)/2;
//     if(arr[mid]==key){
//         return true;
//     }
//     else if(arr[mid]>key){
//         end=mid-1;
//     }
//     else{
//         start=mid+1;
//     }
// }
// return false;
// }
// }