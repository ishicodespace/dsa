package recursion.Arrays;

import java.util.ArrayList;

//tc=O(n)
//sc=O(n)
public class LinearSearch {

    // check if target is present
    public static boolean linear(int arr[], int target, int i) {

        // 1. base case
        if (i >= arr.length)
            return false; // reached the end and target not found

        // 2. self work: check if current element is target
        if (arr[i] == target)
            return true;

        // 3. smaller problem: check from i+1 to end
        return linear(arr, target, i + 1);
    }

    // return index of target
    public static int returnIndexOfTarget(int arr[], int target, int i) {
        if (i >= arr.length)
            return -1;

        if (arr[i] == target) {
            return i;
        }
        return returnIndexOfTarget(arr, target, i + 1);

    }

    // find all indices where target is present
    public static void returnMultipleIndex(int arr[], int target, int i) {
        if (i >= arr.length) {
            return;
        }
        if (arr[i] == target) {
            System.out.print(i + " ");
        }
        returnMultipleIndex(arr, target, i + 1);

    }

    // return arraylist of all indices of targer
    public static ArrayList<Integer> returnArrayList(int arr[], int target, int i) {
        ArrayList<Integer> ans = new ArrayList<>();

        // 1. base case: return empty list
        if (i == arr.length) {
            return ans;
        }

        // smaller problem: get list of indices from i+1 to end
        ArrayList<Integer> smallAns = returnArrayList(arr, target, i + 1);

        // 2. self work: if current element is target, add index to list
        if (arr[i] == target) {
            ans.add(i);
        }

        // merge my ans with small ans
        ans.addAll(smallAns); // add ans from smaller problem to ans
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 3, 8, 8 };
        int arr2[] = { 8, 8, 8, 76, 7, 8 };
        System.out.println(linear(arr, 8, 0));
        System.out.println(returnIndexOfTarget(arr, 8, 0));
        returnMultipleIndex(arr2, 8, 0);
        System.out.println(returnArrayList(arr2, 8, 0));
    }
}
