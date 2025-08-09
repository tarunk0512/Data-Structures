package DynamicProgramming.Basic;

public class ClimbingStairs {
    public static void main(String [] args){
        int n = 5;
        System.out.println(countStairs(n));
        System.out.println(countStairsBottomUp(n));

    }

    public static int countStairs(int n){
        if(n == 0) return 1;
        if( n< 0) return 0;

        int num = countStairs(n-1) + countStairs(n-2);
        return num;

    }

    public static int countStairsBottomUp(int n){
        if(n<=2){
            return n;
        }
        int [] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i =3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];


    }
}
