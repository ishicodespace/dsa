package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LonelyNumber {
  public static ArrayList<Integer> lonely(int nums[]){
    ArrayList<Integer>  list=new ArrayList<>();
    Arrays.sort(nums); //nlogn
for(int i=0;i<nums.length;i++){
    if(i==0){
    if(nums[i+1]!=nums[i]+1 &&nums[i+1]!=nums[i]){
        list.add(nums[i]);
    }
}
    else if(i==nums.length-1){
    if(nums[i-1]!=nums[i]-1 &&nums[i-1]!=nums[i]){
        list.add(nums[i]);
    }
    }
    else{
        if(nums[i-1]!=nums[i]-1&&nums[i+1]!=nums[i]+1&&nums[i-1]!=nums[i]&&nums[i+1]!=nums[i]){
            list.add(nums[i]);
        }
    }
    
}
return list;
  } 
  public static void main(String[] args) {
    int nums[]={10,6,5,8};
    System.out.println(lonely(nums));
  } 
}
