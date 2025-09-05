public class test {
  static double avg(int a, int b, int c) {
    return (a + b + c) / 3;
  }

  static boolean isEven(int num) {
    if (num % 2 == 0) {
      return true;
    }
    return false;
  }

  static boolean isPalindrome(int num) {
    int reverse=0;
    int number=num;
    while (num > 0) {
reverse=reverse*10+(num%10);
num=num/10;
    }
    if(reverse==number){
      return true;
    }
    return false;
  }

  static int sumOfDigits(int num){
    int sum=0;
    while (num>0) 
    {
    sum=sum+(num%10);
    num=num/10;
    }
    return sum;
  }
  public static void main(String[] args) {
    System.out.println(avg(2, 40, 30));
    System.err.println(isEven(3));
    System.out.println(isPalindrome(12121));
    System.out.println(sumOfDigits(121));
  }
}
