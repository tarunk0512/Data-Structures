package LeetCodeDS.String;

public class CountingWordsWithPrefix {
    public static void main(String[] args){
        String [] words = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(countPrefix(words, pref));
    }

    public static int countPrefix(String [] words, String pref){
        int count = 0;
        for(String word : words){
            if(word.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}
