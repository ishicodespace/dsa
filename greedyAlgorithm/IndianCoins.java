package greedyAlgorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IndianCoins {

    public static void main(String[] args) {
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int value = 590;
        ArrayList<Integer> minCoins = new ArrayList<>();

        //max coin will be used first
        for (int i = coins.length - 1; i >= 0; i--) {
            if (value == 0) {
                break;

            }
            //while loop because we can use same coin multiple times
            while (coins[i] <= value) {
                value -= coins[i];
                minCoins.add(coins[i]);
            }
        }
        System.out.println("Minimum number of coins required: " + minCoins.size());
        System.out.println(minCoins);
    }
}