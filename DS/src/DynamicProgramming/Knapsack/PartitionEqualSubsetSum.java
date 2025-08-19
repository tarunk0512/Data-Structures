package DynamicProgramming.Knapsack;
//Question: Can you split the list into two groups that have the same total sum?
//Example: [1, 5, 11, 5] → YES, because {11} and {1, 5, 5} both sum to 11.
//Example: [1, 2, 3, 5] → NO, because the total is 11 (odd), so it can’t be split into two equal parts.

//Notes Below the code

public class PartitionEqualSubsetSum {
    public static void main(String [] args){
        int [] nums = {3,5,11,5};
        System.out.println(isEqualSubsetPossible(nums));
    }

    public static Boolean isEqualSubsetPossible(int [] nums){
        int total = 0;
        for(int i : nums){
            total += i;
        }
        int n = nums.length;
        if(total%2 != 0) {
            return false;
        }
        int target = total/2;

        boolean [][] dp = new boolean[n+1][target+1];
        for(int i = 0; i<=n; i++){
            dp[i][0] = true;
        }

        for(int i = 1; i<=n; i++){
            for(int sum = 1; sum<=target; sum++){
                if(sum>=nums[i-1]){
                    dp[i][sum] = dp[i-1][sum] || dp[i-1][sum-nums[i-1]];
                }

            }
        }
        return dp[n][target];

    }
}


//Let total = sum of all numbers.
//
//If total is odd, answer is false (you can’t split an odd number into two equal integers).
//
//If total is even, then each group must sum to target = total / 2.
//
//The problem becomes: Is there a subset of numbers that sums to target?
//That’s exactly Subset Sum.