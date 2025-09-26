package Practice.Stream;

import java.util.Comparator;
import java.util.List;

public class PracMedium {
    public static void main(String[] args) {
        List<String> list = List.of("animal", "bird", "humans");
        longestWord(list);

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

}
