package DynamicProgramming.Basic;
//You have a staircase with n steps.
//You can:
//Jump 1 step at a time, OR
//Jump 2 steps at a time.
//You need to find how many different ways you can reach the top.


public class ClimbingStairs {
    public static void main(String [] args){
        int n = 5;
        System.out.println(countStairs(n));
        System.out.println(countStairsBottomUp(n));

    }

    public static int countStairs(int n){
        if(n == 0) return 1;
        if( n< 0) return 0;

        return countStairs(n-1) + countStairs(n-2);

    }

    public static int countStairsBottomUp(int n){
        if(n<=2){  // If you have only 1 step, there’s only 1 way (just climb it).
            return n; //If you have 2 steps, there are 2 ways:
                      //1. Climb both steps at once.
                      //2. Climb one step, then the other.
        }
        int [] dp = new int[n+1]; //dp[i] = number of ways to climb i steps.
        //We make it n+1 because we want to store from dp[0] to dp[n].
        // i.e Valid indexes = 0 to n ✅
        //This gives us storage for every step count from 0 steps up to n steps.
        dp[1] = 1; // 1 step → 1 way
        dp[2] = 2;//2 steps → 2 ways
        // We store them, so the code doesn’t have to figure them out later.
        for(int i =3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

        //Option 1: You came from step (i-1), so you had to climb 1 step.
        //Ways to get to (i-1) = dp[i-1].
        //Option 2: You came from step (i-2), so you had to climb 2 steps.
        //Ways to get to (i-2) = dp[i-2].
        //Since both options are possible, total ways = dp[i-1] + dp[i-2].
//        Option 1 → Last Jump Was 1 Step
//        You were on Step (i-1) a moment ago.
//        From there, you took exactly 1 step to get here.
//        The number of ways you could have reached Step (i-1) is already stored in dp[i-1].
//          Every one of those ways can now be extended by 1 step to reach Step i.
//
//                Option 2 → Last Jump Was 2 Steps
//        You were on Step (i-2) a moment ago.
//        From there, you took a big 2-step jump to reach here.
//        The number of ways you could have reached Step (i-2) is stored in dp[i-2].
//
//        Every one of those ways can now be extended by a 2-step jump to reach Step i.
//
//                Putting it Together
//        You have two independent ways to arrive at Step i:
//
//        From Step (i-1) → dp[i-1] ways
//
//        From Step (i-2) → dp[i-2] ways
//
//        Since these are separate possibilities (and don’t overlap),
//                Total ways to reach Step i = dp[i-1] + dp[i-2].
//
//                Example with Step 4
//        Let’s say you know:
//
//        dp[3] = 3 ways to reach Step 3
//
//        dp[2] = 2 ways to reach Step 2
//
//        To get to Step 4:
//
//        From Step 3 (last jump = 1 step) → 3 ways
//
//        From Step 2 (last jump = 2 steps) → 2 ways
//        So total = 3 + 2 = 5 ways.


    }
}
