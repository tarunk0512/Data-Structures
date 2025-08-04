package LeetCodeDS.String;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String [] args){
        String s = "paper";
        String t = "title";
        IsomorphicString is = new IsomorphicString();
        System.out.println(is.isIsomorphic(s,t));
    }
    public boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> map = new HashMap<>();
        for(int i =0; i< s.length(); i++){
            if(map.containsKey(s.charAt(i))&& map.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
            map.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }
}
