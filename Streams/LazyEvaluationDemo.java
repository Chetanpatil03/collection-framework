package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationDemo {

    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alice","Bob","Charlie","David");

        Stream<String> stream = names.stream()
        .filter(name -> {
            System.out.println("Filtering : "+name);
            return name.length() > 3;
        });

        System.out.println("Before terminal operation");

        List<String> filtered = stream.toList();

        System.out.println("After terminal operation");
        System.out.println(filtered);
        
        
        
        // Lazy evaluation (or lazy computation) means that the evaluation of an expression is delayed until its value is actually needed. In Java streams, operations are divided into two categories:

        // Intermediate Operations (Lazy)
            // filter(), map(), flatMap(), etc.
            // These operations don't execute immediately
            // They build up a pipeline of operations

        // Terminal Operations (Eager)
            // collect(), toList(), forEach(), count(), etc.
            // These trigger the actual execution of the pipeline
    }
}