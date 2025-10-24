package List;

import java.util.ArrayList;

public class Twelve {

    public static ArrayList<Integer> cleanList(ArrayList<Integer> ls,int a){
        for (Integer i : ls) {
            if (i > a) {
                ls.remove(i);
            }
        }

        return ls;
    }

    
    public static void main(String[] args) {
        System.out.println("hello world!");
    }
}


/*
 * 51. **Partition into Even and Odd Lists**
    Given a list of integers, separate it into two lists: one with even, one with odd numbers.

52. **Remove Elements Greater Than X**
    Remove all elements from an `ArrayList` that are greater than a given value `X`.

53. **Replace Negative Numbers with Zero**
    In an `ArrayList` of integers, replace all negative numbers with `0`.

54. **Filter Strings Starting with Vowel**
    From an `ArrayList` of strings, print only the ones that start with a vowel.

55. **Create List of Squares from Another List**
    Given an `ArrayList` of integers, create a new list containing the squares of the original elements.
 */