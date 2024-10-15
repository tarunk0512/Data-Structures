package LeetCodeDS.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DifferenceInArrays {
    public static void main(String [] args){
        int [] ar1 = {1,2,3};
        int [] ar2 = {2,4,6};
        System.out.println(findDifference(ar1,ar2));
     }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        set1.forEach(n -> {
            if(!set2.contains(n)){
                ar1.add(n);
            }
        });
        result.add(ar1);
        set2.forEach(n -> {
            if(!set1.contains(n)){
                ar2.add(n);
            }
        });

        result.add(ar2);
        return result;
     }
}
