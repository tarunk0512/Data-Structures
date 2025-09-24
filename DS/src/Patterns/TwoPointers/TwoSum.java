package Patterns.TwoPointers;

import java.util.List;

public class TwoSum {
    public static void main(String [] args){
        int [] ar = {1,2,3,5,7,8,11,12,15};
        System.out.println(checkTwoSum(ar));

    }


    public static List<Integer> checkTwoSum(int [] ar){
        int target = 9;
        int left = 0;
        int right = ar.length-1;
        int temp = 0;

        while(left < right){
            temp = ar[left] + ar[right];
            if(temp > target){
                right--;
            }else if(temp < target){
                left++;
            }else {
                return List.of(left,right);
            }
        }

        return List.of(-1);


    }
}
