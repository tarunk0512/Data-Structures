package Alogorithms;
//    Given an array of positive integers nums and a positive integer S,
//    find the minimal length of a contiguous subarray of which the sum is greater than or equal to S. If there isn't one, return 0 instead.

public class MinSubArrayLength {
    public static void main(String [] args){
        int [] ar = {1,2,4,2,3,5,3};
        int s = 9;
        System.out.println(minSubAr(ar,s));
    }
    public static int minSubAr(int[] ar, int s){
        int n = ar.length;
        int minLength = Integer.MAX_VALUE;
        int currSum = 0;
        int start = 0;
        for(int i =0; i<n; i++){
            currSum += ar[i];
            while(currSum >= s){
                minLength = Math.min(minLength, i-start+1);
                currSum -= ar[start];
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;

    }
}
