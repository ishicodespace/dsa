import java.util.*;
public class MonotonicAL {
    public static void main(String[] args) {
        boolean monoIncrease = false;
        boolean monoDecrease = false;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(9);
        list.add(4);
        list.add(4);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) <= list.get(i + 1)) {
                monoIncrease = true;
            } else {
                monoIncrease = false;
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                monoDecrease = true;
            } else {
                monoDecrease = false;
            }
        }
System.out.println(monoIncrease||monoDecrease);
    }
}
