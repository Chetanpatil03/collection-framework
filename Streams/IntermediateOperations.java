package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        // Intermediate operations : 
        // transform stream into another stream .
        // they are lazy which means they don't execute until a terminal operation is invoked.
        // operations : filter, map, reduce

        // 1. Filter
        // to filter out elements from stream
        // takes Predicate as parameter
        // example : 
        
        List<String> list = Arrays.asList("Chetan","Prafulla","Dipak","Chetan","Prafulla","Nikhil");
        Stream<String> stream = list.stream().filter(x -> x.startsWith("C"));
        // not filterd cause no terminal operations.

        // terminal 
        long res = stream.count();
        // equivalent to --> 
        // list.stream().filter(x-> x.startsWith("C")).count();
        System.out.println("Res :"+res);

        // 2. Map operation : 
        List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Original : "+ list);
        System.out.println("Mapped   : "+collect);

        // 3. Sorted 
        // used to sort the collection in natural as well as custome manner
        // take Comparator as input

        Stream<String> sorted = list.stream().sorted();
        Stream<String> sortedWithComparator = list.stream().sorted((a,b) -> a.length() - b.length());

        System.out.println(sorted.collect(Collectors.toList()));
        System.out.println(sortedWithComparator.collect(Collectors.toList()));

        // 4. Distinct
        // return stream of unique elements
        // does not take any 
        // can be applied after filter

        List<String> collect2 = list.stream().distinct().collect(Collectors.toList());
        Long distinctWithFilter = list.stream()
        .filter(x-> x.toLowerCase().startsWith("c"))
        .distinct()
        .count();

        System.out.println("Distinct elements : "+collect2);
        System.out.println("Count : "+distinctWithFilter);

        
    
    }
}
