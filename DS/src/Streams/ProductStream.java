package Streams;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductStream {
    public static void main(String [] args){
        List<Product> p = new ArrayList<Product>();
        p.add(new Product(1,"Dell", 25000));
        p.add(new Product(2, "HP", 20000));
        p.add(new Product(3, "Apple", 35000));
        p.add(new Product(4, "Lenovo", 23000));
        Stream<Product> ps = p.stream();
        ps.forEach(n -> System.out.println(n.id));

        List<Product> psList = p.stream().toList();//toList();

        List<Product> productStream = p.stream()
                .filter(n -> n.price > 24000)
                //.map(n -> n.)
                .toList();
        System.out.println(productStream);
        //productStream.forEach(n -> System.out.println(n.name));

        List<Integer> price = p.stream()
                .filter(n -> n.price>23000)
                .map(n -> n.price)// Map is used to map the integer value out of ProductObject (n)
                                    // if we donot use map this will throw error as provided value is Product but required is Integer
                .toList();

        System.out.println(price);
        //psList.forEach(n -> System.out.println(n.id));
        //System.out.println(p.stream().toString());
    }
}
