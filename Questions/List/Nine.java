package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nine {

    // 36. **Sum of All Elements**
    public static int sum(ArrayList<Integer> list){
        int sum = list.stream().reduce(0, (a,b) -> a+b);
        return sum;
    }

    public static ArrayList<Integer> commonEle(List<Integer> list1,List<Integer> list2,List<Integer> list3){
        ArrayList<Integer> commonElements = new ArrayList<>();
        for (Integer i : list1) {
            for (Integer j : list2) {
                for (Integer k : list3) {
                    if ((i==j&&j==k) & !commonElements.contains(i)) {
                        commonElements.add(i);
                    }
                }
            }
        }

        return commonElements;
    }

    //39 
    public static  List<Integer> reverseList(List<Integer> list){
        int n = list.size();
        for (int i = 0; i < n/2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(n-1-i));
            list.set((n-1-i), temp);
        }

        return list;
    }

    public static String longestString(ArrayList<String> list){
        String temp = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > temp.length()) {
                temp = list.get(i);
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        System.out.println("Sum : "+sum(new ArrayList<>(Arrays.asList(12,25,7,5,96,799,656,56,75))));

        System.out.println("Original "+Arrays.asList(12,25,28,29,27));
        System.out.println("Reveresed : "+reverseList(Arrays.asList(12,25,28,29,27)));

        ArrayList<Integer> common = commonEle(Arrays.asList(15,67,9,695,3466,25), 
        Arrays.asList(15,27,96,25,97,65),Arrays.asList(15,27,67,25));
        System.out.println("Common between Three lists : "+common);

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Chetan","Chudaman","Bachchhav"));
        System.out.println("List elements : "+list);
        System.out.println("Longest string : "+longestString(list));
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
