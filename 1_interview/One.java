import java.util.Arrays;

public class One {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};
        int sum = sum(arr);
        System.out.println("Sum of array Elements :: "+sum);
        System.out.println("Sum of array Elements :: "+sumInteger(arr));
    }

    public static int sum(int []arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static Integer sumInteger(int []arr){
        return Arrays.stream(arr).sum(); 
    }


}