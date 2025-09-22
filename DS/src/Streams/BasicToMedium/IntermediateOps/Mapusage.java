package Streams.BasicToMedium.IntermediateOps;

import java.util.Arrays;
import java.util.List;

//map → Transform each element with the given conversion function

public class Mapusage {
    public static void main(String [] args){
        List<String> strList = Arrays.asList("Hello", "my", "name", "tarun");

        strList.stream().map(String :: toUpperCase).forEach(System.out::println);
        strList.stream().map(String::length).forEach(System.out::println);
        strList.stream().map(n -> n + " 1").forEach(System.out::println);
        strList.stream().map(n -> n.length()>3).forEach(System.out::println);
        strList.stream().map(n -> n.length()>3 ? n + " is long" : n + " is short").forEach(System.out::println);
    }

}
