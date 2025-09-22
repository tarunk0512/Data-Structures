package Streams.BasicToMedium.Sources;

import java.util.Arrays;
import java.util.List;

public class ConsumeCollections {
    public static void main(String [] args){
        List<Integer> list = List.of(1,2,3,4,5);

        list.stream().forEach(System.out::println);
    }

}
