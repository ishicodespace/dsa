public class CountSetBits {
    public static void main(String[] args) 
{
    int n=10;
    int count=0;
    int end=(int)(Math.log(n) / Math.log(2))+1; //log base 2 is calculated like this
    for(int i=1;i<=end;i++){
        if((n&1)!=0){
            count++;
        }
        n=n>>1;
    }
System.out.println(count);
}

}
