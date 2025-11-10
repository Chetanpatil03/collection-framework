package Streams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        // Collectors are utility classes like --> Arrays, Collections
        // provide various kind of methods to create common collectors
        // ex. --> toList(), toSet() etc

        //  1. Collecting to list
        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        List<String> res = names.stream()
        .filter(name -> name.startsWith("A"))
        .collect(Collectors.toList());

        res.forEach(System.out::println);


        // 2. Collecting to set
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Set<Integer> set= numbers.stream().collect(Collectors.toSet());
        System.out.println("2 ::");
        set.forEach(System.out::println);

        // 3. Collecting to specifice Collection
        // ex--> ArrayDeque

        // ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(x-> new ArrayDeque<String>()));

        // 4. Joining string --.> concatinates streams elements into a single string
        // ex ->
        String conncatenatedNames = names.stream()
        .map(String::toUpperCase)
        .collect(Collectors.joining(","));
        System.out.println("4 ::: "+conncatenatedNames);

        // 5. Summarizing Data
        // generates statistical summary (count, sum , min ,max, average)

        List<Integer> numbers_1 = Arrays.asList(1,2,5,5,2,5,53,5);
        IntSummaryStatistics stats = numbers_1.stream()
        .collect(Collectors.summarizingInt(x->x));
        System.out.println("5 ::");
        System.out.println("Count :: "+stats.getCount());
        System.out.println("Sum :: "+stats.getSum());
        System.out.println("Min :: "+stats.getMin());
        System.out.println("Average :: "+stats.getAverage());
        System.out.println("Max :: "+stats.getMax());


        // 6. calculating averages
        Double avg = numbers_1.stream()
        .collect(Collectors.averagingInt(x->x));
        System.out.println("6 ::: average : "+avg);

        // 7. Counting elements
        long count = numbers_1.stream()
        .collect(Collectors.counting());

        System.out.println("7 ::: Count :: "+count);

        // 8. Grouping elements
        System.out.println("8 :: ");
        List<String> words = Arrays.asList("hello","world","java","streams","collecting");

        System.out.println(words.stream()
        .collect(Collectors.groupingBy(String::length)));
        System.out.println(words.stream()
        .collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println(words.stream()
        .collect(Collectors.groupingBy(String::length, Collectors.counting())));
       
        TreeMap<Integer,Long> treeMap = words.stream()
        .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);


    }
}
