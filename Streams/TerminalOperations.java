package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
        // Terminal operations 
        // -- >to generate result from streams , wheather it can be stream , list, Integer, set etc
        // ex -> count, reduce, collect, etc

        // 1. Collect
        // --> collect element to send them in another formate
        // take Collector/Collectors as input
        // can use --> toList(), toSet(), toString();

        // ex : 
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> reverseSorted = list.stream()
        .sorted((x,y) -> y - x)
        // .collect(Collectors.toList())
        .toList();

        System.out.println(reverseSorted);

        // 2. forEach --> loop to iterate the collection
        // takes consumer

        list.forEach(x -> System.out.print(x + " "));
        System.out.println();
        list.forEach(System.out::print);

        // 3. Reduce 
        // --> combine elements to produce a single statement (result)
        // take BinaryOperator(@Functional Operator) --> BiFunction

        
        Optional<Integer> sum = list.stream()
        // .reduce((x,y) -> x + y);
        .reduce(Integer::sum);

        System.out.println("\n\nSum : "+sum.get());

        // 4. Count
        System.out.println(list.stream().filter(x-> x % 2 ==0).count());

        // 5. anyMatch(), allMatch(), noneMatch()
        // --> short-circuit methods 
        // as soon as they find something they stop processing/ execution
        
        // anymatch()
        boolean a = list.stream()
        .anyMatch(x-> x%2 == 0);
        System.out.println(a); // --> true cause 2 is even

        // allMatch()
        boolean b = list.stream()
        .allMatch(x -> x > 0);
        System.out.println(b); //--> true cause every element is greater than 0

        // noneMatch()
        boolean c = list.stream()
        .noneMatch(x-> x < 0);
        System.out.println(c); //--> true cause no element is less that 0

        // findFirst(), findAll()
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findFirst().get());

        
        



    }
}
