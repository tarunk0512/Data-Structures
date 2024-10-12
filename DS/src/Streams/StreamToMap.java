package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamToMap {
    public static void main(String[] args) {
        List<Product> p = new ArrayList<Product>();
        p.add(new Product(1, "Dell", 25000));
        p.add(new Product(2, "HP", 20000));
        p.add(new Product(3, "Apple", 35000));
        p.add(new Product(4, "Lenovo", 23000));

        Map<Integer, String> mp = p.stream()
                .filter(n -> n.price > 23000)
                .collect(Collectors.toMap(n -> n.id, n -> n.name));
        System.out.println(mp);
    }
}