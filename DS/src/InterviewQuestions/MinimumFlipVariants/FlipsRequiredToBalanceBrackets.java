package InterviewQuestions.MinimumFlipVariants;

public class FlipsRequiredToBalanceBrackets {
    public static void main(String [] args){
        String s = "{{{}";
        System.out.println(flipsForBracket(s));

    }

    public static int flipsForBracket(String s){
        int n = s.length();

        int balance = 0;
        int flips = 0;

        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '{'){
                balance++;
            }else{ // when current char is '}'
                if(balance>0){
                    balance--; // we had an open brace, so match it
                }else{
                    // we DON’T have an open brace to match
                    flips++;  // flip this '}' into '{'
                    balance++;   // now treat it as if it’s an unmatched '{'

                }

            }
        }
        flips = flips + balance/2;
        return flips;



    }
}
