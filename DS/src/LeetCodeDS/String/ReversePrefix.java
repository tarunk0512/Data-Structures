package LeetCodeDS.String;

import java.util.Stack;

//
//Input: word = "abcdefd", ch = "d"
//Output: "dcbaefd"
//Explanation: The first occurrence of "d" is at index 3.
//Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
public class ReversePrefix {
    public static void main(String[] args){
        String s = "abcdefd";
        char ch = 'd';
        System.out.println(reverseWord( s, ch));
    }
    public static String reverseWord(String s, char ch){
        int flag = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)== ch){
                flag = i;
                break;
        }

    }
        String sub = s.substring(0, flag+1);
        String rest = s.substring(flag+1, s.length());
        StringBuilder str = new StringBuilder(sub);
        str.reverse();
        return str +rest;

}

}
