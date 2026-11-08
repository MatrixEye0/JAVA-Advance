public class BuySellStock {
    public int maxProfit(int[] prices) {
        // Initialize the lowest price seen so far and the max profit
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            if (price < minPrice) {
                // Update the minimum price found so far
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                // Update the maximum profit if selling today yields a higher return
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        BuySellStock stockTrader = new BuySellStock();
        int[] prices = {7,1,5,3,6,4,6,9,3,1,4,8,2,2,15,4};
        int profit = stockTrader.maxProfit(prices);
        System.out.println("Maximum profit: " + profit); // Output: Maximum profit:
    }
}
