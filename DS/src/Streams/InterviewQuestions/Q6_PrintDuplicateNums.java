package Streams.InterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class Q6_PrintDuplicateNums {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,5,3,66,7,3,1);
        Set<Integer> l = list.stream().filter(n -> Collections.frequency(list, n)>1).collect(Collectors.toSet());
        // We donot use .toList() as it'll save all the elements which are duplicate :
        // if we use .toList() : output will be = [1, 3, 5, 5, 3, 3, 1]
        System.out.println(l);

        // -=-=-=-=-=-=-Alternate Approach=-=-=-=-=-=-=-=-=-=-=-=-= //
        Set<Integer> dupNum = new HashSet<>();
        Set<Integer> dup = list.stream()
                .filter(n -> !dupNum.add(n))// Acts as a conditional Statement : If true then collect
                .collect(Collectors.toSet()); // if false then stop at line 15
        System.out.println(dup);
//        Set<Integer> dup1 = list.stream()
//                .filter(n -> !dupNum.add(n))// Acts as a conditional Statement : If true then collect
//                .collect(Collectors.toSet());
//               // .toList(); // if false then stop at line 15
//        System.out.println(dup1);
    }
}
