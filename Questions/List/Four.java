package Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Four {
    // private static Object clone;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter five elements : ");
        numbers.add(sc.nextInt());
        numbers.add(sc.nextInt());
        numbers.add(sc.nextInt());
        numbers.add(sc.nextInt());
        numbers.add(sc.nextInt());

        System.out.println("Elements");
        numbers.forEach(x-> System.out.print(x+", "));

        //eleven
        System.out.println("\nEnter element to add at second index : " );
        numbers.add(2,sc.nextInt());

        System.out.println("Updated List : "+numbers);

        //thirteen
        ArrayList<Integer> clone = new ArrayList<>(numbers);
        System.out.println("Copied List : " + clone);

        //fourteen
        System.out.println("Enter element to find its index : ");
        System.out.println("index of element : "+numbers.indexOf(sc.nextInt()));

        //twelve
        numbers.clear();

        //fifteen
        System.out.println(numbers.isEmpty() ? "The list is empty":"The list is not empty");
    }
}

// 11. **Insert Element at Specific Index**
//     Insert an element at index 2 in an `ArrayList` of Strings.

// 12. **Clear an ArrayList**
//     Remove all elements from an `ArrayList` using `.clear()`.

// 13. **Copy One ArrayList to Another**
//     Copy all elements from one `ArrayList` to another.

// 14. **Find Index of an Element**
//     Find the index of a given element in an `ArrayList`.

// 15. **Check if ArrayList is Empty**
//     Write a program to check if an `ArrayList` is empty or not.
