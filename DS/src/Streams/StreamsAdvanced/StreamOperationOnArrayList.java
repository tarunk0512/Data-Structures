package Streams.StreamsAdvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationOnArrayList {
    public static void main(String [] args){
        List<Integer> arl = new ArrayList<>();
        arl.add(1);
        arl.add(2);
        arl.add(3);
        Integer [] ar = {2,2,5,8,5,6,8,10,14,18,15,19,22,21};
        arl = Arrays.asList(ar);
        System.out.println(arl);
        List<Integer> l = arl.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());
    System.out.println(l);
    }
}
