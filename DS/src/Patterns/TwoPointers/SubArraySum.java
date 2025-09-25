package Patterns.TwoPointers;

import java.util.HashMap;

public class SubArraySum {
    public static void main(String [] args){
        int [] ar = {1,4,6,7,0};
        System.out.println(subArraySum(ar));
        System.out.println(subArraySumUsingHashMap(ar));

    }

    public static Boolean subArraySumUsingHashMap(int [] ar){
        int k = 5;
        int left = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1); // To handle the case when subarray starts from index 0
        for(int i = 0; i< ar.length; i++){
            sum = sum + ar[i];
            if(map.containsKey(sum-k)){
                return true;
            }
            map.put(sum, i);

        }
        return false;

    }


    public static Boolean subArraySum(int [] ar){
        int k = 5;
        int left = 0, sum = 0;

        for(int right = 0; right < ar.length; right++){
            sum = sum+ar[right];
            while(sum > k && left <= right){
                sum = sum - ar[left];
                left++;
            }
            if(sum == k){
                return true;}

        }
        return false;

    }
}
