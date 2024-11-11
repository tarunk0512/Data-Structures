package Streams.InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q10_SecondHighestLowest {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,1,2,3,4,5,56,23,54,65,22,67,7,8);
        int secH = list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(2)
                .skip(1)
                .findFirst().get();
        System.out.println(secH);

        int secHh = list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                //.limit(2)
                .skip(1)
                .findFirst().get();
        System.out.println(secHh);

        // Second Lowest
        int secLow = list.stream()
                .sorted()
                .distinct()
                .skip(1)
                .findFirst().get();
        System.out.println(secLow);


    }
}
