public class reversenum {
   
        public static void main(String[] args) {
            int num=10988;
            int reverse=0;
            while(num!=0){
     reverse=(reverse*10)+num%10;
     num/=10;
            }
            System.out.println(reverse);
        }
    
}
