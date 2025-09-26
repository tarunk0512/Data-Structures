package Practice.Stream;

import java.util.List;
import java.util.stream.Collectors;

public class PracBasic {
    public static void main(String[] args) {
        List<String> list = List.of("java", "stream", "api");
        convertToUpperCase(list);
        //Filter Even Numbers
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        filterEvenNumbers(nums);
    }

    public static void filterEvenNumbers(List<Integer> list){
        list.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);

        List<Integer> evenNums = list.stream()
                .filter(n -> n%2 == 0)
                //.map(n ->n *2) multplies all the even numbers by 2
                .toList(); // .collect(Collectors.toList()) also works
        System.out.println(evenNums);
    }

    public static void convertToUpperCase(List<String> list){
        list.stream()
                .map(String::toUpperCase) // .map(n -> n.toUpperCase()) also works
                .forEach(System.out::println);
    }
}
