import java.util.HashMap;

public class Basics {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 3);
        map.put(3, 4);
        System.out.println("1 " + map.containsKey(1));
        System.out.println("4 " + map.containsKey(4));
        System.out.println("3 " + map.containsKey(3));
        System.out.println(map.size());
        System.out.println(map.getOrDefault(1, 5));
    }
}
