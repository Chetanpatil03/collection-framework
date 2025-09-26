package Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Six {

    private static Integer remove;

    //problem number 23
    public static int countOccurance(ArrayList<Integer> list, int element){
        int count = 0;
        for (Integer integer : list) {
            if (element == integer) {
                count++;
            }
        }

        return count;
    }

    public static ArrayList<Integer> removeAllOcurrance(ArrayList<Integer> list, int element){
        
        ArrayList<Integer>clearList = new ArrayList<>(list);

        while (clearList.contains(element)) {
            clearList.remove(Integer.valueOf(element));
        }

        return clearList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(15,65,961,69,75,678,25,67,942,67,827,15,65,95,67));

        System.out.println("Count of :"+numbers.get(0)+" : "+countOccurance(numbers, numbers.get(0)));
        System.out.println("Before  : "+numbers);
        numbers = removeAllOcurrance(numbers, 15);
        System.out.println("After : "+numbers);

        System.out.println("Before swapping  : "+numbers);
        int temp = numbers.get(1);
        numbers.set(1,numbers.get(3));
        numbers.set(3,temp);
        System.out.println("After swapping   : "+numbers);
    }
}

// 22. **Count Occurrences of an Element**
//     Count how many times a given element appears in an `ArrayList`.

// 23. **Remove All Occurrences of a Value**
//     Remove **all** occurrences of a specific value from an `ArrayList`.

// 25. **Swap Two Elements**
//     Swap the elements at index 1 and index 3 in an `ArrayList`.
