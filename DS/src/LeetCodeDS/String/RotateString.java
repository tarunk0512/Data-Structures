package LeetCodeDS.String;

public class RotateString {
    public static void main(String [] args){
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
    public static boolean rotateString(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }
        String ss =s+s;
        return ss.contains(goal);
    }
}
