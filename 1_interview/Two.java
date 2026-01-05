import java.util.Arrays;
import java.util.stream.Stream;

public class Two {
    public static void main(String[] args) {
        int[] arr = {12,52,68,95,6,86,9,6,76,54,25,85,68};
        max(arr);

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Max : "+max);
    }
    
    public static void max(int [] arr){
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Largest element :: "+max);
    }
}
