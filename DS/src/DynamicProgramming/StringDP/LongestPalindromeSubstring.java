package DynamicProgramming.StringDP;

public class LongestPalindromeSubstring {
    //Find the longest palindromic substring (contiguous) in a string s.
//Key idea: a palindrome “mirrors” around its center.

    public static void main(String [] args){
        String s = "aba";
        int len = getSubstringLength(s);
        System.out.println(len);
    }


    public static int getSubstringLength(String s){
        int n = s.length();
        if(n<1) return 0;
        int finLen = 0;
        for(int i = 0; i< n; i++){
            int len1 = getSize(s, i, i);
            int len2 = getSize(s, i, i+1);
            int length = Math.max(len1, len2);
            finLen = Math.max(length, finLen);

        }
        return finLen;
    }
    public static int getSize(String s, int left, int right){

        while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        //abacabe
        //
        return right-left-1;
        //After loop ends:
        //left = -1, right = 5
        //The real palindrome is from left+1 = 0 to right-1 = 4.
        //Its length = right-1 - (left+1) + 1 = right - left - 1.

    }
}
