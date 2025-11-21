public class ThirdTen {

    // year is leap or not
    public static boolean isLeap(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )? true : false;
    }

    public static void main(String[] args) {
        System.out.println("Year [1996] :: "+isLeap(1996));
    }
}

/* Question to solve
21. Write a program to find the second largest element in an array.
22. Write a program to check if two strings are anagrams.
23. Write a program to print all prime numbers between 1 and 100.
24. Write a program to find the sum of digits of a number.
25. Write a program to check if a year is a leap year.
26. Write a program to find the average of elements in an array.
27. Write a program to remove duplicate elements from an array.
28. Write a program to convert a decimal number to binary.
29. Write a program to find the frequency of each character in a string.
30. Write a program to merge two arrays.
 */
