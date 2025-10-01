package Practice.Strings.Easy;

public class CheckPalindrome {
    public static void main(String [] args){
        String s = "racecara";
        System.out.println(isPalindrome(s));
    }

    public static Boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(right > left){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;

            }else{
                return false;
            }
        }
        return true;

    }

}
