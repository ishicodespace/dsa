package arrays;

class TrappingRainwater {
    public static int trappedRainwater(int height[]) {

        // Calculate left max boundary- auxillary arrays
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Calculate right max boundary- auxillary arrays
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // loops
        int trappedRainwater = 0;
        for (int i = 0; i < height.length; i++) {
            
            // water level=min(leftMax,rightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water= (water level-height)*width
            trappedRainwater += waterLevel - height[i];
        }
        return trappedRainwater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 }; //elevation
        System.out.println(trappedRainwater(height));
    }
}