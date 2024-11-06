package Streams.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question5_NumberStartingWithTwo {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(2,22,45,34,231,432,62,28,20);

        List<Integer> numWithTwo = list.stream()
                .map(String::valueOf)
                .filter(s -> s.startsWith("2"))
                .map(n -> Integer.valueOf(n))
                //.map(Integer :: valueOf)
                .collect(Collectors.toList());
        System.out.println(numWithTwo);

    }
}
