public class extra5 {
    public static void main(String[] args) {
        int [] arr = { -2,4,3,1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr) {
            int max = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                max=Math.max(arr[i],max);
            }
            for(int i=1;i<max;i++){
                int flag=0;
                for(int j=0;j<arr.length;j++){
                    if(arr[j]==i){
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                return i;
            }
            return max<0?1:max+1;
        }
    }