package Streams.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3_SquareNumber {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> square = list.stream()
                .map(e -> e*e)
                .filter(e -> e> 5)
                        .collect(Collectors.toList());
        //.toList();
        //square.add(56);

        double avg = list.stream()
                        .map(n -> n*n)
                                .filter(n -> n>15)
                                        .mapToInt(n ->n)
                                                .average().getAsDouble();

        System.out.println("Sqaure is : "+square);
        System.out.println("Average is : "+ avg);


    }
}
