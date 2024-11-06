package Streams.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Misc_AvergaeLengthOfString {
    public static void main(String[] args){
        List<String> words = Arrays.asList("one", "two", "three", "four");

        OptionalDouble avg = words.stream().mapToInt(String :: length).average();
        System.out.println(avg.getAsDouble());

    }
}
