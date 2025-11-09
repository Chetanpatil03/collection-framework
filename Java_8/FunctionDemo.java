package Java_8;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        // Function --> @FunctionalInterface
        // does some work ---> Takes some input and returns something 
        // have abstract method --> apply()

        Function<Integer,Integer> doubleIt = x -> 2 * x;
        System.out.println("Double it : "+doubleIt.apply(24));
        
        //have default methods --> 
        // andThen() and compose()
        
        Function<Integer,Integer> tripleIt = x -> 2 * x;
        System.out.println("Triple it : "+tripleIt.apply(24));

        System.out.println("[one - AndThen- two]First double then triple [20] : "+doubleIt.andThen(tripleIt).apply(20));
        System.out.println("[two-AndThen- one]First triple then double [20] : "+tripleIt.andThen(doubleIt).apply(20));

        System.out.println("[Compose] first TRIPLE then DOUBLE"+doubleIt.compose(tripleIt).apply(300));

        // have static method --> identity
        // Function.identity()   --> output == input
        // give same output as input

        Function<Integer,Integer> identity = Function.identity();
        System.out.println("Identity [20] : "+identity.apply(20));

    }
}
