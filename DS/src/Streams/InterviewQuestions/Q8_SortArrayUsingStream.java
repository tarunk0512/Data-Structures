package Streams.InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q8_SortArrayUsingStream {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(3,4,5,1,23,8,45,7,2,10,56,12);
        List<Integer> ascList = list.stream()
                .sorted().toList();
        System.out.println(ascList);

        List<Integer> descList = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(descList);

    }
}
