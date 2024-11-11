package Streams.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q9_LimitGetIgnoreImpl {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,13,14,15);

        List<Integer> l1 = list.stream().limit(5).toList();
        System.out.println(l1);
        //O/P : [1, 2, 3, 4, 5]

        int sum = list.stream().limit(5).reduce((a,b) -> a+b).get(); // Note : .reduce(Integer :: sum) is same as reduce((a,b) -> a+b)
        System.out.println(sum);
        // O/P : 15

        List<Integer> s1 = list.stream().skip(5).toList();
        System.out.println(s1);
        // O/P : [6, 7, 8, 9, 10, 12, 13, 14, 15]

        int sumSkp = list.stream().skip(5).reduce(Integer :: sum).get();
        System.out.println(sumSkp);
        //O/P : 94  (Sum of all number : [6, 7, 8, 9, 10, 12, 13, 14, 15])


    }
}
