package Streams.BasicToMedium.IntermediateOps;

import java.util.List;

public class FlatMapUsage {
    public static void main(String [] args){


        List<List<String>> nestedList = List.of(List.of("a", "b"), List.of("c","d"));
        nestedList.stream().flatMap(List :: stream).forEach(System.out::println);
        // Output : a b c d

        nestedList.stream()
                .flatMap(n -> n.stream().map(n1 -> n1.toUpperCase()))
                .forEach(System.out::println);
        // Output : A B C D

        List<String> words = List.of("hi", "bye");
        words.stream()
                .flatMapToInt(String::chars) // chars() gives IntStream of Unicode codepoints
                .forEach(System.out::println);
        // Output : 104 105 98 121 101

    }

}
