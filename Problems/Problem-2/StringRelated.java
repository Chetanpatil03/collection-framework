import java.util.Arrays;

public class StringRelated {

    public static boolean isAnagrams(String str_one,String str_two){
        char [] arr_one = str_one.toCharArray();
        char [] arr_two = str_two.toCharArray();
        Arrays.sort(arr_one);
        Arrays.sort(arr_two);
        
        if(arr_one.length != arr_two.length) return false;
        return Arrays.equals(arr_one, arr_two);

    }

    // longest word in string
    public static String longestWord(String string){
        String [] arr = string.split(" ");
        String temp = arr[0];
        for (String str : arr) {
            if (str.length() >= temp.length()) temp = str;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println("Longest word :: "+longestWord("Chetan bachchhav mca"));
    }
}

/*
# 🧵 **String Coding Questions**

1. Reverse a string without using built-in functions.
2. Count occurrences of each character in a string.
-- 3. Check if two strings are anagrams.
4. Remove all white spaces from a string.
5. Find the first non-repeating character in a string.
6. Find duplicate characters in a string.
7. Check if a string contains only digits.
8. Convert a string to a number without using built-in parsing.
-- 9. Find the longest word in a sentence.
10. Capitalize the first letter of each word.
 */
