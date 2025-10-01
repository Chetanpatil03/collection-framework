package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Eight {

    public static int countFrequency(ArrayList<Integer> l,int element){
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>(l);
        while (list.contains(element)) {
            count++;
            list.remove(Integer.valueOf(element));
        }

        return count;
    }



    // 31. **Find Frequency of All Elements**
    public static void frequencyAll(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Frequency of "+list.get(i)+" : "+countFrequency(list, list.get(i)));
        }
    }

    // 33. **Print Duplicate Elements**
    public static ArrayList<Integer> duplicateElements(ArrayList<Integer> l){

        ArrayList<Integer> list = new ArrayList<>();

        for (Integer i : l) {
            if (countFrequency(list, i) >= 2) {
                list.add(i);
            }
        }

        return list;
    }

    //34. **Find Unique Elements**

    public static void uniqueElement(ArrayList<Integer> l){

        ArrayList<Integer> uniqueElement = (ArrayList) l.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique elements : "+uniqueElement);
    }





    public static void main(String[] args) {
        //problem number 35

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        
        //problem number 35
        System.out.println("Before    : "+list);
        list.sort((a,b) -> b - a);
        System.out.println("After   : "+list);
        
        frequencyAll(list);
        
        list.addAll(Arrays.asList(3,7,8,10));
        System.out.println("list : "+list);
        frequencyAll(list);
        System.out.println("Duplicates elements : "+duplicateElements(list));

        uniqueElement(list);
        
        

    }
}

// 31. **Find Frequency of All Elements**
//     Print the frequency of each element in an `ArrayList` (no libraries).

// 32. **Check if ArrayList is Palindrome**
//     Check whether the elements in an `ArrayList` form a palindrome.

// 33. **Print Duplicate Elements**
//     Print only the elements that appear more than once in an `ArrayList`.

// 34. **Find Unique Elements**
//     Print elements that appear **only once** in an `ArrayList`.

// 35. **Sort in Descending Order**
//     Sort an `ArrayList` of integers in **descending** order.
