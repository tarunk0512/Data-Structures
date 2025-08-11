package DynamicProgramming.Basic;
// Given an array of non-negative integers, where each element represents the maximum jump length at that position,
 // determine if you can reach the last index starting from the first index.
 // You can assume that you can always reach the last index if you start from the first index.
 // EG : [2,3,1,1,4] -> true (can jump to 4) -> you'll jump from 2(index 0) to 1(index 2),
// then index 2 to index 3, and finally index 3 to index 4
 // EG : [3,2,1,0,4] -> false (cannot reach 4)
public class JumpGame_1 {
    public static void main(String [] args){
        int [] jumps = new int[]{3,2,1,0,4};
        System.out.println(canReach(jumps));
    }

    public static Boolean canReach(int [] jumps){
        int maxReach = 0;
        for(int i = 0; i<jumps.length; i++){
            if(i>maxReach){
                return false;
            }

            maxReach = Math.max(maxReach, i+jumps[i]);
        }

        if(maxReach>=jumps.length){
            return true;}
return true;
    }
}
