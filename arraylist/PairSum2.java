import java.util.ArrayList;

public class PairSum2 {
    public static void main(String[] args) {
        //Find pairs in rotated sorted array
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 126;
        System.out.println(findPair(list, target));
    }

    public static boolean findPair(ArrayList<Integer> list, int target) {
        //2 pointers approach
        int pivot = -1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                // Found the pivot
                pivot = i;
                break;
            }
        }
            // Find the pair
            int left = pivot + 1;
            int right = pivot;
            while (left != right) {
                int sum = list.get(left) + list.get(right);
                //case 1: Found the pair
                if (sum == target) {
                    return true;
                }
                //case 2
                else if (sum > target) {
                    right = (list.size() + right - 1) % list.size();
                }
                //case 3 
                else {
                    left = (left + 1) % list.size();
                }
            }
            return false; // No pair found    

        }
    }

