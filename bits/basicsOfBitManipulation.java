
public class basicsOfBitManipulation {

    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
      
      return (n&bitMask)>>i;
           
    }
    public static int updateIthBit(int n,int i, int newBit){
     
      int bitMask=~(1<<i);
     n=n&bitMask;
     int bitMask2=newBit<<i;
     
      return n|bitMask2;
     
  }
    public static void main(String[] args) {
     System.out.println(setIthBit(15, 3));
  System.out.println(updateIthBit(10, 2,1));
    
}
}