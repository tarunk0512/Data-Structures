package LeetCodeDS.String;

public class ValidPalindrome {
    public static void main(String [] args){
        String s = "A man, a plan, a canal: Panama";
        ValidPalindrome v = new ValidPalindrome();
        System.out.println(v.isPalindrome(s));
    }

    public boolean isPalindrome(String s){
        String output = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       if(output.isEmpty()){return true;}
       StringBuilder s1 = new StringBuilder(output);
        StringBuilder s2 = new StringBuilder(output);
        s2.reverse();
        if(s1.compareTo(s2) == 0){
            return true;
    }else {
            return false;
        }
}

}
