package stack;

import java.util.Stack;

// On a given day, look backwards (to previous days) and count how many 
// days in a row had prices less than or equal to today’s price—until you 
// hit a day where the price was higher.
public class StockSpanProblem {
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> prevHigh = new Stack<>();
        span[0] = 1; // first day always 1
        prevHigh.push(0);
        // loop to calculate span for each day
        for (int i = 1; i < stocks.length; i++) {
            int currentPrice = stocks[i];
            while (!prevHigh.isEmpty() && currentPrice >= stocks[prevHigh.peek()]) {
                prevHigh.pop();
            }
            if (prevHigh.isEmpty()) {
                span[i] = i + 1; // all previous prices are smaller
            } else {
                int prevHighIndex = prevHigh.peek();
                span[i] = i - prevHighIndex;
            }
            prevHigh.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
