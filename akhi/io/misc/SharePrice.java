package akhi.io.misc;

import java.lang.reflect.Array;

public class SharePrice {
    public static int maxProfitBrut(int[] prices){
        int l = prices.length;
        int maxProfit = 0;
        for (int i = 0; i < l-1; i++) {
            for (int j = i+1; j <l ; j++) {
                int diff = prices[j] - prices[i];
                if (diff > maxProfit){
                    maxProfit = diff;
                }
            }

        }
        return maxProfit;
    }
   public static int maxProfit(int[] prices) {
       int l = prices.length;
       int maxProfit = 0;
       int minPrice = prices[0];
       for (int i = 1; i < l ; i++) {
         maxProfit = Math.max(maxProfit , prices[i]-minPrice);
       minPrice = Math.min(minPrice,prices[i]);
       }
       return maxProfit;
   }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] prices3 = {1,2,3,4,5};
        int[] prices1 = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfitBrut(prices1));
        System.out.println(maxProfit(prices3));
    }
}
