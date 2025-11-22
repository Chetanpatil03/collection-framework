package Random;
import java.util.Arrays;
import java.util.HashSet;


public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = {15,6,8,6,9,6,58,69,68,94,27,31,89,46};
        System.out.print("Original :: ");
        Arrays.stream(arr).forEach(x -> System.out.print(x+" "));
        System.out.println();

        HashSet<Integer> set = new HashSet<>();
        for (Integer i : arr) {
            set.add(i);
        }

        System.out.println("After removing Duplicates :: ");
        System.out.print("Arrays   :: ");
        set.forEach(x -> System.out.print(x + " "));
        System.out.println();


    }
}
