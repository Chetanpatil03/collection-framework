package Java_8;

import java.util.function.Predicate;

public class PredicateDemo {
    // it is function interface which is boolean valued function
    // it holds the condition in variable (Function programming)

    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(9)); //false
        System.out.println(isEven.test(16)); //true

        // example two 
        // public boolean Test(T t); --> Predicate definition
        // can take any type of argument --> Integer, String, Double, Float, Boolean etc.

        Predicate<String> startsWithC = x -> x.toLowerCase().startsWith("c");

        System.out.println("Starts with c : "+startsWithC.test("Chetan")); //true
        
        Predicate<String> endsWithN = x -> x.toLowerCase().endsWith("n");
        System.out.println("Ends with n"+endsWithN.test("Chetan")); //true
        
        // can combine multiple predicates using and(),or() negate() method inbuilt by predicate
        
        Predicate<String> and = startsWithC.and(endsWithN);
        Predicate<String> or = startsWithC.or(endsWithN);
        Predicate<String> negate = startsWithC.negate();
        
        System.out.println("Starts with c AND ends with n [Chetan]" + and.test("Chetan"));
        System.out.println("Starts with c AND ends with n [Chetu]" + and.test("Chetu"));
        System.out.println("Starts with c OR ends with n [Chetu]"+or.test("Chetu"));
        System.out.println("[Negation] Starts with c {Prafulla}"+negate.test("naresh"));
        
    }
}
