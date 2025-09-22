package Streams.BasicToMedium.Sources;

import java.util.Arrays;
//✔ names.stream() → creates a stream from a list.
//✔ Terminal op: forEach prints elements.

public class ConsumeArray {
    public static void main(String [] args){
        String [] strAr = {"hello", "my", "Name", "is", "tarun"};
        Character [] charAr = {'a', 'b', 'c', 'd', 'e'};
        int [] intAr = {1,2,3,4,5,6};

        Arrays.stream(strAr).
                forEach(System.out::println);
        Arrays.stream(charAr).
                forEach(System.out::println);

        Arrays.stream(intAr).forEach(System.out::print);
    }
}

