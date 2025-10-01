package Practice.Strings.Easy;

public class ReverseAString {
    public static void main(String [] args){
        String s = "hello";
        System.out.println(reverseString(s));
    }
    public static String reverseString(String s){
        int left = 0;
        int right = s.length() - 1;
        char [] ch = s.toCharArray();


        while(right > left){
            char temp = s.charAt(left);
            ch[left] = s.charAt(right);
            ch[right] = temp;
            right--;
            left++;

        }
        return new String(ch);
    }

}
