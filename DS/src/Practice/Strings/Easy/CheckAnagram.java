package Practice.Strings.Easy;

import java.util.HashMap;

public class CheckAnagram {
public static void main(String [] args){
    String s1 = "listena";
    String s2 = "silent";
    System.out.println(checkAnagram(s1, s2));
}

    //Check Anagram
//Input: "listen", "silent" → true
    //In Anagram check, first we will count the frequency of each character in first string and
    // store it in a map and then we will iterate through the second string and decrease the frequency of each character
    // in the map. If at any point frequency becomes less than 0 or character is not found in the map, we will return false.
// Finally, we will check if all frequencies are 0, if yes then return true else false.


    public static Boolean checkAnagram(String s1, String s2){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
        }

        for(int i = 0; i < s2.length(); i++){
            if(map.containsKey(s2.charAt(i)) && map.get(s2.charAt(i)) >= 1){
                map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
            }else{
                return false;
            }
        }
        if(map.containsValue(1)) return false;

        return true;
    }



}
