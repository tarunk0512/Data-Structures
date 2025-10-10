package Practice.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintMaxSumSubArray {

    // Print SubArray with MaximunSum
    public static void main(String [] args){
        int [] ar = {-2,1,-3,4,-1,2,1,-5,4};
        List<Integer> res = printSubArray(ar);
        System.out.println(res);
    }

    public static ArrayList<Integer> printSubArray(int [] ar){
        int currStart = 0;
        int restart = 0;
        int resEnd = 0;
        int maxSum = ar[0];
        int maxEnding = ar[0];

        for(int i = 1; i < ar.length; i++){
            if(maxEnding + ar[i] < ar[i]){
                currStart = i;
                maxEnding = ar[i];
            }else{
                maxEnding = maxEnding + ar[i];
            }

            if(maxEnding > maxSum){
                maxSum = maxEnding;
                restart = currStart;
                resEnd = i ;
            }

        }
        ArrayList<Integer> resAr = new ArrayList<>();
        for(int i = restart; i <= resEnd; i++){
            resAr.add(ar[i]);
        }
        return resAr;

    }

}
