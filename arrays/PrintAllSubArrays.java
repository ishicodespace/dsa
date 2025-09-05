package arrays;

public class PrintAllSubArrays {
    public static void main(String[] args) {

        int arr[] = { 1, 3, 6, 4 };
    
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                  System.out.print(arr[k]+" ");
                }
              System.out.println();
               
            }

        }
        }

    }
