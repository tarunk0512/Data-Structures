package Practice.Strings.Easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {

    // Remove All Duplicates
// Input: "banana" → Output: "ban"
    public static void main(String [] args){
        String s = "banana";
        System.out.println(removeAllDups(s));
    }


    public static String removeAllDups(String s1){
        Set<Character> set = new HashSet<>();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < s1.length(); i++){
            if(!set.contains(s1.charAt(i))){
                s.append(s1.charAt(i));
                set.add(s1.charAt(i));
            }
            //set.add(s1.charAt(i));
        }

        return s.toString();
    }

}
