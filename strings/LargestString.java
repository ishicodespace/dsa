package strings;

public class LargestString {
    public static String largest(String fruits[]){
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest=fruits[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String fruits[]={"apple","banana","mango"};
        System.out.println(largest(fruits));
        Integer a=10;
        a.toString();
    }
}
