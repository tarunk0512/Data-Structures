package DynamicProgramming.Basic;

public class CoinChangePrblm2 {
    public static void main(String [] args){
        int amount = 5;
        int [] coins = {1,2,5};
        System.out.println(calculateWays(amount, coins));
    }

    public static int calculateWays(int amount, int [] coins){
        int [] dp = new int[amount+1];
        dp[0] = 1;         // Base case: There's 1 way to make amount 0 (choose no coins)
        // Iterate through each coin
        // and update the dp array for each amount
        // from the coin value to the target amount
        // This ensures that each coin is only used once per amount calculation

// Step 1: Loop over each coin type FIRST
//         This ensures we count only unique combinations (not permutations).
//         Example: For coins [1,2], amount=3
//         We want "1+2" and "2+1" to be considered the SAME combination.
        for(int coin : coins){

            // Step 2: For each amount from 'coin' value up to target amount
            //         Why start at 'coin'? Because smaller amounts can't use this coin.
            for(int i = coin; i<=amount; i++){

                // Step 3: Add ways to make amount (i - coin) to dp[i]
                //         Because if we can achieve amount (i - coin), adding this coin gets us to i.
                //         dp[i] stores total number of combinations to make amount i.

                //dp[i] = number of ways to make amount i using the coins we’ve processed so far.
                //dp[i - coin] = number of ways to make the smaller amount i - coin.
                //If we already know how to make (i - coin),
                //then adding one coin to each of those ways will give us a way to make i.

                dp[i] = dp[i] + dp[i-coin];
            }
        }
        return dp[amount];

    }
}
