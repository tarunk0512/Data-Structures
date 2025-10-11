package Practice.Strings.Easy;

public class MaxConsecutiveRepeatingChar {

    //Maximum Consecutive Repeatnig Character
//Input: s = "geeekk"
//Output: e
//Explanation: character e comes 3 times consecutively which is maximum.

//Input: s = "aaaabbcbbb"
//Output: a
//Explanation: character a comes 4 times consecutively which is maximum.
    public static void main(String [] args){
        String s = "geeksforgeeks";
        System.out.println(getLongestRepeatingChar(s));
    }

    public static char getLongestRepeatingChar(String s){
        int n = s.length();
        int maxCount = 1;
        int currCount = 1;
        char res = 0;
        for(int i = 1; i < n; i++){
            if(s.charAt(i-1) == s.charAt(i)){
                currCount++;
            }else{
                currCount = 1;
            }
            if(maxCount < currCount){
                maxCount = currCount;
                res = s.charAt(i);
            }
        }
        return res;
    }

}
