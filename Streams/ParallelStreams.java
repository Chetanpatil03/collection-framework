package Streams;

import java.util.List;
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
    }

    public static long factorial(int x){
        long res = 1;
        for (int i = 2; i <= x ; i++) {
            res *= i;
        }
        return res;
    }
}
