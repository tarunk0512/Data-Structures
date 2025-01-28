package LeetCodeDS.HashMap;
//Q --> Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.
//Input: words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
//Output: 2
//Explanation:
//- "leetcode" appears exactly once in each of the two arrays. We count this string.
//- "amazing" appears exactly once in each of the two arrays. We count this string.
//- "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. We do not count this string.
//- "as" appears once in words1, but does not appear in words2. We do not count this string.
//Thus, there are 2 strings that appear exactly once in each of the two arrays.


import java.util.HashMap;

public class CountCommonWords {
    public static void main(String[] args){
        String [] words1 = {"a", "ab"};
        String [] words2 = {"a","a","a","ab"};
        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2){
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(int i =0; i<words1.length; i++){
            map1.put(words1[i], map1.getOrDefault(words1[i], 0)+1);
        }
        for(int i =0; i< words2.length; i++){
            map2.put(words2[i], map2.getOrDefault(words2[i], 0)+1);
        }
        int count = 0;
        for(String word : words1){
            if(map1.get(word) == 1 && map2.getOrDefault(word,0)==1){
                count++;
            }
        }
    return count;
    }
}
