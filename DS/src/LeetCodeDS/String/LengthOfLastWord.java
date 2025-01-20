package LeetCodeDS.String;

public class LengthOfLastWord {
    public static void main(String[] args){
        String s = "Hello World";
        System.out.println(lengthLastWord(s));
    }
    public static int lengthLastWord(String s){
        //s = s.trim();
        int length = 0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                length++;
            }else{
                break;
            }
        }
        return length;
    }
}
