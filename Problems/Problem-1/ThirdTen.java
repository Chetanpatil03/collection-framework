import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ThirdTen {

    // year is leap or not
    public static boolean isLeap(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )? true : false;
    }

    // average of array elements
    public static void arrayAverage(int [] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        System.out.println("Average of array :: "+sum/arr.length);
    }

    // finding is prime
    public static boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void printingPrime(){
        for (int i = 1; i < 100; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }

    // finding if two strings are anagrams 
    public static boolean stringAnagrams(String s_one, String s_two){
        char [] arr_one = s_one.toCharArray();
        char [] arr_two = s_two.toCharArray();
        
        Arrays.sort(arr_one);
        Arrays.sort(arr_two);
        
        boolean flag = true;
        
        if (arr_one.length == arr_two.length) {
            for (int i = 0; i < arr_two.length; i++) {
                if (!(arr_one[i] == arr_two[i])) {
                    flag = false;
                }
            }
        }
        else{
            flag = false;
        }
        
        return flag;
    }
    
    // optimized approch
    public static boolean stringAnagrams_optimized(String s_one, String s_two){
        if (s_one.length() == s_two.length()) return false;

        // convert to char array
        char[] arr_one = s_one.toCharArray();
        char[] arr_two = s_two.toCharArray();

        // sort the arrays
        Arrays.sort(arr_one);
        Arrays.sort(arr_two);

        // compare and return
        return Arrays.equals(arr_one, arr_two);
    }

    // merge two array
    public static int[] mergeArray(int [] arr1, int []arr2){
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                                     .toArray();
    }




    public static void main(String[] args) {
        // System.out.println("Year [1996] :: "+isLeap(1996));
        // arrayAverage(new int[]{15,4,95,67,95,36,76,24,38,62});
        // printingPrime();

        System.out.println("String anagram :: {listen}{silent} :: "+stringAnagrams("silent", "listen"));
    }
}

/* Question to solve
21. Write a program to find the second largest element in an array.
-- 22. Write a program to check if two strings are anagrams.
-- 23. Write a program to print all prime numbers between 1 and 100.
24. Write a program to find the sum of digits of a number.
-- 25. Write a program to check if a year is a leap year.
-- 26. Write a program to find the average of elements in an array.
27. Write a program to remove duplicate elements from an array.
28. Write a program to convert a decimal number to binary.
29. Write a program to find the frequency of each character in a string.
30. Write a program to merge two arrays.
 */
