import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
map.put(1,1);
map.put(2, 3);
map.put(3, 4);
System.out.println(map.getOrDefault(1, 5));
    }
}
