package InterviewQuestions.BalanceString;

import java.util.Stack;

public class BalanceParanthesis {
    public static void main(String [] args){
        String s = "([)]"; // false
        // String s = "{[()]}"; // true
        // String s = "{[(])}"; // false
        // String s = "{{[[(())]]}}"; // true
        System.out.println(checkBalance(s));

    }

    public static Boolean checkBalance(String s){
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for(Character c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }else{
                if(st.isEmpty()) return false;

                char top = st.pop();
                if((c == ')' && top != '(')
                   || (c == '}' && top != '{')
                   || (c == ']' && top != '[')){
                    return false;
                }

            }
        }


        return st.isEmpty();
    }
}
