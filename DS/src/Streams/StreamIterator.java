package Streams;

import java.util.stream.Stream;

public class StreamIterator {
    public static void main(String [] args){
        Stream.iterate(10, n -> n+2)
                .filter(n -> n%5 == 0)
                .limit(5)
                .forEach(System.out::println);
    }
}
//