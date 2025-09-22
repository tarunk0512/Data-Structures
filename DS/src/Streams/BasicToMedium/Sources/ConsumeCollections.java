package Streams.BasicToMedium.Sources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Use List.of(...) when you need an immutable list (safe constants, configs).
// Introduced in Java 9.
//Creates an immutable list.
//
//Use Arrays.asList(...) when you want a list view of an array and may want to
// modify values but not the size. : Exists since Java 1.2

public class ConsumeCollections {
    public static void main(String [] args){
        List<Integer> list = List.of(1,2,3,4,5);
        List<String> names = List.of("Tarun", "Kashyap");


        list.stream().forEach(System.out::println);

        names.stream().forEach(System.out::println);
        Stream.of("Tarun", "Kashyap", "Directly", "from stream").forEach(System.out::println);

    }

}
