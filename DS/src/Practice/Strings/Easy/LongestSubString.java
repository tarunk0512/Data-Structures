package Practice.Strings.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args){
        String s = "abcdaefgh";
        System.out.println(longestSubString(s));
        System.out.println(getLongestSubString3(s));
    }
    public static int longestSubString(String s){
        Set<Character> st = new HashSet<>();
        int max = 0;
        int left = 0, right = 0;

       while(right < s.length()){
           while(st.contains(s.charAt(right))){
               st.remove(s.charAt(left));
               left++;
           }
           st.add(s.charAt(right));
           max = Math.max(max, right - left + 1);
           right ++;
       }
        return max;

    }
    //Longest SubString
// Input : abcdabcefgabc;
// Output : 6 - efgabc


    public static int getLongestSubString2(String s){
        int left = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        //set.add(s.charAt(0));

        for(int right = 0; right < s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }


    //Longest SubString without repeating
// Input : abcdabcefgabc;
// Output : 6 - efgabc


    public static int getLongestSubString3(String s){
        int left = 0, right = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right-left+1);
            right++;
        }
        return max;

    }
}
