package Practice.Strings.Medium;

import java.util.LinkedHashMap;
import java.util.Map;

public class CompressString {
    public static void main(String [] args){
        String s = "aabbaacc";
        System.out.println(compressString(s));
        String s2  = "aabbaaccdd";
        System.out.println(compressString2(s2));
        String s1 = "aaabbccdd";
        System.out.println(getCompressedString(s1));
    }
   // String Compression (Run-Length Encoding)
    //Input: "aaabbccc" → Output: "a3b2c3"

    public static String compressString(String s){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
    return sb.toString();
    }

    //“Compress the string by replacing consecutive repeating characters with character + count.”
//✅ They want RLE → "a2b2a2"

    public static String compressString2(String s){
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= s.length(); i++){
            if(i < s.length() && s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                sb.append(s.charAt(i-1)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }

    //Compress String
//Input  : aaabbccdd
//Output : a3b2c2d2

    public static String getCompressedString(String s){
        int count = 1;
        StringBuilder s1 = new StringBuilder();
        for(int i = 1; i <= s.length(); i++){
            if(s.length() > i && s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                s1.append(s.charAt(i-1)).append(count);
                count = 1;
            }
        }
        return s1.toString();
    }



}
