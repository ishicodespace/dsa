import java.util.ArrayList;

public class practise {
    public static void main(String[] args) {
          ArrayList<ArrayList<Integer>> mainList1 = new ArrayList<>();
        ArrayList<Integer> sublist1 = new ArrayList<>();
        sublist1.add(3);
        ArrayList<Integer> sublist2 = new ArrayList<>();
        sublist2.add(30);
        mainList1.add(sublist1);
        mainList1.add(sublist2);
        System.out.println(mainList1);
        for (int i = 0; i < mainList1.size(); i++) {
            ArrayList<Integer> currentArrayList = mainList1.get(i);
            for (int j = 0; j < currentArrayList.size(); j++) {
                System.out.print(currentArrayList.get(j)+" ");
            }
                }
    }
}
