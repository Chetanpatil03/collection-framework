//Counting Character Occurrences in a String
//Classic use case for interviews.
import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);
        // Output: {p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}
    }
}
