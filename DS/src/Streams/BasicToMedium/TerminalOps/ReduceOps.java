package Streams.BasicToMedium.TerminalOps;

import java.util.List;

public class ReduceOps {
    public static void main(String[] args){
        // reduce → Combine all elements into a single result using the provided binary operation.
        // It takes two parameters: an identity value and a BinaryOperator function.
        // The identity value is the initial value for the reduction and also the default result if the
        // stream is empty.
        // The BinaryOperator function defines how two elements are combined.




        List<Integer> list = List.of(1,2,3,4,5,6);
        int sum = list.stream().reduce(0, (a,b) -> a+b);
        // here 0 is the identity value and (a,b) -> a+b is the BinaryOperator function
        // which adds two integers.
        // So, the reduction process will start with 0 and then add each element of the stream to it.
        // The final result will be the sum of all elements in the stream.
        System.out.println("Sum is : "+sum);
    }
}
