package LeetCodeDS.Strings_TwoPointer;

public class HighestAltitude {
    public static void main(String [] args){
       int [] ar = {-4,-3,-2,-1,4,3,2};
       System.out.println(largestAltitude(ar));
    }
    public static int largestAltitude(int[] gain) {
        int count = 0;
        int maxCount = 0;
        for(int n : gain){
            count = count +n;
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}
