package LeetCodeDS.HashMap;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public static void main(String[] args){
        int num = 3567;
        System.out.println("Converted roman number : "+convertToRoman(num));

    }
    public static String convertToRoman(int num){
            String M[] = {"", "M", "MM", "MMM"};
            String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
        }

    }

