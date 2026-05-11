package greedyAlgorithm;

import java.util.*;

public class ActivitySelectionSort {

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 }; // end time is already sorted in the question

        // sorting
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // sort activities by end time at 2nd index
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));

        int activityCount = 0;
        activityCount = 1;
        int lastEnd = activities[0][2];
        for (int i = 1; i < start.length; i++) {
            if (activities[i][1] >= lastEnd) {
                activityCount++;
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Maximum number of activities: " + activityCount);
    }
}