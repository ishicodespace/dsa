import java.util.*;

public class MonotonicAL {
    public static void main(String[] args) {
        boolean monoIncrease = true;
        boolean monoDecrease = true;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(4);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                monoDecrease = false;
                break;
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                monoIncrease = false;
                break;
            }
        }
        System.out.println(monoIncrease || monoDecrease);
    }
}
