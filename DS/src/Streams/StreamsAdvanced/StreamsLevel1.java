package Streams.StreamsAdvanced;

import Streams.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsLevel1 {
    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };
    public static void main(String [] args){
        Employee [] emp1 =  arrayOfEmps;
        String s = Arrays.toString(emp1);
        Employee [] emp = Employee.arrayOfEmps;

      //  System.out.println(s);//emp[0].getId());
        List<Employee> empList = Arrays.asList(arrayOfEmps);
        //empList.forEach(e -> System.out.println(e.getName()));
        Stream<Employee> empStream = Stream.of(arrayOfEmps);
        //empStream.forEach(n -> System.out.println(n.getName()));

        List<String> nameEmp = Stream.of(arrayOfEmps)
                .filter(e -> e!=null)
                .filter(e -> e.getSalary() > 19999)
                .map(e -> e.getName())
                .collect(Collectors.toList());
        System.out.println(nameEmp);
    }
}
