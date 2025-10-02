package Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Nine {

    // 36. **Sum of All Elements**
    public static int sum(ArrayList<Integer> list){
        int sum = list.stream().reduce(0, (a,b) -> a+b);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum : "+sum(new ArrayList<>(Arrays.asList(12,25,7,5,96,799,656,56,75))));
    }

// 36. **Sum of All Elements**
//     Calculate and print the sum of all numbers in an `ArrayList`.

// 37. **Find Common Elements in Three Lists**
//     Given three `ArrayList`s, print the elements common to all three.

// 38. **Remove Null Values**
//     Remove all `null` values from an `ArrayList`.

// 39. **Reverse Without Built-in Function**
//     Reverse the `ArrayList` manually (without using `Collections.reverse()`).

// 40. **Find Longest String**
//     From an `ArrayList` of Strings, find the one with the maximum length.
}
