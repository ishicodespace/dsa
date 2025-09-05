package arrays;
public class containerWithMostWater {
    public static int mostWaterContainer(int height[]){
int max=0;
int left=0;
int right=height.length-1;
while(left<=right){
int length=Math.min(height[right], height[left]);
int breadth=Math.abs(right-left);
int area=length*breadth;
max=Math.max(area,max);
if(height[left]<=height[right]){
left++;
}
else{
    right--;
}
    }
return max;
    }
    public static void main(String[] args) {
     int height[]={1,8,6,2,5,4,8,3,7};
     System.out.println(mostWaterContainer(height));   
    }
}
