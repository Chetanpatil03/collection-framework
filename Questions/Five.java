package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Five {
    public static void main(String[] args) {
        // Find max and min in ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12,95,49,5,67,51,37,64,69,27,51,57,53,37,55,17));

        int min = list.get(0);
        int max = list.get(0);

        for (Integer integer : list) {
            if (min > integer) {
                min = integer;
            }
            if (max < integer) {
                max = integer;
            }
        }

        System.out.println("Max value : " + max);
        System.out.println("Min value : " + min);

        // Convert array to ArrayList
        int[] arr = {15, 48, 95, 35, 75};

        ArrayList<Integer> arrList = new ArrayList<>();
        for (int num : arr) {
            arrList.add(num);
        }
        System.out.println("ArrayList from array: " + arrList);

        // Convert to List<Integer> using streams
        List<Integer> arrayList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(arrayList);

        ArrayList<Integer> mergedArrayList = new ArrayList<>(list);
        mergedArrayList.addAll(arrList);

        System.out.println("Merged List : "+mergedArrayList);
    }
}

// 16. **Merge Two ArrayLists**
//     Merge two `ArrayList`s of integers into a single list.

// 18. **Find Maximum and Minimum Values**
//     Find the max and min values in an `ArrayList` of integers.

// 20. **Convert Array to ArrayList**
//     Convert a regular array of integers into an `ArrayList`.