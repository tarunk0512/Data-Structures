package Practice.Stream;

import java.util.Comparator;
import java.util.List;

public class PracMedium {
    public static void main(String[] args) {
        List<String> list = List.of("animal", "bird", "humans");
        longestWord(list);
        getLongestWord(list);

    }

    public static void longestWord(List<String> list){
        list.stream()
                .reduce((a,b)-> a.length() > b.length() ? a :b)
                .ifPresent(System.out::println);

        list.stream()
                .max((a,b) -> a.length() -b.length())
                .ifPresent(System.out::println);

        list.stream()
                .max(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);
    }

    public static void getLongestWord(List<String> list){
        list.stream()
                .reduce((a,b) -> a.length() > b.length() ? a : b)
                .ifPresent(System.out::println);
        list.stream().reduce((a,b) -> a.length() > b.length() ? a : b).ifPresent(System.out::print);
        list.stream().max((a,b) -> a.compareTo(b)).ifPresent(n -> System.out.print("Longest Word :- "+n));
        //.max((a, b) -> a.length() - b.length())
        //max finds the maximum element using a comparator.
        //Comparator here subtracts lengths:
        //If result > 0 → a is longer.
        //If result < 0 → b is longer.
        //If result = 0 → equal.
        //Internally, stream picks the "max" based on this comparison.

        //list.stream().max((a,b) -> a.length() - b.length()).ifPresent(System.out::println);


    }


}
