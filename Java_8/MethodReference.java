package Java_8;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
        // method reference
        // replacement for lambda expression making it more easier
        // use method without involving and in place of lambda expression

        // ex : forEach

        List<String> students = Arrays.asList("Chetan","Prafulla","Dipak","Prakash");
        // lambda : 
        students.forEach(x-> System.out.println(x));
        // method reference
        students.forEach(System.out::println);


        
    }
}