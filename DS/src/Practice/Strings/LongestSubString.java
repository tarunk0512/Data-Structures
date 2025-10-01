package Practice.Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args){
        String s = "abcdaefgh";
        System.out.println(longestSubString(s));
    }
    public static int longestSubString(String s){
        Set<Character> st = new HashSet<>();
        int max = 0;
        int left = 0, right = 0;

        while(right < s.length()){
            char c = s.charAt(right);
            if(!st.contains(c)){
                st.add(c);
                right++;
                max = Math.max(max, right-left+1); // a b c d a e
            }else{
                st.remove(c);
                left++;
            }
        }
        return max;

    }
}
