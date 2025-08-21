package InterviewPrep;
//At each position i, ask:
//What’s the maximum subarray sum that ends exactly at index i?
//
//Call this currentSum.
//
//Either:
//
//Extend the previous subarray (add current element), or
//
//Start fresh from current element (if previous sum was negative).
//
//Because a negative sum would only make things worse.
public class KadaneAlgo {

    public static void main(String [] args){
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(getMaxSum(nums));

    }


    public static int getMaxSum(int [] nums){
        int max = nums[0];
        int currSum = nums[0];
        for(int i = 1; i<nums.length; i++){
            // Either extend previous subarray or start new from nums[i]
            currSum = Math.max(nums[i], currSum+nums[i]);
            max = Math.max(currSum, max);
        }
        return max;

    }
}
