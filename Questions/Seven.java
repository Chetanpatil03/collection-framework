package Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Seven {

    // problem number 28
    public static void printEven(ArrayList<Integer> list) {
        System.out.println("Even Numbers : ");
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                System.out.print(" " + integer);
            }
        }
    }

    //problem number 29
    public static void printOdd(ArrayList<Integer> list) {
        System.out.println("Odd Numbers : ");
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                System.out.print(" " + integer);
            }
        }
    }

    public static int square(int n){
        return n * n;
    }

    //problem number 30
    public static ArrayList<Integer> replaceSquare(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            list.set(i, square(temp));
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        printEven(list);
        printOdd(list);

        System.out.println("Normal    : "+list);
        System.out.println("Squared   : "+replaceSquare(list));

    }
}

// -- 25. **Swap Two Elements**
// Swap the elements at index 1 and index 3 in an `ArrayList`.

// 26. **Create ArrayList from User Input**
// Read `n` integers from user input and store them in an `ArrayList`.

// 27. **Compare Two ArrayLists**
// Compare two `ArrayList`s and print the common elements.

// 28. **Print Even Numbers Only**
// From an `ArrayList` of integers, print only the even numbers.

// 29. **Print Odd Numbers Only**
// From an `ArrayList` of integers, print only the odd numbers.

// 30. **Replace All Elements with Square**
// Replace each number in an `ArrayList` with its square.
