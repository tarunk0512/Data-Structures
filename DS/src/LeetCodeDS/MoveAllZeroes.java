package LeetCodeDS;

import java.util.Arrays;

public class MoveAllZeroes {
    public static void main(String [] args){
        int [] ar = {0,1,2,4,0,0,8,5,0,1,0};
        moveZeroes(ar);// Output : [1,3,12,0,0]
    }
    public static void moveZeroes(int[] nums) {
        int z =0;
    int k =0;
        for(int i = 0; i< nums.length; i++){
        if(nums[i]!=0){
            nums[k]=nums[i];
            k++;
        }else{z++;}

    }
        for(int i = k; i< nums.length; i++){
        nums[i] = 0;
    }
        for(int n : nums){
        System.out.println(n);
    }
}
}
