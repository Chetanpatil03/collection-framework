package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {
        // Parallel stream
        // enables parallel processing in stream, normal streams work sequentially
        // it allows multiple threads to process parts of the stream simultaneously.
        // this can significantly increases the performance for larger data sets.
        // work in distributed manner

        //sequential stream

        long start = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x+1).limit(20000).toList();
        List<Long> factorialList = list.stream().map(ParallelStreams::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by sequential stream : "+(endTime - start) + " ms");

        // parallel streams

        start = System.currentTimeMillis();
        factorialList = list.parallelStream().map(ParallelStreams::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by parallel stream : "+(endTime - start) + " ms");

        // parallel streams are effective when we want to do CPU-intensive tasks or large dataset where task are independent
        // distributed processing is needed
        // parallel may add overhead for simple task or small datasets


        // cumulative sum --> [1,2,3,4,5] --> [1,3,6,10,15]
        // it rely on sequantial manner --> which is taks are dependent 
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = numbers.parallelStream()
        // List<Integer> cumulativeSum = numbers.parallelStream().sequential() --> converting parallel to sequential
        // List<Integer> cumulativeSum = numbers.stream()
        .map(sum::addAndGet)
        .toList();

        System.out.println("Expected result : [1,3,6,10,15] :: "+cumulativeSum); //Expected result : [1,3,6,10,15] :: [15, 14, 12, 9, 5] --> ParallelStreams

        // if we want this result we need to use sequantial() or normal streams
        
    }

    public static long factorial(int x){
        long res = 1;
        for (int i = 2; i <= x ; i++) {
            res *= i;
        }
        return res;
    }
}
