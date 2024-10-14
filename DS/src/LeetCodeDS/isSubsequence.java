package LeetCodeDS;

public class isSubsequence {
    public static void main(String [] args){
        String s ="ace";
        String t = "abcgbe";

        System.out.println(isASubsequence(t,s));
    }
    public static boolean isASubsequence(String t, String s) {
        int n = 0;
        int m = 0;
        while(n < s.length() && m < t.length()){
            if(s.charAt(n) == t.charAt(m)) n++;
            m++;
        }
        return n==s.length();
    }
}
