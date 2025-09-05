import java.util.*;
public class ContainerWithMostWater {
    static int maxArea(ArrayList<Integer> height ) {
        // Brute Force Approach
        // int maxArea = 0;
        // for (int i = 0; i < height.length; i++) {
        //     for (int j = i + 1; j < height.length; j++) {
        //         int width= j - i;
        //         int area = Math.min(height[i], height[j]) * width;
        //         maxArea = Math.max(maxArea, area);
        //     }
        // }
        // return maxArea;
        // Two Pointer Approach
        int maxArea = 0;
        int leftPointer = 0;
        int rightPointer = height.size() - 1;
        while (leftPointer < rightPointer) {
            int width = rightPointer - leftPointer;
            int heightt=Math.min(height.get(leftPointer), height.get(rightPointer)) ;
            int area = heightt * width;
            maxArea = Math.max(maxArea, area);
            // Move the pointer pointing to the shorter line
            if (height.get(leftPointer) < height.get(rightPointer)) {
                leftPointer++;
            } 
             else {
                rightPointer--;
            }

        }
        return maxArea;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("Maximum area of water that can be contained: " + maxArea(height));
        
    }
}
