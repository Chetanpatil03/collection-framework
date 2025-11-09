package Streams;

import java.util.Arrays;
import java.util.List;

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
    }
}
