package Practice.Strings.Easy;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class NonRepeatingChar {

    //Find First Non-Repeating Character

    public static void main(String [] args){
        String s = "aleealtbcozde";
        System.out.println(firstNonRepeatingChar(s));
    }

    public static char firstNonRepeatingChar(String s){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }

        }
        return '1';
    }

}
