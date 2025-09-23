package Streams.BasicToMedium.IntermediateOps;

import java.util.List;

public class SortUsage {
    public static void main(String [] args){
        List<Integer> intList = List.of(1,2,3,2,5,6,3);
        intList.stream()
                .sorted() //ascending order
                .forEach(System.out::println);

        intList.stream()
                .distinct() //removes duplicates
                .sorted() //ascending order
                .forEach(System.out::println);
    }

}
