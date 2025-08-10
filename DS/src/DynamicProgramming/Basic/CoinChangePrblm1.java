package DynamicProgramming.Basic;
//Given coins of certain denominations and a target amount,
// find the minimum number of coins needed to make that amount.
// If it’s not possible, return -1.

// EG : // coins = [1, 2, 5], amount = 11 :-    Output: 3 (11 = 5 + 5 + 1)
// EG : // coins = [2], amount = 3        :-    Output: -1 (not possible to make 3 with only 2s)
// EG : // coins = [1], amount = 0        :-    Output: 0 (no coins needed to make 0)
public class CoinChangePrblm1 {
    public static void main(String [] args){
        int [] coins = {1,2,5};
        int amount = 11;
        int res = minCoinCount(coins, amount);
        System.out.println("Result : "+res);
    }

    public static int minCoinCount(int [] coins, int amount){
        int [] dp = new int[amount+1];
        for(int i = 1; i<=amount; i++){
            dp[i] = amount + 1;
        }
        dp[0] = 0;
        for(int i = 0; i <= amount; i++){
            for(int coin : coins){
                if(coin <= i){
                    dp[i] = Math.min(dp[i], dp[i-coin]+1);
                }
            }
            System.out.println(dp[i]);
        }
        return dp[amount]>amount ? -1:dp[amount];


    }

}
