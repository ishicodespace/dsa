package extra;

class extra2 {
  public static int count(int arr[],int i) {
    if (i == arr.length) {
      return -1;
    }
    return Math.max( arr[i],count(arr, i + 1));
  }

  static int gcd(int x, int y) {
    if (x == 0)
      return y;
    return gcd(y % x, x);
  }

  static int pow(int p, int q) {
    if(q==1)
      return p;
    int smallAns = pow(p, q / 2);
    if(q%2==0)
      return smallAns * smallAns;
      else
        return p * smallAns * smallAns;
  }
  public static void main(String[] args) {
    int arr[] = {};
    System.out.println(count(arr, 0));
    System.out.println(gcd(24, 15));
    System.out.println(pow(2, 5));
  }
}

