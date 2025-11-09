package Java_8;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        // Supplier is also @FunctionalInterface 
        // which does not take any argument/parameter(input) but sure give a return value
        // have only method abstract --> get()
        // can give anything in the return like --> String, Integer, Double, Float etc.


        Supplier<String> getString = () -> "Hello world";
        System.out.println(getString.get());

        Supplier<Integer> getX = () -> 15426;
        System.out.println("Number is : "+getX.get());
    }
}
