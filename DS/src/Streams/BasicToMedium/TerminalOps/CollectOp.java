package Streams.BasicToMedium.TerminalOps;
//Terminal Operations
//These end the stream pipeline and produce a result.

import java.util.List;
import java.util.stream.Collectors;

public class CollectOp {
    public static void main(String [] args){
        List<String> list = List.of("Cat", "Dog", "Mat");

        List<String> newList = list.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        //newList.add("Fish"); // UnsupportedOperationException because the list created by List.of is immutable
        // To make it mutable, we can use new ArrayList<>(...) or use Collectors.toCollection
        //List<String> newList = list.stream().map(n -> n.toUpperCase()).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(newList);

    }

}
