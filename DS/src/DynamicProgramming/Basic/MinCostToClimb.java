package DynamicProgramming.Basic;
//You have a staircase.
//Each step has a price tag (cost) you must pay if you step on it.
//You can climb either:
//1 step at a time
//2 steps at a time
//Your goal: Reach the top spending as little money as possible.
public class MinCostToClimb {
    public static void main(String [] args){
        int [] cost = {10, 15, 20};
        System.out.println(totalCost(cost));
    }

    public static int totalCost(int [] cost){
        int n = cost.length;
        int [] dp = new int[n+1];
        dp[0] = 0; // dp[0] = 0 → Before you start (ground floor) costs nothing.
        dp[1] = 0; // dp[1] = 0 → You can also start from step 1 directly without paying for step 0.
        //For each step i, that'll be starting from step 2:
        //You could have arrived here(at step 2) from:
        //Step (i-1) i.e step 1 → pay the cost of step i-1 plus whatever it cost to reach step (i-1).
        //Step (i-2) i.e step 0→ pay the cost of step i-2 plus whatever it cost to reach step (i-2).
        // for step 2, you could have arrived from step 1 or step 0.
        //So, you take the minimum of the two options.
        // from step 1 : cost to reach step 1 = 0 + cost[i-1] = 15; since i =2;
        //VS
        // from step 0 : cost to reach step 0 = 0 + cost[i-2] = cost[0] = 10; since i =2;
        for(int i = 2;i<=n; i++){
            dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2]+cost[i-2]);

        }

        return dp[n];

    }

}
