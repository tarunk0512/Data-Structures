package LeetCodeDS.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurences {
    public static void main(String [] args){
        int [] ar = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(ar));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        Set<Integer> occurence = new HashSet<>();
        for(int count : map.values()){
            if(!occurence.add(count)){
                return false;
            }
        }
        return true;
    }
}
