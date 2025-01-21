package LeetCodeDS.HashMap;

import java.util.HashMap;
import java.util.Objects;

public class RansomeNote {
    public static void main(String [] args){
        String ransomNote = "aca";
        String magzine = "aabb";
       // System.out.println(canConstruct(ransomNote,magzine));

        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordMatch(pattern, s));
    }
//https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150
    public static boolean canConstruct(String ransomNote, String magzine){
        HashMap<Character, Integer> dict = new HashMap<>();
        for(int i = 0; i < magzine.length(); i++){
            char c = magzine.charAt(i);
            if(!dict.containsKey(c)){
              dict.put(c,1);
            }else{
                dict.put(c, dict.get(c)+1);
            }
        }

        for(int i = 0; i<ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            if(dict.containsKey(c) && dict.get(c)>0){
                dict.put(c, dict.get(c)-1);
            }else{
                return false;
            }
        }
        return true;

    }

    // https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150
    // |
    // |
    public static boolean wordMatch(String pattern, String s){
        String[] str = s.split(" ");

        if(pattern.length() != str.length){
            return false;
        }
        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        for(int i = 0; i<pattern.length(); i++){
            if(!patternMap.containsKey(pattern.charAt(i))){
            patternMap.put(pattern.charAt(i), str[i]);
            }
            if(!sMap.containsKey(str[i])){
                sMap.put(str[i], pattern.charAt(i));
            }

            }
        for(int i = 0; i<pattern.length(); i++){
            Character c = pattern.charAt(i);
            if(!Objects.equals(patternMap.get(c), str[i]) || !Objects.equals(c, sMap.get(str[i]))){
                return false;
            }

        }
        return true;
    }
}
