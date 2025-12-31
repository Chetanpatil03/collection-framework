
public class Strings {
    
    public static String mySubString(String string, int startIndex, int endIndex){
        char [] charArray = string.toCharArray();
        String updated ="";

        for (int i = startIndex; i < endIndex; i++) {
            updated += charArray[i];
        }

        return updated;
    }

    public static void main(String[] args) {
        String name = "Chetan chudaman bachchhav";
        System.out.println("Substring :: "+mySubString(name, 0, 6));
        System.out.println("Substring :: "+mySubString(name, 7, 15));
        System.out.println("Substring :: "+mySubString(name, 16, name.length()));

    }
    
}

/*
-- 6. Implement your own `substring()` method.
7. Check if a string is a valid palindrome after removing non-alphanumeric characters.
8. Longest palindrome substring (medium difficulty).
9. Check if two strings are isomorphic.
10. Compress a string (e.g., aaabb → a3b2).

*/
