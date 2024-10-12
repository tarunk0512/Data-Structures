package Streams;

import java.util.ArrayList;
import java.util.*;

public class Inheritance {
    public static void main(String [] args){
        int [] ar = {1,0,0,0,1,0,0,1};
        //System.out.println(canPlaceFlowers(ar,2));
        //System.out.println(reverseVowels("IceCreAm"));
        //System.out.println(reverseWords("the sky is blue"));
        int [] arr = {-1,1,0,-3,3};
        int [] resAr = (productExceptSelf(arr));
        System.out.println(Arrays.toString(resAr));
    }

    public static int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] ar = new int[l];
        for(int i = 0; i<l; i++){
           ar[i] = 1;
            }
        int left = 1;
        for(int i =0; i<l; i++){
            ar[i]*=left;
            left*=nums[i];
        }
        int right =1;
        for(int i =l-1; i>=0; i--){
            ar[i]*=right;
            right*=nums[i];
        }
        return ar;
    }





        public static String reverseWords(String s) {
         s = s.trim();
         StringBuilder sb = new StringBuilder();
         StringBuilder res = new StringBuilder();

         for(int i =0; i<s.length(); i++){
             if(s.charAt(i) != ' '){
                 sb.append(s.charAt(i));
             }
             else if(s.charAt(i+1)!=' '){
                 res.insert(0,sb);
                 sb.setLength(0);
                 res.insert(0, " ");
             }
             if(i == s.length()-1){
                 res.insert(0, sb);
             }

         }
         return res.toString();

        }

    public static String reverseVowels(String s) {
        int length = s.length();
        StringBuilder st = new StringBuilder();
        List<Character> l = new ArrayList<>();
        for(int i = 0; i<length; i++){
          if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||
                  s.charAt(i) == 'u'||s.charAt(i) == 'A'||s.charAt(i) == 'E'||s.charAt(i) == 'I'||
                  s.charAt(i) == 'O'||s.charAt(i) == 'U'){
              l.add(s.charAt(i));
          }
        }
        int counter = l.size();
        for(int i = 0; i<length; i++){
            if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||
                    s.charAt(i) == 'u'||s.charAt(i) == 'A'||s.charAt(i) == 'E'||s.charAt(i) == 'I'||
                    s.charAt(i) == 'O'||s.charAt(i) == 'U'){
                st.append(l.get(counter - 1));
                counter--;
            }else{
                st.append(s.charAt(i));
            }
        }


        return st.toString();

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flag = 1;
        int counter = 0;
        for (int j : flowerbed) {
            if (n == counter) {
                return true;
            }
            if (j == 0) {
                flag++;
                if (flag == 3) {
                    flag = 1;
                    counter++;
                }
            } else {
                flag = 0;
            }
        }
        if(flag == 2 ){counter++;}
      return counter == n;
}
}
