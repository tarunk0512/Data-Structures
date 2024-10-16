package LeetCodeDS.Stacks;

import java.util.Stack;

public class BackSpaceStringComparator {
    public static void main(String [] args){
        String s = "#b#c#";
        String t = "#b#y#";
        System.out.println(backspaceCompare(s,t));
    }
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> sx = new Stack<>();
        Stack<Character> sy = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='#' && sx.empty()){
                continue;
            }
            if(s.charAt(i)=='#'){
                sx.pop();
            }else{
                sx.push(s.charAt(i));
            }
        }

        for(int i = 0; i<t.length(); i++){
            if(t.charAt(i)=='#' && sy.empty()){
                continue;
            }
            if(t.charAt(i)=='#'){
                sy.pop();
            }else{
                sy.push(t.charAt(i));
            }
        }
        StringBuilder sbs = new StringBuilder();
        StringBuilder sbt = new StringBuilder();
        while(!sx.empty()){
            sbs.append(sx.pop());
        }
        while(!sy.empty()){
            sbt.append(sy.pop());
        }
        String a = sbs.reverse().toString();
        String b = sbt.reverse().toString();
        return a.equals(b);
    }
}
