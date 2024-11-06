package Streams.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Test {
    public static void main(String[] args){
        List<String> words = Arrays.asList("one", "two", "three", "four");

        List<Integer> numWithTwo = words.stream()
                        .map(n -> Integer.valueOf(n))
                                .toList();
        System.out.println(numWithTwo);

    }
}
