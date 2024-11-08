package Streams.InterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class Q6_PrintDuplicateNums {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,5,3,66,7,3,1);
        Set<Integer> l = list.stream().filter(n -> Collections.frequency(list, n)>1).collect(Collectors.toSet());
        System.out.println(l);

        // -=-=-=-=-=-=-Alternate Approach=-=-=-=-=-=-=-=-=-=-=-=-= //
        Set<Integer> dupNum = new HashSet<>();
        Set<Integer> dup = list.stream()
                .filter(n -> !dupNum.add(n))// Acts as a conditional Statement : If true then collect
                .collect(Collectors.toSet()); // if false then stop at line 15
        System.out.println(dup);
    }
}
