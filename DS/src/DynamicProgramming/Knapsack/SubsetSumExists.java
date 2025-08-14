package DynamicProgramming.Knapsack;

public class SubsetSumExists {
    public static void main(String [] args){
        int [] nums = new int[]{2,3,5,6};
        int target = 8;
        System.out.println(subSumExists(nums, target));

    }

    public static Boolean subSumExists(int [] nums, int target){
        int n = nums.length;
        boolean [][] dp = new boolean[n+1][target+1];

        for(int i = 0; i<=n; i++){
            dp[i][0] = true;
        }

        for(int i = 1; i<=n; i++){
            for(int sum = 1; sum<= target; sum++){
                if(nums[i-1]<=sum){
                    dp[i][sum] = dp[i-1][sum]||dp[i-1][sum-nums[i-1]];
                }else{
                    dp[i][sum] = dp[i-1][sum];
                }

            }
        }
        return dp[n][target];


    }
}
