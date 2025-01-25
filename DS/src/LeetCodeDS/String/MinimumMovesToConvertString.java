package LeetCodeDS.String;

//Input: s = "XXOX"
//Output: 2
//Explanation: XXOX -> OOOX -> OOOO
//We select the first 3 characters in the first move, and convert them to 'O'.
//Then we select the last 3 characters and convert them so that the final string contains all 'O's.


public class MinimumMovesToConvertString {
    public static void main(String[] args){
        String s = "XXOX";
        System.out.println(convertString(s));
    }
    public static int convertString(String s){
        int i =0;
        int count = 0;
        while(i < s.length()){
            if(s.charAt(i) == 'X'){
                count++;
                i+=3;
            }else{
                i++;
            }
        }

        return count;
    }
}
