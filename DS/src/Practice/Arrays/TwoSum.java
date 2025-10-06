package Practice.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    //Two Sum
    public static void main(String [] args){
        int [] ar = {1,2,3,5,7,8,11,12,15};
        int target = 14;
        System.out.println(getTwoSum(ar,target));
        System.out.println(Arrays.toString((getTwoSumUsingHashMap(ar, target))));
    }

    public static Boolean getTwoSum(int [] ar, int target){
        int left = 0;
        int right = ar.length -1;
        int sum;
        while(left < right){
            sum = ar[left] + ar[right];
            if(sum == target) return true;
            if(sum > target){
                right--;
            }else{
                left++;
            }
        }
        return false;
    }
    public static int [] getTwoSumUsingHashMap(int [] ar, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum;
        for(int i = 0; i < ar.length; i++){
            sum = target - ar[i];
            if(map.containsKey(sum)){
                return new int[]{ar[i], sum};
            }
            map.put(ar[i], i);

        }
        return new int [] {-1,-1};
    }





}
