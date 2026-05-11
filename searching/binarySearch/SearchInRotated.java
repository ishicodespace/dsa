package searching.binarySearch;

public class SearchInRotated {
    static int searchInSortedRotated(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        // self work
        int mid = si + (ei - si) / 2;

        // element found at mid
        if (arr[mid] == target)
            return mid;

        // mid lies on L1
        if (arr[si] < arr[mid]) {
            // case A: target lies on left of L1
            if (arr[si] <= target && target <= arr[mid]) {
                return searchInSortedRotated(arr, target, si, mid - 1); // not mid because we already checked mid in the
                                                                        // beginning

            } else {
                // case B: target lies on right of mid
                return searchInSortedRotated(arr, target, mid + 1, ei);
            }
        } else {
            // case C: target lies on right of L2
            if (arr[mid] <= target && target <= arr[ei]) {
                return searchInSortedRotated(arr, target, mid + 1, ei);

            } else {
                // case D: target lies on left of L2
                return searchInSortedRotated(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(searchInSortedRotated(arr, 2, 0, arr.length - 1));
    }
}
