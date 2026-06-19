class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0]; 
        int maxProfit = 0; 

        for (int p: prices) {
            if (p < minPrice) {
                minPrice = p;
            }
            maxProfit = Math.max(maxProfit, p - minPrice);
        }
        return maxProfit;
    }
}
