package DynamicProgramming.Knapsack;

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


        for(int i = 1; i<=n; i++){
            for(int sum = 1; sum<=target; sum++){
                if(sum>=ar[i-1]){
                    dp[i][sum] = dp[i-1][sum] + dp[i-1][sum-ar[i-1]];

                }else {
                    dp[i][sum] = dp[i-1][sum];
                }

            }
        }

        return dp[n][target];

    }
}
