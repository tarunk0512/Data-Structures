package Practice.Strings.Medium;

import java.util.Stack;

public class LongestValidParanthesis {

    // Longest Valid Paranthesis Length
    public static void main(String [] args){
        String s = "(()";
        System.out.println(getLongestParanthesis(s));
        String s1 = ")()())";
        System.out.println(getLongestParanthesis(s1));
        String s2 = "";
        System.out.println(getLongestParanthesis(s2));
        String s3 = "()(())";
        System.out.println(getLongestParanthesis(s3));
    }

    public static int getLongestParanthesis(String s){
        int max = 0;
        if(s.isEmpty()) return 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i = 0 ; i< s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    max = Math.max(max, i - st.peek());
                }
            }

        }
        return max;
    }










}
