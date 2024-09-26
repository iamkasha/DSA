package arrays;

public class StockBuySellProblem {

    public static void maxProfit(int[] price, int n){
        int maxPr = 0;
        int start = price[0];
        for(int i=1; i<n-1; i++){
            if(price[n+1] < price[n]){
                maxPr = price[n] - start;
                start = price[n+1];
            }
        }
    }
    public static void main(String[] args) {
        int[] price = { 100, 180, 260, 310, 40, 535, 695 };
        int n = price.length;
    }
}
