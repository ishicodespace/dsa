import java.util.*;

public class MostFrequentNumberFollowingKey {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        int key = 1;
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == key) {
                int target = list.get(i + 1); // get the number following the key
                if (count.containsKey(target) == false) { // if target not in map
                    count.put(target, 1); // add target with frequency 1
                } else {
                    count.put(target, count.get(target) + 1); // increment frequency by 1 if already present
                }
            }
        }
        int max = 0;
        for (int target : count.keySet()) { // iterate through the keys
            int freq = count.get(target); // get the frequency
            if (freq > max) {
                max = freq;
                System.out.println(target); // print the target with the highest frequency
            }
        }
    }
}

    // public int mostFrequent(int[] nums, int key) {
//         int n = nums.length;
//         int maxCount = 0;
//         int result = -1;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < n - 1; i++) {
//             if (nums[i] == key) {
//                 map.put(nums[i + 1], map.getOrDefault(nums[i + 1], 0) + 1);
//                 if (map.get(nums[i + 1]) > maxCount) {
//                     maxCount = map.get(nums[i + 1]);
//                     result = nums[i + 1];
//                 }
//             }
//         }
//         return result;
//     }
// }