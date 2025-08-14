package DynamicProgramming.Knapsack;

public class SubsetSumExists {
    public static void main(String[] args) {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int target = 9;
        boolean result = subsetSubPresent(nums, target);
        System.out.println("Subset with sum " + target + " exists: " + result);
    }

    public static boolean subsetSubPresent(int[] nums, int target) {
        int n = nums.length;

        // Step 1: Create a DP table of size (n+1) x (target+1)
        boolean[][] dp = new boolean[n + 1][target + 1];

        // Step 2: Base Case - sum 0 is always possible (empty subset)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Step 3: Fill the table
        for (int i = 1; i <= n; i++) {           // go through each number
            for (int sum = 1; sum <= target; sum++) {  // check each possible sum
                if (nums[i - 1] <= sum) {
                    // We have two choices:
                    // 1) Include current number
                    // 2) Exclude current number
                    dp[i][sum] = dp[i - 1][sum] || dp[i - 1][sum - nums[i - 1]];
                } else {
                    // Cannot include current number (too large for this sum)
                    dp[i][sum] = dp[i - 1][sum];
                }
            }
        }

        // Step 4: Answer is in dp[n][target]
        return dp[n][target];
    }
}
