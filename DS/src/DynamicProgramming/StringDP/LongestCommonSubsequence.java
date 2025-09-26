package DynamicProgramming.StringDP;

public class LongestCommonSubsequence {
    public static void main(String [] args){
        String s1 = "aceg";
        String s2 = "abcdefg";
        System.out.println(getLongestCommonSubsequence(s1,s2));
        System.out.println(longestSubSequence(s1,s2));

    }

    public static int getLongestCommonSubsequence(String s1, String s2){
        int s1Length = s1.length();
        int s2Length = s2.length();
        int [][] dp = new int[s1Length+1][s2Length+1];

        for(int i = 1; i<=s1Length; i++){
            for(int j = 1; j<=s2Length; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }

            }
        }
        return dp[s1Length][s2Length];

    }
    public static int longestSubSequence(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int [][] dp = new int[n+1][m+1];

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }

            }
        }
        return dp[n][m];
    }

}
