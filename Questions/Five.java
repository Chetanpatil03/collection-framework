package Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Five {
    public static void main(String[] args) {
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

        System.out.println("Max value : "+max);
        System.out.println("Min value : "+min);
    }
}

// 18. **Find Maximum and Minimum Values**
//     Find the max and min values in an `ArrayList` of integers.