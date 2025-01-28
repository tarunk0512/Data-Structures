package LeetCodeDS.HashMap;

import java.util.HashMap;

public class DistinctElementInArray {
    public static void main(String [] args){
        String [] arr = {"a", "b", "c", "d", "a", "d"};
        System.out.println(distinctElement(arr, 2));
    }
    public static String distinctElement(String[] arr, int k){
        HashMap<String, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int len = map.size();
        int count =0;
        for(int i =0; i< arr.length; i++){
            if(map.get(arr[i]) == 1 ){
                count++;
                if(count == k) return arr[i];
            }
        }
        return "";
    }
}
