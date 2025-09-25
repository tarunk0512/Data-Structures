package CompanyWise.Amex;

import java.util.HashMap;


public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }


   // Buy Sell Stock


    public static int maxProfit(int [] ar){
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 0; i< ar.length; i++){
            min = Math.min(ar[i], min);

            max = Math.max(max, ar[i]-min);
        }
        return max;


    }


    }

