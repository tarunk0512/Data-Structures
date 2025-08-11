package DynamicProgramming.Basic;

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
