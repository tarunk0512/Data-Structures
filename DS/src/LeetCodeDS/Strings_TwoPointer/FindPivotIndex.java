package LeetCodeDS.Strings_TwoPointer;

public class FindPivotIndex {
    public static void main(String [] args){
        int [] ar = {2,-1,1};
        System.out.println(pivotIndex(ar));
    }
    public static int pivotIndex(int[] nums) {
        int total = 0;
        for(int n : nums){
            total+=n;
        }
        int leftTotal = 0;
        for(int i =0;i< nums.length; i++){
            int rightTotal = total - leftTotal - nums[i];
            if(rightTotal == leftTotal){
                return i;
            }
            leftTotal+=nums[i];
        }
        return -1;
    }
}
