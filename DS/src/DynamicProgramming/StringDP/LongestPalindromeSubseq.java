package DynamicProgramming.StringDP;

public class LongestPalindromeSubseq {
    public static void main(String[] args) {
        LongestPalindromeSubseq solver = new LongestPalindromeSubseq();
        String s = "bbabcbcab";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(solver.lcs(s,rev)); // 4
    }

    public int lcs(String a, String b) {
        int n = a.length(), m = b.length();
        int[][] dp = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a.charAt(i-1) == b.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}





