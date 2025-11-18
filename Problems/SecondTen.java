
/*
11. Write a program to find the smallest element in an array.
12. Write a program to sort an array in ascending order.
13. Write a program to find the GCD of two numbers.
14. Write a program to check if a number is prime.
15. Write a program to generate Fibonacci series up to n terms.
16. Write a program to swap two numbers without using a temporary variable.
17. Write a program to find the length of a string.
18. Write a program to convert Celsius to Fahrenheit.
19. Write a program to count the number of words in a sentence.
20. Write a program to remove all white spaces from a string.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class SecondTen {
    // question-- 11
    public static int smallestElement(int []arr){
       int min = 0;
       for (int i : arr) if (i < min) min = i;
       return min;
    }

    // way two -- find out smallest element in array
    public static int smallestEle(Integer []arr){
        int min = new ArrayList<Integer>(Arrays.asList(arr)).stream().min(null).get();
        return min;
    }

    public static void main(String[] args) {
        
    }
}
