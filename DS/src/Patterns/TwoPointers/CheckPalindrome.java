package Patterns.TwoPointers;

public class CheckPalindrome {
    public static void main(String [] args){
        String s = "abcba"; //Output : true
        // String s = "abca"; //Output : false
        // String s = "a"; //Output : true
        // String s = "aa"; //Output : true
        // String s = "ab"; //Output : false
        System.out.println("Is String palindrome : " + checkPalindrome(s));

    }


    public static Boolean checkPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        if(s.length() == 1){
            return true;
        }

        while(left<right){
            if(s.charAt(left) == s.charAt(right)){
                right--;
                left++;
            }else{
                return false;
            }

        }
        return true;
    }
}
