package InterviewQuestions.MinimumFlipVariants;

public class MinimumFlipsForNumbers {
    public static void main(String [] args){
        String s = "1111110000";
        System.out.println(minFlipsRequired(s)); // Output: 4
        // Explanation: We can flip the last four '0's to '1's to make the string uniform.

    }

    public static int minFlipsRequired(String s){
        int n = s.length();
        int count0 = 0;
        int count1 = 0;

        char prev = s.charAt(0);
        if(prev == '0'){
            count0++;
        }else{
            count1++;
        }

        for(int i = 1; i<n; i++){
            if(s.charAt(i) == '0'){
                count0++;
            }else{
                count1++;
            }
        }
        return Math.min(count0, count1);

    }

}
