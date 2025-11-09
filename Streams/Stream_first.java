package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_first {
    public static void main(String[] args) {
        
        // a sequece of elements which supports multiple operations
        // used to apply functional and declarative approaches.
        // simplify data processing less code and enhance readabality and maintainability

        // ex streams counting even in list : 

        List<Integer> list = Arrays.asList(1,3,68,67,59,64,28,37,19,285,14);
        list.forEach(x-> System.out.print(x+", "));

        // traditional approaches
        int count = 0;
        for (Integer integer : list) {
            if (integer % 2 ==0) {
                count ++;
            }
        }
        
        System.out.println("\nEven count : "+count);

        // using streams : 
        System.out.println(list.stream().filter(x -> x%2==0).count());


        // Way to create streams
        // 1. using collections
        Stream<Integer> stream = list.stream();

        // 2. From Arrays
        int []arr = {15,8,16,14,7,8,51,56,14};
        IntStream stream2 = Arrays.stream(arr);

        // 3. Using Stream.of()
        Stream<String> stream3 = Stream.of("chetu","c","x","y");

        // 4. Infinite streams using Stream.generate() --> limit function
        Stream<Integer> stream4 = Stream.generate(()-> 1).limit(100);

    }
}
