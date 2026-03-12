

class LC_121 {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int price : prices) {
            if (price < min_price) {
                min_price = price;
            }
            int profit = price - min_price;
            if (profit > max_profit) {
                max_profit = profit;
            }
        }
        System.out.print(max_profit);
        return max_profit;
}    
public static void main(String[] args) {
    int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
    LC_121 obj = new LC_121();
    obj.maxProfit(prices);
    
}
}