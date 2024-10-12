package Streams;
import java.util.*;

public class StreamsBasic {
    public static void main(String[] args){
        System.out.println("Hey Folks");
        List<Integer> l = Arrays.asList(2,4,5,10,15,24,25);
        l.stream()
                .filter(x -> x%2 == 0) // Filters the List "l" on the basis of the
                //condition provided i.e. x%2==0 (in the above case)
                //it'll only allow elements pass which satisfy the above condition
                .filter(x -> x > 0) // Filters on condition x is greater than 0
                .forEach(System.out::println);
    }
}
