package LeetCodeDS.String;

import java.util.Stack;

public class ReverseString {
    public static void main(String [] args){
        String s = "Hello my name is Stark";
        System.out.println(reverseString(s));
    }
    public static String reverseString(String s){
        Stack<String> st = new Stack<>();
        String sb = "";
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                st.push(sb);
                sb = "";
            }else{
               sb = sb + s.charAt(i);
            }
        }
        while(!st.empty()){
            sb = sb + " "+st.pop();
        }
        return sb;
    }
}
