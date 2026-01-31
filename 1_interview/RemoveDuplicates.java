import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("After removing Duplicates :: "+removeDuplicateString("bachchhav"));
    }

    public static String removeDuplicateString(String str){
        StringBuffer sb = new StringBuffer();
        HashSet<Character> exist = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!exist.contains(c)) {
                exist.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
