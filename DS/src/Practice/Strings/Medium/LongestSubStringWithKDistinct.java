package Practice.Strings.Medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKDistinct {
    //Find the maximum length substring that contains at most K distinct characters.
//Example Input: s = "eceba", k = 2   :- Output: 3 → "ece"
    // Input: s = "aa", k = 1  :- Output: 2 → "aa"
    // Sliding Window + HashMap
    public static void main(String [] args){
        String s = "eceba";
        int k = 2;
        System.out.println(getSubString(s, k));
        String s1 = "advrfaavacb";
        int k1 = 3;
        System.out.println(getSubString2(s1, k1));
    }

    public static int getSubString(String s, int k){
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0)+1);

            while(map.size() > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;

    }

    //Find the maximum length substring that contains at most K distinct characters.
//Example Input: s = "eceba", k = 2   :- Output: 3 → "ece"
    // Input: s = "aa", k = 1  :- Output: 2 → "aa"
    // Sliding Window + HashMap


    public static int getSubString2(String s, int k){
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for(int right = 0; right< s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
            while(map.size() > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if(map.get(s.charAt(left)) == 0){
                    map.remove(s.charAt(left));
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
