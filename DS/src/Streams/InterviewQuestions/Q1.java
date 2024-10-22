package Streams.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q1 {
    public static void main(String [] args){
        List<Integer> ar = Arrays.asList(1,4,5,6,7,8,9);
        Optional<Integer> sum = ar.stream().reduce((a,b) -> a+b);
        System.out.println(sum.get());
    }
}
