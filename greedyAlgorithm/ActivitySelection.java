package greedyAlgorithm;

import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 }; // end time is already sorted in the question
        ArrayList<Integer> ans = new ArrayList<>();

        //
        int activityCount = 0;

        // always select the first activity because it ends the earliest
        activityCount = 1;
        ans.add(0);
        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            // select non overlapping activities
            if (start[i] > end[ans.get(ans.size() - 1)]) { // end[ans.get(ans.size() - 1)] -> pick the last choosen
                                                           // activity index from ans list then get its end time
                activityCount++;
                ans.add(i);
                lastEnd=end[i];
            }
        }

        System.out.println("Maximum number of activities: " + activityCount);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
}
}
