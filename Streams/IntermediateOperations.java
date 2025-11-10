package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.event.ListDataEvent;

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


        // 5. Limit:
        // Returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.
        // to limit the infinte stream
        // ex. 
        // long count = Stream.iterate(1, x -> x+1)
        // .peek(System.out::println)
        // .limit(1500) //->>> limit output to 1500
        // .count();
        // System.out.println(count); //---->>> infinite to finite 

        // 6. Skip
        // remaining elements of this stream after discarding the first n elements of the stream
        // take n --> first elements to skip
        Long l = Stream.iterate(1, x -> x+1)
        .limit(1000)
        .skip(15)
        .count();

        System.out.println(" count : "+l);
        

        // 7. peek()
        // takes consumer(@FunctionalInterfaces)

        Stream.iterate(1, x -> x+1)
        .skip(15)
        .peek(System.out::println)
        .limit(100)
        .count();   

        // 8. flatMap

        List<List<String>> fruits = Arrays.asList(
            Arrays.asList("Mango","Banana"),
            Arrays.asList("Apple","Kiwi"),
            Arrays.asList("Pear","Grapes")
        );

        // flaten this list convert to uppercase and make it one list

        System.out.println(

            fruits.stream().flatMap(x-> x.stream())
            .map(String::toUpperCase)
            .toList()
        );

        // example two--> 

        List<String> sentenses = Arrays.asList(
            "Hello world",
            "Java streams are useful",
            "Flatmap are good to have"
        ); //--> [MANGO, BANANA, APPLE, KIWI, PEAR, GRAPES]

        // flatten it and also convert to list

        System.out.println(

        sentenses.stream()
        .flatMap(sentense -> Arrays.stream(sentense.split(" ")))
        .map(String::toUpperCase)
        .toList()
        ); // --> [HELLO, WORLD, JAVA, STREAMS, ARE, USEFUL, FLATMAP, ARE, GOOD, TO, HAVE]  

        
        


        // example  find elements whose length is more than 3
        List<String> queList = Arrays.asList("Chetan","Patil","Ram","Shyam","August");

        System.out.println(queList.stream().filter(x-> x.length() > 3).toList());


        Stream<String> stream2 = queList.stream()
        .map(String::toUpperCase);
        stream2.forEach(System.out::println); // stream2 --> consumed it can not be reused

        // Note :: --> we can not reused a stream after terminal operation has been called 
        // if we try to do this
        //List<String> list2 = stream.map(String::toUpperCase).toList(); //--> java.lang.IllegalStateException: thrown by compiler
        
        // soln 
        
        List<String> list2 = queList.stream().map(String::toUpperCase).toList();
        System.out.println(list2);




    }
}
