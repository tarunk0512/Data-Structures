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

        //Count Strings that starts with 'a'
        List<String> listString = List.of("apple", "banana", "avocado", "grape", "apricot");
        countWordsStartingwithA(listString);

        //Sum of Numbers
        sumOfNums(nums);

        //Maximum Number in the List
        maxNumberInTheList(nums);
    }

    public static void maxNumberInTheList(List<Integer> list){
        long max = list.stream()
                .max((a,b) -> a.compareTo(b)) // .max((a,b) -> a.compareTo(b)) also works
                // .max(Integer::compareTo) also works
                .orElseThrow(); // to handle the case when the list is empty
        System.out.println("Max number is : "+max);

        list.stream()
                .max((a,b) -> a.compareTo(b))
                .ifPresent(n -> System.out.println("Max number is : "+n));
    }

    public static void sumOfNums(List<Integer> list){
        int sum = list.stream()
                .reduce(0,(a,b)->(a+b));
        System.out.println("Sum is : "+sum);
    }

    public static void countWordsStartingwithA(List<String> list){
        long count = list.stream()
                .filter(s -> s.startsWith("a"))
                .count();
        System.out.println("Count of words starting with 'a': " + count);
        List<String> words = list.stream()
                .filter(s1 -> s1.startsWith("a"))
                .toList(); // .collect(Collectors.toList()) also works
        System.out.println("And the words are : "+words);

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

        list.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
    }
}
