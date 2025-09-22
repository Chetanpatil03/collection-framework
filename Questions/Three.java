package Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Three {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(15,27,9,2,6,8,16,6,2,5,1,24,5,6,2,4,95));
        System.out.println("List : "+numbers);


        //eigth
        numbers.sort(null);

        System.out.println("List : "+numbers);

        // ten
        Integer[] arrInteger = numbers.toArray(new Integer[0]);
        int[] arr = Arrays.stream(arrInteger).mapToInt(Integer::intValue).toArray();

        System.out.println("Array : ");
        for (int i : arr) {
            System.out.print(i+", ");
        }

        


    }
}

// -- 8. **Sort an ArrayList**
//    Sort an `ArrayList` of integers in ascending order.

// 10. **Convert ArrayList to Array**
//     Convert an `ArrayList` of Integers into a regular array.
