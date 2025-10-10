package Practice.Arrays;

public class MaxStockProfit {
    //Buy Sell Stock
    public static void main(String [] args){
        int [] ar = {7,1,5,3,6,4};
        System.out.println(getMaxProfit(ar));
    }
    public static int getMaxProfit(int [] ar){
        int n = ar.length;
        int min = ar[0];
        int res = 0;

        for(int i = 1; i < n; i++){
            min = Math.min(min, ar[i]);
            res = Math.max(res, ar[i] - min);
        }
        return res;

    }
}
