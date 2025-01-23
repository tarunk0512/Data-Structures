package LeetCodeDS.Stacks;

import java.util.Stack;

public class DecodeString {
    public static void main(String [] args){
        String s = "3[a]2[bc]";
        System.out.println(decodedString(s));
    }
    public static String decodedString(String s){
        Stack<Integer> num = new Stack<>();
        Stack<Character> str = new Stack<>();
        Stack<Character> braces = new Stack<>();
        for(int i = 0 ;i < s.length(); i++){
            if(s.charAt(i) == '['){

            }
        }
        return "";
    }
}
