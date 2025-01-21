package LeetCodeDS.HashMap;

import java.util.HashMap;

public class RansomeNote {
    public static void main(String [] args){
        String ransomNote = "aca";
        String magzine = "aabb";
        System.out.println(canConstruct(ransomNote,magzine));
    }

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
}
