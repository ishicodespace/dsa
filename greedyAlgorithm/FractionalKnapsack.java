package greedyAlgorithm;

import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int values[] = { 8, 2, 10, 1, 9, 7, 2, 6, 4, 9 };
        int weights[] = { 10, 1, 7, 7, 5, 1, 8, 6, 8, 7 };
        int capacity = 21;
        double ratios[][] = new double[values.length][4];
        for (int i = 0; i < values.length; i++) {
            ratios[i][0] = i;
            ratios[i][1] = values[i];
            ratios[i][2] = weights[i];
            // typecaste any one to double to get double result
            ratios[i][3] = values[i] / (double) weights[i]; // value to weight ratio
        }

        // sort ratios in descending order or sort in asceding then loop from last
        Arrays.sort(ratios, Comparator.comparingDouble((double[] o) -> o[3]).reversed());

        double totalValue = 0; // different ans in int
        for (int i = 0; i < ratios.length; i++) {

            // if weight of item is less than or equal to the capacity, take the whole item
            if (ratios[i][2] <= capacity) {
                totalValue += ratios[i][1];
                capacity -= ratios[i][2];
            }

            // otherwise take the fraction of item and break the loop as the knapsack is
            // full
            else {
                totalValue += ratios[i][3] * capacity;
                capacity = 0;
                break;
            }
        }

        System.out.println("Total value in knapsack = " + totalValue);
    }
}
