package Alogorithms;

import java.util.Arrays;
import java.util.List;

public class SlidingWindow {
    public static void main(String [] args){
        int [] ar = {1,4,6,2,3,6,7};
    System.out.println(maxSumofSubArray(3, ar));
    }

    // Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.
    public static int maxSumofSubArray(int k, int[] nums)
    {
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        int n = nums.length;
        if(k>n){
            System.out.println("INVALID");
            return -1;
        }
        int max =0;
        for(int i = 0; i<k; i++){
            max = max + list.get(i);
        }
        int maxSum = max;
        for(int i = k; i<n; i++){
            max = max + list.get(i) - list.get(i-k);
            maxSum = Math.max(max, maxSum);
        }
        return maxSum;
    }
}
