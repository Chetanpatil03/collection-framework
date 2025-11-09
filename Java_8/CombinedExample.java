package Java_8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CombinedExample {
    public static void main(String[] args) {
        
        // using all the functional interfaces 

        Predicate<Integer> isEven = x -> x % 2 ==0;
        Function<Integer,Integer> function = x-> x * x;
        Consumer<Integer> consumer = x-> System.out.println("Value of x :"+x);
        Supplier<Integer> getX = () -> 150;

        if (isEven.test(getX.get())) {
            consumer.accept(function.apply(getX.get()));
        }
        else System.out.println("odd number");

    }
}
