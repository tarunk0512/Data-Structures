package LeetCodeDS.String;

public class PrefixOfArray {
    public static void main(String[] args){
        String s = "aa";
        String [] words = {"aa","aaa","fjaklfj"};
        System.out.println(checkPrefix(s, words));
    }
    public static Boolean checkPrefix(String s, String[] words){
        String w = "";
        for(String word : words){
            w = w+word;
            if(w.equals(s)){
                return true;
            }
        }
        return false;
    }
}
