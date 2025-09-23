package Streams.BasicToMedium.TerminalOps;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MiscTerminalOps {
    public static void main(String [] args){
        // a) count → Returns the count of elements in the stream
        // b) findFirst → Returns the first element in the stream wrapped in an Optional
        // c) anyMatch → Returns true if any element matches the given predicate
        // d) allMatch → Returns true if all elements match the given predicate
        // e) noneMatch → Returns true if no elements match the given predicate
        // f) forEach → Performs an action for each element in the stream

        //A> Count Function
        List<String> words = List.of("apples", "bananas", "cherrys");
        long count = words.stream().count();
        System.out.println("Count of elements : "+count);

        //B> findFirst Function - returns an Optional
        Optional<String> first = words.stream().findFirst();
        first.ifPresent(System.out::println);
        System.out.println(first.orElse("No value found"));

        //C> anyMatch Function - returns boolean
        boolean hasBanana = words.stream().anyMatch( n -> n.equals("bananas"));
        boolean hasCat = words.stream().anyMatch(n1 -> n1.equals("cat"));
        System.out.println("List has banana : "+hasBanana); // returns True
        System.out.println("List has Cat : "+hasCat); // returns False


        //D> allMatch Function - returns boolean
        boolean allHaveA = words.stream().allMatch(n -> n.contains("a"));
        boolean allHaveS = words.stream().allMatch(n -> n.contains("s"));
        System.out.println("All elements have 'a' : "+allHaveA); // returns Flase
        System.out.println("All elements have 's' : "+allHaveS); // returns True

        //E> noneMatch Function - returns boolean - no elements match the given predicate
        boolean noneHaveX = words.stream().noneMatch(n -> n.contains("x"));
        boolean noneHaveA = words.stream().noneMatch(n -> n.contains("a"));
        System.out.println("No elements have 'x' : "+noneHaveX); // returns True
        System.out.println("No elements have 'a' : "+noneHaveA); // returns False


        //F Max and Min Function - returns Optional
        List<Integer> nums = List.of(5,3,8,1,4);
        Optional<Integer> max = nums.stream().max(Integer::compareTo);
        Optional<Integer> min = nums.stream().min(Integer::compareTo);
        System.out.println("Max is : "+max.orElse(-1));
        System.out.println("Min is : "+min.orElse(-1));


        List<String> strings = List.of("apple", "bananas", "cherry");
        Optional<String> str = strings.stream().max(Comparator.comparingInt(String::length));
                //.max((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Max string is : "+str.orElse("No value"));


    }
}
