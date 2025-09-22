package Streams.BasicToMedium.IntermediateOps;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//a) filter → Keep only items that match condition

public class FilterUsage {
    public static void main(String [] args){
        List<String> strList = List.of("Hello", "my", "name", "tarun");
        //Prints strings with length > 4 and collects them into a set to avoid duplicates
        //Output : [Hello, tarun]
        Set<String> str = strList.stream().filter(n -> n.length()>4).collect(Collectors.toSet());
        System.out.println(str);


        strList.stream().filter(n -> n.length()>3).forEach(System.out::println);
    }

}
