package arrays;

public class StockBuySellProblem {

    public static int maxProfit(int[] price, int n){
        int maxPr = 0;
        for(int i=1; i<n; i++){
            if(price[i-1] < price[i]){
                maxPr += price[i] - price[i - 1];
            }
        }
        return maxPr;
    }
    public static void main(String[] args) {
        int[] price = { 100, 180, 260, 310, 40, 535, 695 };
        int n = price.length;
        System.out.println(maxProfit(price, n));
    }
}
