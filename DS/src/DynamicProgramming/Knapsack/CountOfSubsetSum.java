package DynamicProgramming.Knapsack;
//🔹 Super-Quick Remembering Formula
//dp[i][sum] = exclude + include
//exclude → dp[i-1][sum] (don’t use current element)
//include → dp[i-1][sum - ar[i-1]] (use current element)
//💡 Intuition Recap
//Rows ↑ = elements we can use.
//Cols → = target sums.
//Build from top to bottom:
//Above row = previous elements.
//Current row = use previous counts + current element choice.
public class CountOfSubsetSum {
    public static void main(String [] args){
        int [] ar = {2,3,5,6,8};
        int target = 9;
        System.out.println(getCount(ar, target));

    }


    public static int getCount(int [] ar, int target){
        int n = ar.length;
        int [][] dp = new int[n+1][target+1];
        for(int i = 0; i<=n; i++){
            dp[i][0] = 1;
        }


        // DP Meaning: dp[i][sum] = count of subsets using first i elements whose sum = sum

// Loop: Build answer row by row (elements) & col by col (sum targets)
        for (int i = 1; i <= n; i++) {
            for (int sum = 1; sum <= target; sum++) {

                // If current element value <= current sum → we have 2 choices
                if (sum >= ar[i-1]) {
                    // Choice 1: Exclude current element → same count as above row (dp[i-1][sum])
                    // Choice 2: Include current element → count of subsets that formed (sum - ar[i-1]) earlier
                    dp[i][sum] = dp[i-1][sum]       // not taking current element
                            + dp[i-1][sum - ar[i-1]]; // taking current element
                }
                // If element bigger than sum → can't include, so copy above row
                else {
                    dp[i][sum] = dp[i-1][sum];
                }
            }
        }

        return dp[n][target];

    }
}
