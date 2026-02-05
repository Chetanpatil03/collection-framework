import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
    public static void main(String[] args) {
        List<String> list = List.of("Chetan","Bachchhav","Chetan","Patil","Chetan");

        System.out.println("Original List :: "+list);

        Set<String> set = new HashSet<>(list);
        System.out.println("Set :: "+set);

        List<String> setList = new ArrayList<>(set);
        System.out.println("List :: "+new ArrayList<>(setList));
    }
}
