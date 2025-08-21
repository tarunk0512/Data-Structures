package InterviewPrep;

import java.util.*;

public class TwoPointer_TwoSum {
    public boolean hasPairWithSum(int[] nums, int target) {
        Arrays.sort(nums); // Sort first if not sorted
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) return true;
            else if (sum < target) left++;
            else right--;
        }

        return false; // No pair found
    }

    public static void main(String[] args) {
        TwoPointer_TwoSum solver = new TwoPointer_TwoSum();
        int[] nums = {2, 7, 11, 13};
        System.out.println(solver.hasPairWithSum(nums, 15)); // true
    }
}
