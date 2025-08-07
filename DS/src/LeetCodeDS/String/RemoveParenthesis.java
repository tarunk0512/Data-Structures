package LeetCodeDS.String;
//Remove Outermost Parentheses
public class RemoveParenthesis {
    public static void  main(String[] args) {
        String s = "(()())(())";
        RemoveParenthesis rp = new RemoveParenthesis();
        System.out.println(rp.removeOuterParentheses(s));
    }
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0 ;
        for(char c : s.toCharArray()){
            if(c == '('){
                if(count > 0){
                    sb.append(c);
                }
                count++;
            }
            else {
                count --;
                if(count > 0){
                    sb.append(c);
                }

            }
        }
        return sb.toString();
    }
}
//Example Walkthrough:
//Input: (()())(())
//Let’s go character by character:
//
//Char	Count Before	Action	Count After	Result
//        (	0	Don't add (outermost)	1
//        (	1	Add	         	        2   (
//        )	2	Subtract → add		    1   ()
//        (	1	Add		                2   ()(
//        )	2	Subtract → add		    1   ()()
//        )	1	Subtract → don’t add	0	()()
//        (	0	Don't add	            1	()()
//        (	1	Add		                2   ()()(
//        )	2	Subtract → add		    1   ()()()
//        )	1	Subtract → don’t add	0	()()()
