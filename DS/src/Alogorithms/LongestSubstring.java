package Alogorithms;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String [] args){
        System.out.println(lengthOfLongestSubstring("abcdabcbb"));
    }
    // Given a string s, find the length of the longest substring without repeating characters.

    public static int lengthOfLongestSubstring(String s){
        if(s == null || s.isEmpty()){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0, right = 0;
        for(right = 0; right< s.length(); right ++){
            char currentChar = s.charAt(right);
            if(map.containsKey(currentChar) && map.get(currentChar)>= left){
                left = map.get(currentChar)+1;
            }
            map.put(currentChar,right);
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}
