package LeetCodeDS.String;

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
