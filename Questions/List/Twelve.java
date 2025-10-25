package List;

import java.util.ArrayList;
import java.util.Arrays;

public class Twelve {

    // * 51. **Partition into Even and Odd Lists**
    public static ArrayList<Integer> splitList(ArrayList<Integer> ls){
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        for (Integer i : ls) {
            if (i % 2 == 0) {
                evens.add(i);
            } else {
                odds.add(i);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(evens);
        result.addAll(odds);
        return result;
    }
    
    // 52. **Remove Elements Greater Than X**
    public static ArrayList<Integer> cleanList(ArrayList<Integer> ls,int a){
        ArrayList<Integer> cleanList = new ArrayList<>();
        for (Integer i : ls) {
            if (i > a) {
                continue;
            }
            else{
                cleanList.add(i);
            }
        }
        
        return cleanList;
    }
    
    // 53. **Replace Negative Numbers with Zero**
    public static ArrayList<Integer> negativeHandledList(ArrayList<Integer> ls){
        ArrayList<Integer> cleanList = new ArrayList<>();

        for (Integer i : ls) {
            if (i < 0) {
                cleanList.add(0);
            }
            else{
                cleanList.add(i);
            }
        }

        return cleanList;
    }

    
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.addAll(Arrays.asList(7,77,29,-25,5,0,-7,-67,25,957,695,35,14,45,50,94));

        System.out.println("orignal : "+arrayList);
        System.out.println("Cleaned list : "+cleanList(arrayList, 77));

        System.out.println("Negative element handled :: "+negativeHandledList(arrayList));

        System.out.println("Splitted List :: "+splitList(arrayList));
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