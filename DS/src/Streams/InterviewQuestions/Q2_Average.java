package Streams.InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class Q2_Average {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(avg);
    }
}
