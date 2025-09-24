package InterviewQuestions.BalanceString;

import java.util.Stack;

public class DeletionsRequired {
    //5. Minimum Deletions to Make String Valid

    public static void main(String [] args){
    String s = ")())()))()";
        System.out.println(deletionsRequired(s));

    }

    public static int deletionsRequired(String s){
        int n = s.length();
        int del = 0;
        Stack<Character> st = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == ')' && st.isEmpty()){
                del++;
            }else if(c == '('){
                st.push(c);
            }else if(c == ')' && st.peek() == '('){
                st.pop();
            }




        }

        while(!st.isEmpty()){
            st.pop();
            del++;
        }
        return del;
    }
}
