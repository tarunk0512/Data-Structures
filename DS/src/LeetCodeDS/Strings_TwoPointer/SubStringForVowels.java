package LeetCodeDS.Strings_TwoPointer;

import java.util.Set;

public class SubStringForVowels {
    public static void main(String[] args){
        String s = "leetcode";
        int k = 3;
        System.out.println(maxVowels(s,k));
    }
    public static int maxVowels(String s, int k) {
        int max = 0;
        int count = 0 ;
        for(int i = 0; i< k; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        if(count == k ) return k;
        max = count;
        int j = k;
        for(int i = 0; i< s.length()-k; i++){
            if(isVowel(s.charAt(i))){
                count--;
            }
            if(isVowel(s.charAt(j))){
                count++;
            }
            j++;

            max = Math.max(count,max);
            if(count == k) return k;
        }
        return max;
    }
    public static Boolean isVowel(Character s){
        Set<Character> hset = Set.of('a','e','i','o','u');
        if(hset.contains(s)){
            return true;
        }else{
            return false;
        }
    }
}
