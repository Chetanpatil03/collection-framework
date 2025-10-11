package List;

import java.util.ArrayList;
import java.util.Arrays;

public class Six {

    //problem number 24
    public static int secondLargest(ArrayList<Integer> list){

        int largest = list.get(0);
        int seclarge = list.get(0);

        for (Integer integer : list) {
            if (largest <= integer) {
                seclarge = largest;
                largest = integer;
            } else if (seclarge < integer && integer < largest) {
                seclarge = integer;
            }
        }


        return seclarge;
    }

    // problem number 22
    public static int countOccurance(ArrayList<Integer> list, int element) {
        int count = 0;
        for (Integer integer : list) {
            if (element == integer) {
                count++;
            }
        }

        return count;
    }

    //problem number 23
    public static ArrayList<Integer> removeAllOcurrance(ArrayList<Integer> list, int element) {

        ArrayList<Integer> clearList = new ArrayList<>(list);

        while (clearList.contains(element)) {
            clearList.remove(Integer.valueOf(element));
        }

        return clearList;
    }

    //problem number 21
    public static ArrayList<Integer> allIndices(ArrayList<Integer> list, int element) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == element) {
                indices.add(i);
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(15, 65, 961, 69, 75, 678, 25, 67, 942, 67, 827, 15, 65, 95, 67));

        System.out.println("Count of :" + numbers.get(0) + " : " + countOccurance(numbers, numbers.get(0)));
        System.out.println("Before  : " + numbers);
        numbers = removeAllOcurrance(numbers, 15);
        System.out.println("After : " + numbers);

        //problem number 25
        System.out.println("Before swapping  : " + numbers);
        int temp = numbers.get(1);
        numbers.set(1, numbers.get(3));
        numbers.set(3, temp);
        System.out.println("After swapping   : " + numbers);

        System.out.println("All indices of element 67 : " + allIndices(numbers, 67));

        System.out.println("List : "+numbers);
        System.out.println("Second Largest number : "+secondLargest(numbers));
    }
}

// 21. **Find All Occurrences of an Element**
// Find and print all indices where a specific element occurs in an `ArrayList`.

// 22. **Count Occurrences of an Element**
// Count how many times a given element appears in an `ArrayList`.

// 23. **Remove All Occurrences of a Value**
// Remove **all** occurrences of a specific value from an `ArrayList`.

// 24. **Find Second Largest Number**
//     Find the second largest element in an `ArrayList` of integers.

// 25. **Swap Two Elements**
// Swap the elements at index 1 and index 3 in an `ArrayList`.
