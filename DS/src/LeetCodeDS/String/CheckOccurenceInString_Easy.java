package LeetCodeDS.String;

public class CheckOccurenceInString_Easy {
    public static void main(String [] args){
        String sentence = "My name is Tarun";
        String word = "Tar";
        System.out.println(checkOccurence(sentence, word));
    }
    public static int checkOccurence(String sentence, String word){
        String [] str = sentence.split(" ");
        for(int i = 0; i< str.length; i++){
            if(str[i].startsWith(word)){
                return i+1;
            }
        }
        return -1;
    }
}
