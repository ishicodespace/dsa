package functions;

public class Functions {
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }

    public static boolean isPalindromeString(String s){
        String palindrome="";
        for(int i=s.length()-1;i>=0;i--){
            palindrome=palindrome+s.charAt(i);
            
        }
        if(s.equals(palindrome)){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isPalindrome(int num)
    {
        int num2=num, rev=0;
        while(num!=0){
            rev=rev*10+(num%10);
            num/=10;
        }
        if(num2==rev){
            return true;
        }
        else{
            return false;
        }
    }

    public static int sum_digits(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum_digits(73));
    }
}

