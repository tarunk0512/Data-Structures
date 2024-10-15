package LeetCodeDS.Strings_TwoPointer;

public class SlidingWindow_Easy {
    public static void main(String [] args){
        int [] ar = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(ar,4));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0;
        double sum = 0;

        for(int i=0; i<k;i++){
            sum+=nums[i];
        }
        maxAvg = sum/k;

        //System.out.println(maxAvg);
        for(int i=k;i<nums.length;i++){
            sum = sum - nums[i-k] + nums[i];
            maxAvg = Math.max(maxAvg,sum/k);
        }
        return maxAvg;
    }

    //2.0 & 49.5
//        12.375 & 40.5
//        12.375
////    double ans
// = 0;
//    double window = 0;
//        for(int i=0;i<k;i++) {
//        window +=nums[i];
//    }
//    ans = window/k;
//        for(int right=k;right<nums.length;right++) {
//        window+=nums[right] - nums[right-k];
//        ans = Math.max(ans,window/k);
//    }
//        return ans;
}
