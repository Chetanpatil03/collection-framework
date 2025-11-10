package Streams;
import java.util.Arrays;
import java.util.List;
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
        
        List<String> list = Arrays.asList("Chetan","Prafulla","Dipak","Nikhil");
        Stream<String> stream = list.stream().filter(x -> x.startsWith("C"));
        // not filterd cause no terminal operations.

        // terminal 
        long res = stream.count();
        // equivalent to --> 
        // list.stream().filter(x-> x.startsWith("C")).count();
        System.out.println("Res :"+res);
    }
}
