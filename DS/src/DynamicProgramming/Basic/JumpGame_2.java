package DynamicProgramming.Basic;
//Jump Game II is a classic greedy problem.
//We’re finding the minimum number of jumps needed to reach the last index from the first index.


//Maintain:
//jumps → how many jumps we’ve made so far.
//currentEnd → the farthest index reachable with the current jump.
//farthest → the farthest index reachable with the next jump.

//As you iterate:
//Update farthest based on current index and jump length.
//If you reach currentEnd,
// that means the current jump’s reach is over → increment jumps and update currentEnd to farthest.
public class JumpGame_2 {
    public static void main(String [] args){
        int [] nums = new int[]{2,3,1,1,4};
        System.out.println(totalJumps(nums));
    }

    public static int totalJumps(int [] nums){
        int n = nums.length;
        int farthest = 0;
        int currentEnd = 0;
        int jumps = 0;

        for(int i = 0; i<n; i++){
            // Update the farthest index reachable from this index
            farthest = Math.max(farthest, i+nums[i]);

            // If we've reached the end of the range for the current jump
            // Update currentEnd to the farthest index reachable so far
            // and increment the jump count
            if(i == currentEnd){
                currentEnd = farthest; // Set new range to the farthest we can go
                jumps++; // Need to take another jump
            }
            // Optimization: if currentEnd already reaches the last index, we can stop
            if(currentEnd >= n){
                return jumps;
            }

        }
        return jumps;

    }}
