package Streams;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        // example  find elements whose length is more than 3
        List<String> queList = Arrays.asList("Chetan","Patil","Ram","Shyam","August");
        System.out.println(queList.stream().filter(x-> x.length() > 3).toList());

        
    }
}
