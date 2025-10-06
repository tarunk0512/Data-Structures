package Practice.Arrays;

public class TwoSum {
    //Two Sum
    public static void main(String [] args){
        int [] ar = {1,2,3,5,7,8,11,12,15};
        int target = 334;
        System.out.println(getTwoSum(ar,target));
    }

    public static Boolean getTwoSum(int [] ar, int target){
        int left = 0;
        int right = ar.length -1;
        int sum = 0;
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



}
