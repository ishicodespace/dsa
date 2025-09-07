import java.util.ArrayList;
import java.util.HashMap;

public class LonelyAL {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(findLonelyNumbers(list));
    }

    public static ArrayList<Integer> findLonelyNumbers(ArrayList<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i)) == false)
                map.put(list.get(i), 1);
            else
                map.put(list.get(i), map.get(list.get(i)) + 1);
        }
        ArrayList<Integer> lonelyNumbersList = new ArrayList<>();

        for (int key : map.keySet()) {
            if ((map.containsKey(key + 1) == false) &&
                    (map.containsKey(key - 1) == false) &&
                    map.get(key) == 1) {
                list.add(key);
            }
        }
        return lonelyNumbersList;
    }
}
//         Collections.sort(list);
//         for (int i = 0; i < list.size(); i++) {
//             boolean isLonely = true;

//             if (i < list.size()-1&& list.get(i) + 1 == list.get(i + 1) || list.get(i) == list.get(i + 1)) {
//                 isLonely = false;
//             }
//             if ( i>0&&  list.get(i) - 1 == list.get(i - 1)|| list.get(i) == list.get(i - 1)) {
//                 isLonely = false;
//             }
//             if (isLonely)
//                 lonelyNumbersList.add(list.get(i));
//         }
//         return lonelyNumbersList;
//     }
// }