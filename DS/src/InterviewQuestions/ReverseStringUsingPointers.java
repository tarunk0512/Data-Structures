package InterviewQuestions;

public class ReverseStringUsingPointers {
    // Reverse String using Two Pointers

    public static void main(String [] args){
        String s = "Tarun";
        char [] chars = s.toCharArray();
        System.out.println(reverseStringUsingTwoPointers(chars));

    }

    public static String reverseStringUsingTwoPointers(char [] chars){
        int left = 0;
        int right = chars.length - 1;

        while(left<right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);

    }
}
