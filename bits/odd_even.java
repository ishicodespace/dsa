public class odd_even {
    public static void main(String[] args) {
    int num=8;
        int bitmask=1;
        if((num&bitmask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
