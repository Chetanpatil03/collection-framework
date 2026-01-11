import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String string = "swiss";
        System.out.println("First Non Repeating Character :: "+FirstNonRepeatingChar(string));
        // System.out.println("First Non Repeating Character :: "+firstNonRepeatedChar(string));
    }

    public static char FirstNonRepeatingChar(String str){
        char [] charArray = str.toCharArray();
        // System.out.println("Array :: "+charArray);

        Map<Character, Integer> count = new LinkedHashMap<>();

        for (char c : charArray) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (HashMap.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0';
    }
}
