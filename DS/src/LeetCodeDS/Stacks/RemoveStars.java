package LeetCodeDS.Stacks;

import java.util.Stack;

public class RemoveStars {
    public static void main(String [] args){
     String s = "lee*tco*de*is*fun";
     System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i)=='*'){
                st.pop();
            }else{
            st.push(s.charAt(i));
        }
        }
        StringBuilder str = new StringBuilder();
        while(!st.empty()){
            str.append(st.pop());
        }
        str.reverse();
        return str.toString();
    }
}
