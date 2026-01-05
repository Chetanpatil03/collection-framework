import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        int[] arr = {12,52,68,95,6,86,9,6,76,54,25,85,68};
        max(arr);

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Max : "+max);

        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Min :: "+min);

        min(arr);
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
    public static void min(int [] arr){
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Smallest element :: "+min);
    }


}
