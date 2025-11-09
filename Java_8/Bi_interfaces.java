package Java_8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Bi_interfaces {
    public static void main(String[] args) {
        // we also have Bi @functionInterfaces
        // ex --> 
        // BiPredicate --> BiPredicate<T,U>  --> will take two inputs but return boolean value
        // BiConsumer --> BiConsumer<T,U> --> will take two input does not return anything
        // BiFunction --> BiFunction<T,U, R> --> will take two input(T,U) and return third type of value (R)

        // BiPredicate
        // methods are same as Predicate
        // test(), and(), or(), negate()
        BiPredicate<Integer,Integer> isEven = (x,y) -> (x+y) % 2==0;
        System.out.println("Is Even [14,16] : "+isEven.test(14,16));

        // BiConsumer
        // methods are same as BiConsumer
        // accept(), andThen()
        BiConsumer<Integer,Integer> print = (x,y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        print.accept(14,19);

        // BiFunction
        // methods are same as Function
        // apply(), andThen(), compose(), identity()
        BiFunction<String,String,Integer> length = (x,y) -> (x+y).length();

        System.out.println("Length : "+length.apply("Chetan", "Bachchhav"));


        // for shorthand java has BinaryOperator and TernaryOperator which extends Function (@FunctionalInterface)

        // UneryOperator
        UnaryOperator<Integer> square = s -> s*s;
        System.out.println("Unary operator : "+square.apply(12));

        // BinaryOperator ---> short hand for BiFunction
        BinaryOperator<Integer> multi = (x,y) -> x*y;
        System.out.println("Binary operator : "+multi.apply(15, 66));

        

    }
}
