package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Seven {

    //problem number 27 
    public static void commonElements(ArrayList<Integer> list, ArrayList<Integer> list2){
        System.out.println("Common elements : ");
        for(Integer i : list){
            System.out.print(list2.contains(i) ? i+" " : "");
        }
    }

    //problem number 26
    public static ArrayList<Integer> usrInp() {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element : ");
            list.add(sc.nextInt());
        }

        return list;
    }

    // problem number 28
    public static void printEven(ArrayList<Integer> list) {
        System.out.println("Even Numbers : ");
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                System.out.print(" " + integer);
            }
        }
        System.out.println();
    }

    //problem number 29
    public static void printOdd(ArrayList<Integer> list) {
        System.out.println("Odd Numbers : ");
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                System.out.print(" " + integer);
            }
        }
        System.out.println();
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

        // System.out.println("User input : "+usrInp());

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println("List 1 : "+list);
        System.out.println("List 2 : "+list2);

        commonElements(list, list2);    

    }
}


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
