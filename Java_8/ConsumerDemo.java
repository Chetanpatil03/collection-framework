package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> printX = x -> System.out.println("Value of X : "+x);
        printX.accept(51);

        Consumer<List<Integer>> printList = x -> {
            for (Integer i : x) {
                System.out.print(i+" ");
            }
        };

        printList.accept(Arrays.asList(15,27,5,9,751,5,5,56,98,5,256,857));

        System.out.println("AndThen ----------");
        Consumer<Integer> printY = y -> System.out.println("Value of v is : "+y);
        printX.andThen(printY).accept(154);
    }
}
