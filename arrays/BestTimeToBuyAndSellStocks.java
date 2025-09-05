package arrays;

public class BestTimeToBuyAndSellStocks {
    public static int bestTime(int prices[]) {
        int sellPrice, buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            sellPrice = prices[i];
            if (buyPrice < sellPrice) { // profit
                int profit = sellPrice - buyPrice; // today's profit
                maxProfit = Math.max(profit, maxProfit); // overall max profit (global)
            } else {
                buyPrice = sellPrice; // buy today
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        System.out.println(bestTime(prices));
    }
}


// public static void main(String[] args) {
//     int prices[]={7, 6, 4,  3, 1};
//     int buyPrice=Integer.MAX_VALUE;
//     int sellPrice;
//     int max=0;
//     for(int i=0;i<prices.length;i++){
// sellPrice=prices[i];
// buyPrice=Math.min(buyPrice,sellPrice);
// int profit=sellPrice-buyPrice;
// max=Math.max(max, profit);
//     }
//     System.out.println(max);
// }