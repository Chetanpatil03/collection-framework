package Streams;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        // example  find elements whose length is more than 3
        List<String> queList = Arrays.asList("Chetan","Patil","Ram","Shyam","August");
        System.out.println(queList.stream().filter(x-> x.length() > 3).toList());

        // 2 : square and sorting

        List<Integer> squareSort = Arrays.asList(5,2,9,1,6);
        squareSort.stream()
        .map(x-> x*x)
        .sorted()
        .toList()
        .forEach(x-> System.out.print(x+" "));

        // 3 : find sum
        List<Integer> integers = Arrays.asList(1,5,17,59,37,59);
        System.out.println("\nSum : "+
            integers.stream().reduce(1, Integer::sum)
        );

        

    }
}
