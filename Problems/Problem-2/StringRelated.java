import java.util.Arrays;

public class StringRelated {

    // Check if a string contains only digits.
    public static void isOnlyDigits(String str){
        try {
            int i = Integer.parseInt(str);
            System.out.println("Converted integer: " + i); // Output: Converted integer: 123
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format for input: " + str);
            e.printStackTrace();
        }
    }

    // Remove all white spaces from a string.
    public static String removeAllWhiteSpaces(String str){
        return str.replace(" ", "").toString();
    }

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

    //Reverse a string without using built-in functions
    public static String revString(String str){
        char [] arr = str.toLowerCase().toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return new String(arr);
    }


    public static void main(String[] args) {
        System.out.println("Longest word :: "+longestWord("Chetan bachchhav mca"));
        System.out.println("String without white spaces :: "+removeAllWhiteSpaces("Chetan bachhav 1 2 3"));

        System.out.println("Reversed string :: "+revString("Chetan"));
    }
}

/*
# 🧵 **String Coding Questions**

-- 1. Reverse a string without using built-in functions.
2. Count occurrences of each character in a string.
-- 3. Check if two strings are anagrams.
-- 4. Remove all white spaces from a string.
5. Find the first non-repeating character in a string.
6. Find duplicate characters in a string.
-- 7. Check if a string contains only digits.
-- 8. Convert a string to a number without using built-in parsing.
-- 9. Find the longest word in a sentence.
10. Capitalize the first letter of each word.
 */
