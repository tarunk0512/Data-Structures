package DynamicProgramming.StringDP;

public class LongestCommonSubString {
    // Longest Common Substring
// String s1 = "abcde", s2 = "abfde";
// System.out.println(longestCommonSubstring(s1, s2)); // Output: 2 ("ab")

    public static void main(String [] args){
        String s1 = "abcde";
        String s2 = "abfde";
        System.out.println(getLongestSubString(s1,s2));
    }

    public static int getLongestSubString(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        int [][] dp = new int[n+1][m+1];
        int result = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    result = Math.max(result, dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }

            }

        }
        return result;
    }
}
