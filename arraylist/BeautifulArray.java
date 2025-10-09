import java.util.ArrayList;

public class BeautifulArray {
    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 2; i <= n; i++ ) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (Integer j : list) {
                if (j * 2 - 1 <= n)
                    temp.add(j * 2 - 1);
            }
            for (Integer j : list) {
                if (j * 2 <= n)
                    temp.add(j * 2);
            }
            list = temp;
        }
        System.out.println(list);
    }
}