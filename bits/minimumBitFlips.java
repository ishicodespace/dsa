package bits;

public class minimumBitFlips {
    class Solution {
        public static int  minBitFlips(int start, int end) { 
            //Brian Kernighan’s Algorithm
            int xor=start^end;
            int setBits=0;
            while(xor!=0){
    xor=xor&(xor-1);
    setBits++; //hamming weight: count set bits
            }
            return setBits;
        }
        public static void main(String[] args) {
            System.out.println(minBitFlips(10111,10101));
        }
    }
}
