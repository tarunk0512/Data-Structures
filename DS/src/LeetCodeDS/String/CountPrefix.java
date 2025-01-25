package LeetCodeDS.String;

import java.util.Arrays;

public class CountPrefix {
    public static void main(String[] args){
        String s = "aa";
        String [] words = {"a","a"};//{"a","b","c","ab","bc","abc"};
        System.out.println(countPrefix(s, words));
    }

    public static int countPrefix(String s, String[] words){
        int count = 0;
        for(String word : words){
           if(s.startsWith(word)){
               count++;
           }
        }
        return count;
        }
}
