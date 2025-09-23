package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamSum {
    public static void main(String[] args) {
        List<Product> p = new ArrayList<Product>();
        p.add(new Product(1, "Dell", 25000));
        p.add(new Product(2, "HP", 20000));
        p.add(new Product(3, "Apple", 35000));
        p.add(new Product(4, "Lenovo", 23000));

        int totalPrice = p.stream()
                .map(n -> n.price)
                .reduce(0, Integer::sum);
        //(n1,n2) -> n1+n2) this is lambda
        // and equivalent to Integer::sum
        System.out.println(totalPrice);

        long count = p.stream()
                .filter(n -> n.price >23000)
                .count();
        System.out.println(count);
    }
}
