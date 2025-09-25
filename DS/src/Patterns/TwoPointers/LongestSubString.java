package Patterns.TwoPointers;

import java.util.HashSet;

public class LongestSubString {
    public static void main(String [] args){
        String s = "abcbcdab";
        System.out.println(getLongestNonRepeatingSubstring(s));

    }

    public static int getLongestNonRepeatingSubstring(String s){
        int left = 0, right = 0, maxLength = 0;
        HashSet<Character> st = new HashSet<>();
        for(right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            while(st.contains(c)){
                st.remove(s.charAt(left));
                left++;
            }
            st.add(c);
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;

    }


}
