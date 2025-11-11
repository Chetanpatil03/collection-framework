package Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsExamples {
    public static void main(String[] args) {
        // solving questions using Collectors
        // 1.collecting names by length

        List<String> names = Arrays.asList("Alice","Bob","Charlie","Dean","Anna","Brian");
        System.out.println( "Collecting names by length :: "+
            names.stream()
            .collect(Collectors.groupingBy(x -> x.length()))
        );


        // counting world occurance in sentense
        String str = "hello world is hello world java is good ";
        System.out.println("Frequency of words in sentense :: "+
            Arrays.stream(str.split(" "))
            .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
        );

        // 3. Partitioning Even and Odd
        List<Integer> numbers = Arrays.asList(1,5,2,6,8,4,9,57,68);
        System.out.println( "Even and Odd partition :: "+
            numbers.stream()
            .collect(Collectors.partitioningBy(x-> x%2 ==0))
        );

        // 4. Sum the values of map
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple", 15);
        map.put("Banana", 5);
        map.put("Cherry", 9);
        map.put("DragenFruit", 17);

        System.out.println( "Sum of all map values :: "+
            map.values().stream()
            .collect(Collectors.summingInt(x->x))
        );

        // 5. Creating map from stream

        List<String> list = Arrays.asList("Apple","Banana","Cherry","Dragon Fruit","Grapes");
        System.out.println( "Creating map from Stream :: "+
            list.stream()
            .collect(Collectors.toMap(x-> x.toUpperCase(), x-> x.length()))
        );

        // 6. Counting frequency of elements in a list
        list = Arrays.asList("Apple","Banana","Cherry","Dragon Fruit","Apple","Grapes","Banana","Cherry","Apple","Cherry");

        System.out.println("Counting frequency of elements in list :: "+
            list.stream()
            .collect(Collectors.toMap(k -> k, v -> 1,(x,y) -> x+y))
        );
    }
}
