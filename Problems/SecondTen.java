
/*
-- 11. Write a program to find the smallest element in an array.
-- 12. Write a program to sort an array in ascending order.
13. Write a program to find the GCD of two numbers.
-- 14. Write a program to check if a number is prime.
-- 15. Write a program to generate Fibonacci series up to n terms.
-- 16. Write a program to swap two numbers without using a temporary variable.
-- 17. Write a program to find the length of a string.
18. Write a program to convert Celsius to Fahrenheit.
19. Write a program to count the number of words in a sentence.
20. Write a program to remove all white spaces from a string.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class SecondTen {
    // question-- 11
    public static int smallestElement(int []arr){
       int min = 0;
       for (int i : arr) if (i < min) min = i;
       return min;
    }

    // way two -- find out smallest element in array
    public static int smallestEle(Integer []arr){
        int min = new ArrayList<Integer>(Arrays.asList(arr)).stream().min(null).get();
        return min;
    }

    // shortest/easiest way to sort array
    public static int [] sortArray(int []arr){
        Arrays.sort(arr);
        return arr;
    }

    // bubble sort
    public static int [] sortArray_B(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // number if prime of not
    public static boolean isPrime(int a){
        return a % 2 == 0;
    }

    // number if prime of not -- way two
    public static String isPrime_B(int a){
        return a % 2 == 0 ? "Prime" : "Not a prime";
    }

    // finding fibbonacci series
    public static ArrayList<Integer> fibSeries(int n){
        int a = 0, b = 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(a);

            // calculate next
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }

        return arrayList;
    }

    // without using third variable -- to swap numbers
    public static void swapNumbers(int a, int b){
        System.out.println("Before :: "+a+", "+b);
        b = b - a;
        a = a + b;
        b = a - b;
        System.out.println("After :: "+a+", "+b);
    }

    // finding length of string
    public static int stringLength(String string){
        return string.length();
    }


    // count words in string
    public static int countWords(String str){
        return str.trim().split(" ").length;
    }
    public static void main(String[] args) {
        int [] arr = {15,9,5,9,7,5,1,95,67,74};
        System.out.print("Before :: ");
        for (int i : arr) System.out.print(i+" ");
        arr = sortArray(arr);
        System.out.print("\nAfter :: ");
        for (int i : arr) System.out.print(i+" ");

        System.out.println("Fibb series :: "+fibSeries(10));
        swapNumbers(10,20);

        System.out.println("words in string :: "+countWords("Chetan chudaman patil"));
    }

}
